/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.registerDAO;
import Model.User;
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
@WebServlet(name = "servletDK", urlPatterns = {"/formdk"})
public class servletDK extends HttpServlet {
    private final registerDAO db;
    private String url;

    public servletDK() throws SQLException {
        this.db = new registerDAO();
    }
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Hovaten = request.getParameter("Hovaten");
        String Tendn = request.getParameter("Tendn");
        String Email = request.getParameter("Email");
        String sdt = request.getParameter("sdt");
        String Matkhau = request.getParameter("Matkhau");
        String Nmk = request.getParameter("Nmk");
        User user = new User(Hovaten, Tendn, Email,sdt, Matkhau, Nmk);
        request.setAttribute("user", user);
        if(Nmk.equals(Matkhau)){
            try {
                db.Dangki(user);
                url = "/Dangnhap.html";
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }      
        }
        else{
            url = "/Dangki.html";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
