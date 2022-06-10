/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.quanlisachDAO;
import Model.Book;
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
@WebServlet(name = "quanlisachthuthu", urlPatterns = {"/quanlisachthuthu"})
public class quanlisachthuthu extends HttpServlet {
    private final quanlisachDAO db;
    public quanlisachthuthu() throws SQLException{
        this.db=new quanlisachDAO();
    }
        
    
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            List<Book> listBook=db.getBook();
            request.setAttribute("listBook", listBook);
            request.getRequestDispatcher("/quanlisach.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(thuvienservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(thuvienservlet.class.getName()).log(Level.SEVERE, null, ex);
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
