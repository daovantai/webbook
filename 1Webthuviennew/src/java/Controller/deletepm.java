/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPhieumuon;
import Model.Book;
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
@WebServlet(name = "deletepm", urlPatterns = {"/deletepm"})
public class deletepm extends HttpServlet {
    private DAOPhieumuon db;
    public deletepm() throws SQLException{
        this.db= new   DAOPhieumuon();
    }
    
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code= request.getParameter("txtid");
        try {
            db.delete(code);
            List<phieumuon> listBook =db.getpm();
            request.setAttribute("listBook", listBook);
            getServletContext().getRequestDispatcher("/quanliphieumuon.jsp").forward(request, response); 
 
        } catch (SQLException ex) {
            Logger.getLogger(deleteuser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(deleteuser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
