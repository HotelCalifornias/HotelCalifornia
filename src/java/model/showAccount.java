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
public class showAccount {

    private int accountId;
    private String fname;
    private String lname;
    private String email;
    private String address;

    public showAccount() {
    }

    public showAccount(int accountId, String fname, String lname, String email, String address) {
        this.accountId = accountId;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
    }

    public showAccount(ResultSet rs) throws SQLException {
        this.accountId = rs.getInt("accountId");
        this.fname = rs.getString("fname");
        this.lname = rs.getString("lname");
        this.email = rs.getString("email");
        this.address = rs.getString("address");
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
    
    public static List<showAccount> findAccount() {
        List<showAccount> ac = null;
        showAccount a = null;

        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from accounts");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                a = new showAccount(rs);
                if (ac == null) {
                    ac = new ArrayList();
                }
                ac.add(a);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return ac;
    }

}
