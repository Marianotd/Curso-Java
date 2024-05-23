package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;

        // Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        // Buscamos si ya existe una cookie creada con anterioridad
        // Llamada visitaRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    // Si ya existe lac ookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }
}
