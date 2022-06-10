/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUDDAO;
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
@WebServlet(name = "addbookservlet", urlPatterns = {"/addbook"})
public class addbookservlet extends HttpServlet {
    private final CRUDDAO db;
    public addbookservlet() throws SQLException{
        this.db=new CRUDDAO();
    }
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String masach = request.getParameter("masach");
        String tensach = request.getParameter("tensach");
        String tacgia = request.getParameter("tacgia");
        String nxb = request.getParameter("nxb");
        String theloai = request.getParameter("theloai");
        String tinhtrang = "chưa mượn";
        Book b=new Book();
        b.setMasach(masach);
        b.setTensach(tensach);
        b.setTacgia(tacgia);
        b.setNxb(nxb);
        b.setNamxb(theloai);
        b.setTinhtrang(tinhtrang);
        try {
            db.insert(b);
            request.getRequestDispatcher("/addbook.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(addbookservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
