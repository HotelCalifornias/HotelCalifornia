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
import model.Search;
import model.SearchHotelRooms;

/**
 *
 * @author Student Lab
 */
public class InsertRoomServlet extends HttpServlet {

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
        String roomName = request.getParameter("iren");
        String roomDes = request.getParameter("ired");
        String[] type = request.getParameterValues("iret");
        int roomType = 0;
        String price = request.getParameter("irep");
        String capacity = request.getParameter("irec");
        int roomPrice = Integer.parseInt(price);
        int rCapacity = Integer.parseInt(capacity);
        if(type[0].equals("1")){
            roomType = 1;
        }
        else if(type[0].equals("2")){
            roomType = 2;
        }
        SearchHotelRooms s = new SearchHotelRooms();
        s.insertNewRoom(roomName, rCapacity, roomType, roomPrice, roomDes);
        List<Search> rooms = Search.findByRoomName();
        if (rooms != null) {
            session.setAttribute("rooms", rooms);
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
