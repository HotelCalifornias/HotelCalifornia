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
 * @author Student Lab
 */
public class SearchHotelRooms {
    private int roomId;
    private String roomNumber;
    private String roomType;
    private String roomFloor;
    private String roomDescription;
    private int roomPrice;

    public SearchHotelRooms() {
    }
    
    public SearchHotelRooms(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("roomID");
        this.roomNumber = rs.getString("roomNumber");
        this.roomType = rs.getString("roomType");
        this.roomFloor = rs.getString("roomFloor");
        this.roomDescription = rs.getString("roomDescription");
        this.roomPrice = rs.getInt("roomPrice");
    }

    public SearchHotelRooms(int roomId, String roomNumber, String roomType, String roomFloor, String roomDescription, int roomPrice) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.roomDescription = roomDescription;
        this.roomPrice = roomPrice;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(String roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    private static final String FIND_BY_NAME = "select * from rooms where roomnumber like ?";
    
    public static List<SearchHotelRooms> findByRoomName(String param) {
        List<SearchHotelRooms> rooms = null;
        SearchHotelRooms r = null;

        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_NAME);
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
    
    @Override
    public String toString() {
        return "SearchHotelRooms{" + "roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomFloor=" + roomFloor + ", roomDescription=" + roomDescription + ", roomPrice=" + roomPrice + '}';
    }
           
}
