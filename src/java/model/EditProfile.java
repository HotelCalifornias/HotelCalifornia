/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Saraf
 */
public class EditProfile {
    private int accountId;
    private String username;
    private String password;
    private String fname;
    private String lname;
    private String email;
    private String address;

    public EditProfile() {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "EditProfile{" + "accountId=" + accountId + ", username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address + '}';
    }
    
    public int editProfile(String fname, String lname, String email, String address, String username, String password) throws SQLException{
        Connection con = ConnectionBuilder.getCon();
        PreparedStatement pst = con.prepareStatement("UPDATE accounts SET fname = ?,lname = ?,email = ?,address = ? WHERE username = ? AND password = ?");
        pst.setString(1, fname);
        pst.setString(2, lname);
        pst.setString(3, email);
        pst.setString(4, address);
        pst.setString(5, username);
        pst.setString(6, password);
        return pst.executeUpdate();
    }
    
    public static void main(String[] args) throws SQLException {
        EditProfile ed = new EditProfile();
        Login l = new Login();
        String username = "admin";
        String password = "admin";
        if(l.checkLogin(username, password))
        System.out.println(ed.editProfile("New Admin", "New Admin", "Admin@mail.com", "123 Some Street",username,password));
        
    }
}
