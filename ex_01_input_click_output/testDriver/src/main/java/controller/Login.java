/*
Perceber que no redirecionamento da resposta diretórios devem
ser iniciados por "/"
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabriciogmc
 */
@WebServlet(urlPatterns="")
public class Login extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        
        ServletContext sc = req.getServletContext();
        try{
        sc.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);            
        } catch (Exception e){}
    }
}
