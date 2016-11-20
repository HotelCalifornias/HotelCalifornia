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
public class Login {
    private int id;
    private String username;
    private String password;  
    private String fname;
    private String lname;
    private String email;
    private String address;
    
    public Login() {
    }
    
    private Login(ResultSet rs) throws SQLException{
        this.id = rs.getInt("accountId");
        this.username = rs.getString("username");
        this.password = rs.getString("password");
        this.fname = rs.getString("fname");
        this.lname = rs.getString("lname");
        this.email = rs.getString("email");
        this.address = rs.getString("address");
        
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
    
    public static List<Login> UserLogin(String paramU,String paramP){
        List<Login> user = null;
        Login l =null;
        
        Connection conn = ConnectionBuilder.getCon();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from accounts where username = ? and password = ?");
            pstm.setString(1, paramU);
            pstm.setString(2, paramP);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                l = new Login(rs);
                if(user == null){
                    user = new ArrayList();
                }
                user.add(l);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
    
    public boolean checkLogin(String username, String password){
        Connection conn = ConnectionBuilder.getCon();
        boolean check = false ;
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from accounts where username = ? and password = ?");
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                //if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                    check = true;
                }
                else{
                    check = false;
                }
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return check;
    }
    
    @Override
    public String toString() {
        return "Login"+"\n"+"Username : "+username+"\n"+"Password : "+password+"\n"+"ID : "+id+"\n";
    }
    
    public static void main(String[] args) {
        //List<Customer> customers = Customer.findByName(param);
//        Login l = new Login();
//        l.checkLogin("pentai","123456");
//        System.out.println(l);
        Login l = new Login();
        if(l.checkLogin("admin", "12345")){
            List<Login> ll = Login.UserLogin("admin", "12345");
            System.out.println("เข้าสู่ระบบสำเร็จ");
            System.out.println(ll);
        }
        else{
            System.out.println("พาสเวิร์ดหรือชื่อผู้ใช้ผิด");
        }
    }
}
