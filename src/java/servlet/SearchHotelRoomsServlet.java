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
import model.Reservation;
import model.SearchHotelRooms;
import org.joda.time.DateTime;

/**
 *
 * @author Saraf
 */
public class SearchHotelRoomsServlet extends HttpServlet {

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
        
        String start = request.getParameter("start_date");
        String end = request.getParameter("end_date");
        String[] type = request.getParameterValues("rtype");
        int roomType = 0;
        DateTime startDate = DateTime.parse(start);
        DateTime endDate = DateTime.parse(end);
        int totalDays = 0;
        Reservation res = new Reservation();
        totalDays = res.countDate(startDate, endDate);
        
        HttpSession session = request.getSession(true);
        if(start == null && end == null){
            start = "";
            end = "";
        }
        if(type[0].equals("1")){
            roomType = 1;
        }
        else if(type[0].equals("2")){
            roomType = 2;
        }
        List<SearchHotelRooms> rooms = SearchHotelRooms.findByDate(start, end, roomType);
        if(rooms == null){
            request.setAttribute("messageEmtry", "Room dose not exist!");
        }else{
            session.setAttribute("room", rooms);
            request.setAttribute("rooms", rooms);
            session.setAttribute("stringDateStart",start);
            session.setAttribute("stringDateEnd", end);
            session.setAttribute("days", totalDays);
        }
        getServletContext().getRequestDispatcher("/SearchRooms.jsp").forward(request, response);
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
