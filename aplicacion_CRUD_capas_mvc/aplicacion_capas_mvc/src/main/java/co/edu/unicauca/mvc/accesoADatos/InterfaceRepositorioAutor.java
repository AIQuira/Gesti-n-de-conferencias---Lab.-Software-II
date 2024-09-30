package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

/**
 * InterfaceRepositorioAutor define las operaciones básicas para el manejo de 
 * autores en el sistema de gestión de conferencias.
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar 
 * autores dentro del repositorio.
 * 
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioAutor {
    
     /**
     * Almacena un autor en el repositorio.
     * 
     * @param objAutor Objeto de tipo Autor que se desea almacenar.
     * @return true si el autor se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarAutor(Autor objAutor);
    
    /**
     * Lista todos los autores almacenados en el repositorio.
     * 
     * @return Una lista con todos los autores registrados.
     */
    public List<Autor> listarAutores();
    
    /**
     * Elimina un autor del repositorio según su identificador.
     * 
     * @param idAutor Identificador del autor que se desea eliminar.
     * @return true si el autor se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarAutor(int idAutor);
    
    /**
     * Consulta un autor específico en el repositorio utilizando su identificador.
     * 
     * @param idAutor Identificador del autor que se desea consultar.
     * @return El objeto Autor correspondiente al identificador proporcionado,
     *         o null si no se encuentra el autor.
     */
    public Autor consultarAutor (int idAutor);
    
    /**
     * Actualiza la información de un autor en el repositorio.
     * 
     * @param objAutor Objeto de tipo Autor con la información actualizada.
     * @return true si el autor se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarAutor(Autor objAutor);
    
}
