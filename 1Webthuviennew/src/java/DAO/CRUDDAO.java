/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Book;
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


public class CRUDDAO {
    private Connection conn;
    private ResultSet rs;
    public Book get;
    public CRUDDAO() throws SQLServerException, SQLException{
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
    public void update(String masach, String tensach, String tacgia,String nxb,String theloai,String code1) throws SQLException{
        String ISSql = "UPDATE Khosach SET masach=?, tensach=?, tacgia=? ,nxb=? ,theloai= ? WHERE masach=?";
                
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, masach);
        ps.setString(2, tensach);
        ps.setString(3, tacgia);
        ps.setString(4, nxb);
        ps.setString(5, theloai);
        ps.setString(6, code1);
        ps.executeUpdate();
       
    }
    public void delete(String code) throws SQLException{
        String ISSql = "delete from Khosach where masach=? ";
       
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, code);
       
       ps.executeUpdate();
       
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
    public void insert(Book p) throws SQLException{
        String Sql = "INSERT INTO Khosach"
                + " (masach, tensach, tacgia,nxb,theloai,tinhtrang) VALUES "
                + "(?,?,?,?,?,?);";
       
       PreparedStatement ps = conn.prepareStatement(Sql);
       ps.setString(1, p.getMasach());
       ps.setString(2, p.getTensach());
       ps.setString(3, p.getTacgia());
       ps.setString(4, p.getNxb());
       ps.setString(5, p.getNamxb());
       ps.setString(6, p.getTinhtrang());
       
       System.out.println(ps);
       ps.executeUpdate();
       
    }
    public void deleteuser(String code) throws SQLException{
        String ISSql = "delete from Taikhoan where Hovaten=? ";
       
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, code);
       
       ps.executeUpdate();
       
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
