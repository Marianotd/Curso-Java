package web;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        
        out.print("<html>");
        
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        
        out.print("<body>");
        
        out.print("<h1>Headers HTTP </h1>");
        out.print("<br/>");
        out.print("Metodo Http: " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.print("<hr>");
        out.print("Uri solicitada: " + uri);
        
        // Imprimimos todos los cabeceros disponibles
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()) {            
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + ": " + "</b>");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        
        out.print("</body>");
        out.print("</html>");
        
        out.close();
    }
}
