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
        String day = request.getParameter("days");
        int days = Integer.parseInt(day);
        int food = 0;
        int food2 = 0;
        int twin = 0;
        int large = 0;
        if(check1 != null){
            food = 500;
            session.setAttribute("ftype", food);
        }
        else{
            session.setAttribute("ftype", "-");
        }
        if(check2 != null){
            food2 = 500;
            session.setAttribute("f2type", food2);
        }
        else{
            session.setAttribute("f2type", "-");
        }
        if(check3 != null){
            twin = 100;
            session.setAttribute("twin", twin);
        }
        else{
            session.setAttribute("twin", "-");
        }
        if(check4 != null){
            large = 100;
            session.setAttribute("large", large);
        }
        else{
            session.setAttribute("large", "-");
        }
        
        int total = food+food2+twin+large;
        
        int totalPrice = 0;
        int rPrice = Integer.parseInt(roomPrice);
//        int sPrice = Integer.parseInt(servicePrice);
        
        if (session.getAttribute("roomsDe") != null) {
            Reservation price = new Reservation();
            totalPrice = price.calculateTotalPrice(days,rPrice, total);
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
