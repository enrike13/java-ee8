
package empresa.com.pe.web;

import empresa.com.pe.domain.Persona;
import empresa.com.pe.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    @Inject
    PersonaService personaService;
    
    @Override  // sobreescribimos el metodo doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("Personas"+personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("listarPersonas.jsp").forward(request, response);
    }
    
}
