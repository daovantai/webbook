
package Controller;

import DAO.XemDAO;
import Model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLDataException;
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
@WebServlet(name = "thuvienservlet", urlPatterns = {"/thuvienservlet"})
public class thuvienservlet extends HttpServlet {
    private final XemDAO db;
    public thuvienservlet() throws SQLException{
        this.db=new XemDAO();
    }
           
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            List<Book> listBook=db.getProducts();
            request.setAttribute("listBook", listBook);
            request.getRequestDispatcher("/thuvien.jsp").forward(request, response);
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
