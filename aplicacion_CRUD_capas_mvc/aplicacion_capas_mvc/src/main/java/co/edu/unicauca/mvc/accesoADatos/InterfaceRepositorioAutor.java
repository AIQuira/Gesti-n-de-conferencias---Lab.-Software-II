package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

public interface InterfaceRepositorioAutor {
    
    public boolean almacenarAutor(Autor objAutor);
    public List<Autor> listarAutores();
    public boolean eliminarAutor(int idAutor);
    public Autor consultarAutor (int idAutor);
    public boolean actualizarAutor(Autor objAutor);
    
}
