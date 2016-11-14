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
public class DetailRoom {
    private int roomId;
    private String roomName;
    private int capacity;
    private int type;
    private String roomDes;
    private int price;

    public DetailRoom() {
    }
    
    public DetailRoom(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("roomId");
        this.roomName = rs.getString("roomName");
        this.capacity = rs.getInt("capacity");
        this.type = rs.getInt("type");
        this.roomDes = rs.getString("roomDes");
        this.price = rs.getInt("price");
    }
    
    public DetailRoom(int roomId, String roomName, int capacity, int type, String roomDes, int price) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.type = type;
        this.roomDes = roomDes;
        this.price = price;
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
    
    public static List<DetailRoom> findByRoom(String roomId){
        List<DetailRoom> rooms = null;
        DetailRoom r = null;

        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM rooms where roomId = ?");
            pstm.setString(1, roomId);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                r = new DetailRoom(rs);
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
}
