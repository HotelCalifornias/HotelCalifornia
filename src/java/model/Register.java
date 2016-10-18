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
    
    public Register(String username, String password, String repassword, String fname, String lname, String email, String tel){
      this.username = username;
      this.password = password;
      this.repassword = repassword;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.tel = tel;
    }

    public void setUsername(String username){
      this.username = username;
    }
    
    public String getUsername(){
      return this.username;
    }
    
    public void setPassword(String password){
      this.password = password;
    }
    
    public String getPassword(){
      return this.password;
      
      
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

<<<<<<< HEAD
    
=======
  @Override
  public String toString() {
    return "Register{" + "username=" + username + ", password=" + password + ", repassword=" + repassword + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", tel=" + tel + '}';
  }
    
    

 
>>>>>>> d5bb4e82cdbf71e210c36b1e7186610daa353961

    public static int signUp(int id,String username, String password) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuilder.getCon();
        PreparedStatement pst = con.prepareStatement("insert into login (id,username,password) values (?,?,?)");
        
        pst.setInt(1, id);
        pst.setString(2, username);
        pst.setString(3, password);
        return pst.executeUpdate();
        
    }
    
  }


