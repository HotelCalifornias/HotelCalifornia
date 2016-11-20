/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DetailRoom;
import model.Login;
import model.Reservation;

/**
 *
 * @author Saraf
 */
public class ReservationServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String servicePrice = request.getParameter("price");
        String roomPrice = request.getParameter("roomPrice");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String check1 = request.getParameter("check1");
        String check2 = request.getParameter("check2");
        String check3 = request.getParameter("check3");
        String check4 = request.getParameter("check4");
        int food = 0;
        int food2 = 0;
        int twin = 0;
        int large = 0;
        if(check1 != null){
            food = 500;
        }
        if(check2 != null){
            food2 = 500;
        }
        if(check3 != null){
            twin = 100;
        }
        if(check4 != null){
            large = 100;
        }
        
        int total = food+food2;
        System.out.println(total);
        
        int totalPrice = 0;
        int rPrice = Integer.parseInt(roomPrice);
//        int sPrice = Integer.parseInt(servicePrice);
        
        if (session.getAttribute("roomsDe") != null) {
            Reservation price = new Reservation();
            totalPrice = price.calculateTotalPrice(rPrice, total);
            if (session != null && session.getAttribute("login") != null) {
                Login l = new Login();
                username = l.getUsername();
                password = l.getPassword();
                if (session.getAttribute("roomServices") != null) {
                    Reservation r = new Reservation();
                    int serviceId = r.getServicesId();
//                    List<Reservation> reservation = Reservation.showUserDetail(username,password);

                    List<Reservation> reservationServices = Reservation.showServicesDetail(serviceId);

                    request.setAttribute("servicesChoose", reservationServices);

//                    session.setAttribute("account", reservation);
                }

            }
            session.setAttribute("totalPrice", totalPrice);
        }

        getServletContext().getRequestDispatcher("/Reservation.jsp").forward(request, response);

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
