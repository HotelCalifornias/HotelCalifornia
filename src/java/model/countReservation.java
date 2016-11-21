/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PT
 */
public class countReservation {
    private int reservationId;
    private int roomId;
    private String dateFrom;
    private String dateTo;
    private int totalPrice;
    private String status;

    public countReservation() {
    }

    public countReservation(int reservationId, int roomId, String dateFrom, String dateTo, int totalPrice) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.totalPrice = totalPrice;
    }
    
    public countReservation(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("roomId");
        this.reservationId = rs.getInt("reservationId");
        this.dateFrom = rs.getString("date_from");
        this.dateTo = rs.getString("date_to");
        this.totalPrice = rs.getInt("totalprice");
        this.status = rs.getString("status");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public static List<countReservation> count(){
        List<countReservation> countRe = null;
        countReservation r = null;

        Connection conn = ConnectionBuilder.getCon();
         try {
            PreparedStatement pstm = conn.prepareStatement("select * from reservation");
//            pstm.setString(1, param+"%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                r = new countReservation(rs);
                if (countRe == null) {
                    countRe = new ArrayList();
                }
                countRe.add(r);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return countRe;
    }
}
