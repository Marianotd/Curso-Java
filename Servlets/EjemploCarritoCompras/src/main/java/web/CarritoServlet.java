package web;

import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Creamos o recuperamos el objeto http sesion
        HttpSession sesion = request.getSession();

        // Recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        // Verificamos si la lista de articulos existe
        if (articulos == null) {
            // Inicializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        // Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        // Revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (
            // Imprimimos la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");

            // Iteramos todos los articulos
            articulos.forEach(articulo -> {
                out.print("<li>" + articulo + "</li>");
            });

            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al incio</a>");
        }
    }
}
