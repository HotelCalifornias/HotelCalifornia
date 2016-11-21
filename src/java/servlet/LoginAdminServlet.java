package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author PT
 */
public class LoginAdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Login l = new Login();
        HttpSession session = request.getSession(false);
        List<Login> ll = Login.UserLogin(username, password);
        List<Search> rooms = Search.findByRoomName();
        List<countReservation> count = countReservation.count();
        List<toTalaccount> total = toTalaccount.total();
        if (rooms != null && count != null && total != null) {
            session.setAttribute("rooms", rooms);
            session.setAttribute("counts", count);
            session.setAttribute("totals", total);
            request.setAttribute("room", rooms);
            request.setAttribute("count", count);
            request.setAttribute("total", total);
            session.setAttribute("roomid",rooms.get(0).getRoomId());

        }
        if (session.getAttribute("login2") == null) {
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
//          if (l.checkLogin(username,password)){
//                session.setAttribute("username", ll.get(0).getUsername());
                session.setAttribute("login2", ll);
                request.setAttribute("Success", ll);
            }else{
                String message = "You're not an Admin!";
                request.setAttribute("message", message);
            }
        }
        List<SearchHotelRooms> room2 = SearchHotelRooms.findEmtry();
        if (room2 == null) {
            request.setAttribute("message", "Room dose not exist!");
        } else {
            session.setAttribute("roomH", room2);
            request.setAttribute("roomsH", room2);
        }

        List<showAccount> account = showAccount.findAccount();
        if (account == null) {
            request.setAttribute("message", "Null Account");
        } else {
            session.setAttribute("account", account);
            request.setAttribute("accounts", account);
        }
        List<ReserRoom> rr = ReserRoom.findRoomsInUse();
        if (rr == null) {
            request.setAttribute("message", "Null ReservationRoom");
        } else {
            session.setAttribute("reserRoom", rr);
            request.setAttribute("rrr", rr);
        }
        getServletContext().getRequestDispatcher("/Admin.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
