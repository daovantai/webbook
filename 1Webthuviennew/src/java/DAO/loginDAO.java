/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Login;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author VAN TAI
 */
public class loginDAO {
     private Connection conn;
    private ResultSet rs;
    public loginDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public boolean layTK(Login s) throws SQLException{
        String sql = "SELECT*FROM Taikhoan WHERE Tendn=? AND Matkhau=? ";
        try{
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, s.getUsername());
               ps.setString(2, s.getPassword());
               rs = ps.executeQuery();
           } catch(Exception e){
               e.printStackTrace();
           }
        return rs.next();
       
    }
   
}
