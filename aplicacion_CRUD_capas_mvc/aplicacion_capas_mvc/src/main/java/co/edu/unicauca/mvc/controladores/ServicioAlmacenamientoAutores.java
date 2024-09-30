package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioAutor;
import co.edu.unicauca.mvc.modelos.Autor;
import java.util.List;

/**
 * ServicioAlmacenamientoAutores es la clase responsable de la gestión 
 * y almacenamiento de autores en el sistema. 
 * Proporciona métodos para almacenar, listar, eliminar, consultar y 
 * actualizar autores.
 * 
 * @version 1.0
 * @since 2024
 */
public class ServicioAlmacenamientoAutores {

    /**
     * Referencia al repositorio de autores utilizado para la 
     * persistencia de datos.
     */
    private InterfaceRepositorioAutor referenciaRepositorioAutor;

    /**
     * Constructor que inicializa el servicio con el repositorio de autores.
     * 
     * @param referenciaRepositorioAutor Repositorio utilizado para almacenar 
     *                                     y recuperar autores.
     */
    public ServicioAlmacenamientoAutores(InterfaceRepositorioAutor referenciaRepositorioAutor) {
        this.referenciaRepositorioAutor = referenciaRepositorioAutor;
    }

    /**
     * Almacena un nuevo autor en el repositorio.
     * 
     * @param objAutor Autor que se desea almacenar.
     * @return true si el autor se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarAutor(Autor objAutor) {
        return this.referenciaRepositorioAutor.almacenarAutor(objAutor);
    }

    /**
     * Lista todos los autores almacenados en el repositorio.
     * 
     * @return Lista de autores.
     */
    public List<Autor> listarAutores() {
        return this.referenciaRepositorioAutor.listarAutores();
    }

    /**
     * Elimina un autor del repositorio según su ID.
     * 
     * @param idAutor ID del autor que se desea eliminar.
     * @return true si el autor se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarAutor(int idAutor) {
        return this.referenciaRepositorioAutor.eliminarAutor(idAutor);
    }

    /**
     * Consulta un autor en el repositorio según su ID.
     * 
     * @param idAutor ID del autor que se desea consultar.
     * @return Objeto Autor si se encuentra, null en caso contrario.
     */
    public Autor consultarAutor(int idAutor) {
        return this.referenciaRepositorioAutor.consultarAutor(idAutor);
    }

    /**
     * Actualiza la información de un autor existente en el repositorio.
     * 
     * @param objAutor Autor con la información actualizada.
     * @return true si el autor se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarAutor(Autor objAutor) {
        return this.referenciaRepositorioAutor.actualizarAutor(objAutor);
    }
}
