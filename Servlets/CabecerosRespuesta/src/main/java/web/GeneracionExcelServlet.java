package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Indicamos el tipo de respuesta al navegador
        response.setContentType("application/vmd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename-excelEjemplo.xls");
        // Para un uso mas profesional de excel poi.apache.org

        // Indicar al navegador que no guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);

        // Desplegamos la informacion
        PrintWriter out = response.getWriter();
        
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        
        out.close();
    }
}
