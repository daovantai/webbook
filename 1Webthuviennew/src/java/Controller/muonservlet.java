/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPhieumuon;
import Model.phieumuon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "muonservlet", urlPatterns = {"/muonservlet"})
public class muonservlet extends HttpServlet {
   private DAOPhieumuon db;
    public muonservlet() throws SQLException{
        this.db= new  DAOPhieumuon();
    }
    
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String idsach= request.getParameter("txtiD");
      String tensach= request.getParameter("txtten");
      String tacgia= request.getParameter("txttg");
       String nxb= request.getParameter("txtnxb");
       
     phieumuon pm = new phieumuon( idsach,tensach, tacgia,nxb);
      try {
         db.taoPhieu(pm);
            
      } catch (SQLException ex) {
          Logger.getLogger(muonservlet.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ParseException ex) {
         Logger.getLogger(muonservlet.class.getName()).log(Level.SEVERE, null, ex);
       }
        response.sendRedirect("index.html");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//       String idsach= request.getParameter("txtiD");
//       String tensach= request.getParameter("txtten");
//       String tacgia= request.getParameter("txttg");
//       phieumuon pm = new phieumuon("", idsach,tensach, tacgia);
//       try {
//           db.taoPhieu(pm);
//       } catch (SQLException ex) {
//           Logger.getLogger(muonservlet.class.getName()).log(Level.SEVERE, null, ex);
//       } catch (ParseException ex) {
//           Logger.getLogger(muonservlet.class.getName()).log(Level.SEVERE, null, ex);
//       }
//       response.sendRedirect("index.html");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
