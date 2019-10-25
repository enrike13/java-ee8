package empresa.com.pe.servicio;

import empresa.com.pe.domain.Persona;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PersonaService {
    
    public List<Persona> listarPersonas(); //Metodo para poder trabajar con el OBJ de tipo persona
    
    public Persona encontrarPersonaPorId(Persona persona); //El metodo encontrarPersonaPorId recibe un objeto de tipo persona
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
