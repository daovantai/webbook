/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.User;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAN TAI
 */
public class quanlidocgiaDAO {
    private Connection conn;
    private ResultSet rs;
    public quanlidocgiaDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quanlidocgiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public List<User> getUser() throws SQLException, ParseException{
        List<User> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM Taikhoan"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            User p = new User();
            String hoten = rs.getString("Hovaten");
            String tendn = rs.getString("Tendn");
            String email= rs.getString("Email");
            String sdt=rs.getString("sdt");
            
            p.setHovaten(hoten);
            p.setTendn(tendn);
            p.setEmail(email);
            p.setSdt(sdt);
            
            
            list.add(p);
        }
        
        return list;
    }
}
