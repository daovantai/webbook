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
import java.util.List;
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
@WebServlet(name = "quanliphieumuon", urlPatterns = {"/quanliphieumuon"})
public class quanliphieumuon extends HttpServlet {
    private final DAOPhieumuon  db;
    public quanliphieumuon() throws SQLException{
        this.db=new DAOPhieumuon();
    }
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            List<phieumuon> listBook=db.getpm();
            request.setAttribute("listBook", listBook);
            request.getRequestDispatcher("/quanliphieumuon.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(quanliphieumuon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(quanliphieumuon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
