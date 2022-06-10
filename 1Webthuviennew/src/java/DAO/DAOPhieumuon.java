/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.phieumuon;
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
 * @author Admin
 */
public class DAOPhieumuon {
    private Connection conn;
    private ResultSet rs;
    public DAOPhieumuon() throws SQLServerException, SQLException{
        try {       
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOPhieumuon.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public int taoPhieu(phieumuon pm) throws SQLException, ParseException{
        String sql = "INSERT INTO phieumuon (id, tendn, masach, tensach) VALUES (?,?,?,?);";
        String ISSql = "INSERT INTO phieumuon"
                + " (id, tendn, masach, tensach) VALUES "
                + "(?,?,?,?);";
        int res = 0;
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(4, pm.getId());
        ps.setString(1, pm.getTendn());
        ps.setString(2, pm.getMasach());
        ps.setString(3, pm.getTensach());
        
        
        res = ps.executeUpdate();
        return res;
    }
public void delete(String code) throws SQLException{
        String ISSql = "delete from phieumuon where id=? ";
       
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, code);
       
       ps.executeUpdate();
       
    }
    public List<phieumuon> getpm() throws SQLException, ParseException{
        List<phieumuon> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM phieumuon"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            phieumuon p = new phieumuon();
            String id = rs.getString("id");
            String tensach = rs.getString("tendn");
            String masach = rs.getString("masach");
            
            String nxb=rs.getString("tensach");
           
            p.setId(id);
            p.setMasach(masach);
            p.setTendn(nxb);
            p.setTensach(tensach);
           
            
            list.add(p);
        }
        
        return list;
    }
//    public void UpdateLm(String n) throws SQLException{
//        String ISSql = "UPDATE tbl_Taikhoan\n"
//                + "SET luotMuon=luotMuon-1 WHERE tenDn=? ";
//        PreparedStatement ps = conn.prepareStatement(ISSql);
//        ps.setString(1, n);
//        ps.executeUpdate();
//    }
//    public void UpdateSoSach(String n) throws SQLException{
//        String ISSql = "UPDATE tbl_Book\n"
//                + "SET soLuongCon=soLuongCon-1 WHERE iD=? ";
//        PreparedStatement ps = conn.prepareStatement(ISSql);
//        ps.setString(1, n);
//        ps.executeUpdate();
//    }
//    public int LaySL(String s) throws SQLException{
//        int sl = 0;
//        String ISSql = "SELECT soLuongCon FROM tbl_Book WHERE iD=? ";
//        
//        PreparedStatement ps = conn.prepareStatement(ISSql);
//        ps.setString(1, s);
//        rs = ps.executeQuery();
//        while(rs.next()){
//             sl = rs.getInt("soLuongCon");
//            
//        }
//        return sl;
//    }
//    public int LayLM(String s) throws SQLException{
//        int lm = 0;
//        String ISSql = "SELECT luotMuon FROM tbl_Taikhoan WHERE tenDn=? ";
//        
//        PreparedStatement ps = conn.prepareStatement(ISSql);
//        ps.setString(1, s);
//        rs = ps.executeQuery();
//        while(rs.next()){
//             lm = rs.getInt("luotMuon");
//            
//        }
//        return lm;
//    }
    public static void main(String[] args) throws SQLException {
        DAOPhieumuon d= new DAOPhieumuon();
    }
}    
