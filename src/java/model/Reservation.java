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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saraf
 */
public class Reservation {
    private int accountId;
    private int servicesId;
    private String fname;
    private String lname;
    private String email;
    private String address;
    private int roomId;
    private String roomName;
    private int capacity;
    private int roomType;
    private String roomTypeName;
    private int roomPrice;
    private String roomDes;
    private String date_from;
    private String date_to;
    private String serviceDes;
    private int servicePrice;

    public Reservation() {
    }

    public Reservation(int accountId, int servicesId, String fname, String lname, String email, String address, int roomId, String roomName, int capacity, int roomType, String roomTypeName, int roomPrice, String roomDes, String date_from, String date_to, String serviceDes, int servicePrice) {
        this.accountId = accountId;
        this.servicesId = servicesId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.roomType = roomType;
        this.roomTypeName = roomTypeName;
        this.roomPrice = roomPrice;
        this.roomDes = roomDes;
        this.date_from = date_from;
        this.date_to = date_to;
        this.serviceDes = serviceDes;
        this.servicePrice = servicePrice;
    }

    
    
    public int getServicesId() {
        return servicesId;
    }

    public void setServicesId(int servicesId) {
        this.servicesId = servicesId;
    }
    
   
    

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDes() {
        return roomDes;
    }

    public void setRoomDes(String roomDes) {
        this.roomDes = roomDes;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public String getServiceDes() {
        return serviceDes;
    }

    public void setServiceDes(String serviceDes) {
        this.serviceDes = serviceDes;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Override
    public String toString() {
        return "Reservation{" + "accountId=" + accountId + ", servicesId=" + servicesId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address + ", roomId=" + roomId + ", roomName=" + roomName + ", capacity=" + capacity + ", roomType=" + roomType + ", roomTypeName=" + roomTypeName + ", roomPrice=" + roomPrice + ", roomDes=" + roomDes + ", date_from=" + date_from + ", date_to=" + date_to + ", serviceDes=" + serviceDes + ", servicePrice=" + servicePrice + '}';
    }

    
    
    public static void ormForUserDetail(ResultSet rs, Reservation reserv) throws SQLException{
        reserv.setAccountId(rs.getInt("accountId"));
        reserv.setFname(rs.getString("fname"));
        reserv.setLname(rs.getString("lname"));
        reserv.setEmail(rs.getString("email"));
        reserv.setAddress(rs.getString("address"));
    }
    
    public static void ormForRoomDetail(ResultSet rs, Reservation reserv) throws SQLException{
        reserv.setRoomId(rs.getInt("roomId"));
        reserv.setRoomName(rs.getString("roomName"));
        reserv.setCapacity(rs.getInt("capacity"));
        reserv.setRoomDes(rs.getString("roomDes"));
        reserv.setRoomType(rs.getInt("type"));
        reserv.setRoomPrice(rs.getInt("price"));
    }
    
    public static void ormForServiceDetail(ResultSet rs, Reservation reserv) throws SQLException{
        reserv.setServicesId(rs.getInt("roomServicesId"));
        reserv.setServiceDes(rs.getString("roomServicesDescription"));
        reserv.setServicePrice(rs.getInt("roomServicesPrice"));
    }
    
    public static List<Reservation> showUserDetail(int accountId){
        Connection con = ConnectionBuilder.getCon();
        List<Reservation> reservation = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM ACCOUNTS WHERE ACCOUNTID = ?");
            pst.setInt(1, accountId);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Reservation r = new Reservation();
                ormForUserDetail(rs, r);
                reservation.add(r);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservation;
    }
    
    public static List<Reservation> showRoomDetail(int roomId){
        Connection con = ConnectionBuilder.getCon();
        List<Reservation> reservation = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM ROOMS WHERE ROOMID = ?");
            pst.setInt(1, roomId);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Reservation r = new Reservation();
                ormForRoomDetail(rs, r);
                reservation.add(r);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservation;
    }
    
    public static List<Reservation> showServicesDetail(int servicesId){
        Connection con = ConnectionBuilder.getCon();
        List<Reservation> reservation = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM ROOMSERVICES WHERE ROOMSERVICESID = ?");
            pst.setInt(1, servicesId);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Reservation r = new Reservation();
                ormForServiceDetail(rs, r);
                reservation.add(r);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservation;
    }
    
    public void makeReservation(int roomId, String date_from, String date_to, int totalPrice){
        Connection con = ConnectionBuilder.getCon();
        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO RESERVATION (ROOMID,DATE_FROM,DATE_TO,TOTALPRICE) VALUES (?,?,?,?)");
            pst.setInt(1, roomId);
            pst.setString(2, date_from);
            pst.setString(3, date_to);
            pst.setInt(4, totalPrice);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        List<Reservation> re = Reservation.showServicesDetail(1);
        System.out.println(re);
    }
    
}
