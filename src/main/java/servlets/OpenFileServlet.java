package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/openfile")
public class OpenFileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Aquí puedes escribir el texto que deseas devolver
        String texto = "¡Hola desde el servlet!";
        
        // Establecer el tipo de contenido y el encoding de la respuesta
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        
        // Escribir el texto en el cuerpo de la respuesta
        response.getWriter().write(texto);
    }
}
