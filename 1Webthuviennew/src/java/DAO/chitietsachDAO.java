/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Book;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class chitietsachDAO {
    private Connection conn;
    private ResultSet rs;
    public chitietsachDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public Book getBook(String code) throws SQLException{
        Book b= new Book();
        String sql="select * from Khosach where masach=? ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, code);
        rs=ps.executeQuery();
        while(rs.next()){
            String ms = rs.getString("masach");
            String tensach = rs.getString("tensach");
            String tacgia = rs.getString("tacgia");
            String nhaxb=rs.getString("nxb");
            String namxb=rs.getString("theloai");
            String tt=rs.getString("tinhtrang");
            b.setMasach(ms);
            b.setTensach(tensach);
            b.setTacgia(tacgia);
            b.setNxb(nhaxb);
            b.setNamxb(namxb);
            b.setTinhtrang(tt);
        }
        return b;
    }
    
}
