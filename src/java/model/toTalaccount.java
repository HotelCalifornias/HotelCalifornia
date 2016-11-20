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
public class toTalaccount {
    private int accountId;

    public toTalaccount() {
    }

    public toTalaccount(int accountId) {
        this.accountId = accountId;
    }
    
    public toTalaccount(ResultSet rs) throws SQLException {
        this.accountId = rs.getInt("accountId");
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    public static List<toTalaccount> total(){
        List<toTalaccount> total = null;
        toTalaccount r = null;

        Connection conn = ConnectionBuilder.getCon();
         try {
            PreparedStatement pstm = conn.prepareStatement("select * from accounts");
//            pstm.setString(1, param+"%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                r = new toTalaccount(rs);
                if (total == null) {
                    total = new ArrayList();
                }
                total.add(r);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return total;
    }
}
