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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAN TAI
 */
public class registerDAO {
     private Connection conn;
    private ResultSet rs;
    public registerDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qltv;"
                    + "username=sa;password=12345678");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public int Dangki(User user) throws SQLServerException, SQLException, ClassNotFoundException{
        String ISSql = "INSERT INTO Taikhoan"
                + " (Hovaten, Tendn, Email,sdt, Matkhau, Nlmk) VALUES "
                + "(?,?,?,?,?,?);";
        int res = 0;
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, user.getHovaten());
       ps.setString(2, user.getTendn());
       ps.setString(3, user.getEmail());
       ps.setString(4, user.getSdt());
       ps.setString(5, user.getMatkhau());
       ps.setString(6, user.getNmk());
       System.out.println(ps);
       res = ps.executeUpdate();
       return res;
    }
}
