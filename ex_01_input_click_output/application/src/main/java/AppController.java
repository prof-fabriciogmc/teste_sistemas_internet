/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author fabricio
 */
@WebServlet({"/evenVerifier.action"})
public class AppController extends HttpServlet {

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res){
       int number = Integer.valueOf(req.getParameter("number"));
       EvenVerifier ev = new EvenVerifier();
       int isEven = ev.verifyNumber(number);
       ServletContext sc = req.getServletContext();
       try{
            req.setCharacterEncoding("UTF-8");
            res.setContentType("text/html");
            res.setCharacterEncoding("UTF-8");
            req.setAttribute("isEven", isEven);
            sc.getRequestDispatcher("/jsp/response.jsp").forward(req, res);
       }catch (Exception e){}      
   }
}
