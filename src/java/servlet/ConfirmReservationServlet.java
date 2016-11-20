/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DetailRoom;
import model.Reservation;
import model.SendMail;

/**
 *
 * @author Saraf
 */
@WebServlet(name = "ConfirmReservationServlet", urlPatterns = {"/ConfirmReservation"})
public class ConfirmReservationServlet extends HttpServlet {

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
        String roomId = request.getParameter("roomId");
        String total = request.getParameter("t");
        int t = Integer.parseInt(total);
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        int rId = Integer.parseInt(roomId);
        if (session != null) {
            Reservation makeReserv = new Reservation();
            makeReserv.makeReservation(rId, startDate, endDate, t);
            String fname = request.getParameter("f");
            String lname = request.getParameter("l");
            String sendTo = request.getParameter("e");
            String roomName = request.getParameter("rn");
            String roomType = request.getParameter("rt");
            
            String capacity = request.getParameter("rc");
            String serv1 = "";
            if(session.getAttribute("ftype") != null){
                serv1 = "Yes";
            }else{
                serv1 = "No";
            }
            String serv2 = "";
            if(session.getAttribute("f2type") != null){
                serv2 = "Yes";
            }else{
                serv2 = "No";
            }
            String serv3 = "";
            if(session.getAttribute("twin") != null){
                serv3 = "Yes";
            }else{
                serv3 = "No";
            }
            String serv4 = "";
            if(session.getAttribute("large") != null){
                serv4 = "Yes";
            }else{
                serv4 = "No";
            }
            String dateStart = request.getParameter("startDate");
            String dateEnd = request.getParameter("endDate");
            String days = request.getParameter("d");
            String price = request.getParameter("t");
            String subject = "Hotel's Reservation";
            String message = "Hello ! "+fname+" "+lname
                +",\nThis Email has send from Hotel California Website."+"\n"
                +"We have confirmed your information about the room reservation."+"\n"
                +"Your confirmation contain the following information."+"\n"
                +"________________________________________________________________________\n"
                +"Room Detail : "+"\n"
                +"Room Number : "+roomName+"\n"
                +"Room Type : "+roomType+"\n"
                +"Room Capacity : "+capacity+"\n"
                +"________________________________________________________________________\n"
                +"Services Detail : "+"\n"
                +"Food : "+serv1+"\n"
                +"Food : "+serv2+"\n"
                +"Twins Beds : "+serv3+"\n"
                +"Large Bed : "+serv4+"\n"
                +"________________________________________________________________________\n"
                +"Reservation From "+dateStart+" to "+dateEnd+"\n"
                +"Total Reservation Days is "+days+"\n"
                +"Total Price : "+price+"\n"
                +"Thank you for choosing us.";
            
            if(sendTo != null && subject != null && message != null){                
                SendMail.send(sendTo, subject, message);
            }
        }
        getServletContext().getRequestDispatcher("/ReservationSuccess.jsp").forward(request, response);
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
