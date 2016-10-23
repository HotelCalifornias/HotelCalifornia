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
            conn = DriverManager.getConnection("jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net/acsm_6a1a5740a3b05cf?useUnicode=true&characterEncoding=UTF-8","b81eb6dd3c81c4","52b81b4a");          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
        
    }
}
