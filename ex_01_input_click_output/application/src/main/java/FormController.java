
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
@WebServlet({"/"})
public class FormController extends HttpServlet {

   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse res){
       ServletContext sc = req.getServletContext();
       try{
            sc.getRequestDispatcher("/jsp/form.jsp").forward(req, res);
       }catch (Exception e){}      
   }
}