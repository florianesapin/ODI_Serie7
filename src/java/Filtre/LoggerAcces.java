package Filtre;


import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author floriane.sapin
 */
public class LoggerAcces implements Filter{


    @Override
    public  void init(FilterConfig filterConfig) {
       // l'objet filterConfig encapsule les paramètres 
       // d'initialisation de ce filtre
       
   }
   
    @Override
    public  void destroy() {
       // callback de destruction de ce filtre
   }
    
    private  void beforeProcessing(ServletRequest request, ServletResponse response) 
    throws IOException, ServletException {
       
       Date date = new Date();
       
       System.out.println("Connexion le :" + date);
      
   }
   
   
    @Override
    public  void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain)
    throws IOException, ServletException {
   
       // propagation de la requête le long de la chaîne
      filterChain.doFilter(request, response) ;
   }
}
    

