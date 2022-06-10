/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.chitietsachDAO;
import Model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "deleteservlet", urlPatterns = {"/deleteservlet"})
public class deleteservlet extends HttpServlet {
    private chitietsachDAO db;
    public deleteservlet() throws SQLException{
        this.db= new  chitietsachDAO();
    }
   
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String code= request.getParameter("txtiD");
            Book b=db.getBook(code);
            request.setAttribute("b", b);
            request.getRequestDispatcher("/viewdelete.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(chitietsachservlet.class.getName()).log(Level.SEVERE, null, ex);
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
