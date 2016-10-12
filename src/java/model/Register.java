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
 * @author int303
 */
public class Register {

    private String username;
    private String password;
    private String repassword;
    private String fname;
    private String lname;
    private String email;
    private String tel;

    public Register() {
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

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Register{" + "username=" + username + ", password=" + password + ", repassword=" + repassword + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", tel=" + tel + '}';
    }

    public static int signUp(String username, String password, String fname, String lname, String email, String tel) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuilder.getCon();
        PreparedStatement pst = con.prepareStatement("insert into account (username,password,fname,lname,email,tel) values (?,?,?,?,?,?)");
        
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, fname);
        pst.setString(4, lname);
        pst.setString(5, email);
        pst.setString(6, tel);
        return pst.executeUpdate();
    }

}
