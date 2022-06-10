/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
import Model.Book;

/**
 *
 * @author VAN TAI
 */
public class XemDAO {
    
    private Connection conn;
    private ResultSet rs;
    public XemDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public List<Book> getProducts() throws SQLException, ParseException{
        List<Book> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM Khosach"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            Book p = new Book();
            String ms = rs.getString("masach");
            String tensach = rs.getString("tensach");
            String tacgia = rs.getString("tacgia");
            String nhaxb=rs.getString("nxb");
            String namxb=rs.getString("theloai");
            String tt=rs.getString("tinhtrang");
            p.setMasach(ms);
            p.setTensach(tensach);
            p.setTacgia(tacgia);
            p.setNxb(nhaxb);
            p.setNamxb(namxb);
            p.setTinhtrang(tt);
            
            list.add(p);
        }
        
        return list;
    }
    
   
}



