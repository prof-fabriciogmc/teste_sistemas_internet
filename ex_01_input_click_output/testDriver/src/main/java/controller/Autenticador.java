/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
@WebServlet(urlPatterns={"/Autenticar"})
public class Autenticador extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        
        String nomeUsuario = req.getParameter("nomeUsuario");
        String senha = req.getParameter("senha");
        ServletContext sc = req.getServletContext();
        
        if ( nomeUsuario.equals("fabricio") && senha.equals("123")){
            req.setAttribute("nomeUsuario", nomeUsuario);
            req.setAttribute("senha", senha);
            req.setAttribute("Idade", "39");
            req.setAttribute("Altura", "1.81");
        
            try {
                sc.getRequestDispatcher("/jsp/paginaInicial.jsp").forward(req, resp); 
            }catch(Exception e){
                //Tratamento de erro de IO ou de Servlet..
            }                       
        }
        else{
            try {
                req.setAttribute("falhaAutenticacao", true);
                sc.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
            }catch(Exception e){
                //Tratamento de erro de IO ou de Servlet..
            }  
        }    
    }
}