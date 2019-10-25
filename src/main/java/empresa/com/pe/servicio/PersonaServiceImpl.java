package empresa.com.pe.servicio;

import empresa.com.pe.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless  // Convertimos la clase para que sea de tipo Stateless e implementamos la clase remota(PersonaServiceRemote), implementamos sus metodos
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();    //Lista de objetos de tipo persona,definimos la variable perosnas y definimos el arraylist de tipo persona
        //Inventaremos personas
        personas.add(new Persona(1,"Juan","Perez","jperez@mail.com","1234563"));
        personas.add(new Persona(2,"Martha","Suarez","msuarez@mail.com","341265"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
        
    }

    @Override
    public void modificarPersona(Persona persona) {
        
    }

    @Override
    public void eliminarPersona(Persona persona) {
        
    }
    
}
