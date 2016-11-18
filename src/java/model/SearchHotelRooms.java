/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student Lab
 */
public class SearchHotelRooms {
    private int roomId;
    private String roomName;
    private int capacity;
    private int type;
    private String roomDes;
    private int price;

    public SearchHotelRooms() {
    }
    
    public SearchHotelRooms(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("roomId");
        this.roomName = rs.getString("roomName");
        this.capacity = rs.getInt("capacity");
        this.type = rs.getInt("type");
        this.roomDes = rs.getString("roomDes");
        this.price = rs.getInt("price");
    }

    public SearchHotelRooms(int roomId, String roomName, int capacity, int type, String roomDes, int price) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.type = type;
        this.roomDes = roomDes;
        this.price = price;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRoomDes() {
        return roomDes;
    }

    public void setRoomDes(String roomDes) {
        this.roomDes = roomDes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
   

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

   

//    private static final String FIND_BY_NAME = "select * from rooms where roomnumber like ?";
    
    public static List<SearchHotelRooms> findByRoomName(String param) {
        List<SearchHotelRooms> rooms = null;
        SearchHotelRooms r = null;

        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from hotelrooms where roomnumber like ?");
            pstm.setString(1, param + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                r = new SearchHotelRooms(rs);
                if (rooms == null) {
                    rooms = new ArrayList();
                }
                rooms.add(r);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rooms;
    }
    
    public static List<SearchHotelRooms> findRoomsInUse(){
        List<SearchHotelRooms> rooms = null;
        SearchHotelRooms r = null;
        Connection con = ConnectionBuilder.getCon();
        try {
            PreparedStatement pst = con.prepareStatement("select * from rooms where roomId in"
                    + " (select roomId from reservation)");
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                r = new SearchHotelRooms(rs);
                if(rooms == null){
                    rooms = new ArrayList();
                }
                rooms.add(r);
            }
            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rooms;
    }
    
    public static List<SearchHotelRooms> findByDate(String start, String end, int type){
        List<SearchHotelRooms> rooms = null;
        SearchHotelRooms r = null;

        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from rooms where roomId not in"
                    + "(select roomId from reservation where (date_from between ? and ?) or (date_to between ? and ?)) and type = ?");
            pstm.setString(1,  start);
            pstm.setString(2,  end);
            pstm.setString(3,  start);
            pstm.setString(4,  end);
            pstm.setInt(5, type);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                r = new SearchHotelRooms(rs);
                if (rooms == null) {
                    rooms = new ArrayList();
                }
                rooms.add(r);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rooms;
    }

    @Override
    public String toString() {
        return  "---------------\n"
                +"Room ID : "+roomId+"\n"
                +"Roon Name : "+roomName+"\n"
                +"Capacity : "+capacity+"\n"
                +"Room Type : "+type+"\n"
                +"Room Description : "+roomDes+"\n"
                +"Price : "+price+"\n"
                +"---------------\n";
    }
    
   
    public static void main(String[] args) {
        List<SearchHotelRooms> sh = (List)SearchHotelRooms.findByDate("2016-11-14","2016-11-16",1);
        System.out.println(sh);
    } 
}