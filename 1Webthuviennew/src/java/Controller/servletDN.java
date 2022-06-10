/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.loginDAO;
import Model.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "servletDN", urlPatterns = {"/formDn"})
public class servletDN extends HttpServlet {
    private final loginDAO db;
    private String url;
    public servletDN() throws SQLException {
        this.db = new loginDAO();
    }
   
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Tendn = request.getParameter("Tendn");
        String Matkhau = request.getParameter("Matkhau");
        Login login = new Login();
        login.setUsername(Tendn);
        login.setPassword(Matkhau);
       if(Tendn.equals("admin")&&Matkhau.equals("123")){
        getServletContext().getRequestDispatcher("/thuthu.jsp").forward(request, response);   
       }
       else{
        try {
            
            if(db.layTK(login)){
                url = "/index.html";
            }
            else{
                url = "/Dangnhap.html";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        getServletContext().getRequestDispatcher(url).forward(request, response);   
       }
    }   
    

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
