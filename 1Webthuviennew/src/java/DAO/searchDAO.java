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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAN TAI
 */
public class searchDAO {
    private Connection conn;
    private ResultSet rs;
    public searchDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public List<Book> search(String name) {
        try {
            List<Book> list=new ArrayList<>();
            String sql="select * from Khosach where tensach like ? or tacgia like ? or nxb like ? or theloai like ? or masach like ? ";
           
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ps.setString(2,"%"+name+"%");
            ps.setString(3,"%"+name+"%");
            ps.setString(4,"%"+name+"%");
             ps.setString(5,"%"+name+"%");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Book book=new Book(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
                list.add(book);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
