/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PT
 */
public class ConnectionBuilder {
    
    public static Connection getCon(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://db4free.net/pentai?","penthaizza","123456");          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
        
    }
}
