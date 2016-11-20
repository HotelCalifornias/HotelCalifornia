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
public class ReserRoom {

    private int roomId;
    private String roomName;
    private int capacity;
    private int type;
    private String roomDes;
    private int price;

    public ReserRoom() {
    }
    
    public ReserRoom(ResultSet rs) throws SQLException {
        this.roomId = rs.getInt("roomId");
        this.roomName = rs.getString("roomName");
        this.capacity = rs.getInt("capacity");
        this.type = rs.getInt("type");
        this.roomDes = rs.getString("roomDes");
        this.price = rs.getInt("price");
    }

    public ReserRoom(int roomId, String roomName, int capacity, int type, String roomDes, int price) {
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
    
    public static List<ReserRoom> findRoomsInUse() {
        List<ReserRoom> rr = null;
        ReserRoom r = null;
        Connection con = ConnectionBuilder.getCon();
        try {
            PreparedStatement pst = con.prepareStatement("select * from rooms where roomId in (select roomId from reservation)");
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                r = new ReserRoom(rs);
                if (rr == null) {
                    rr = new ArrayList();
                }
                rr.add(r);
            }
            rs.close();
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rr;
    }
}
