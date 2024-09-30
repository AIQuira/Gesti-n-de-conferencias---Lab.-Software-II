package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

/**
 * InterfaceRepositorioRevisor define las operaciones básicas para la gestión de 
 * revisores en el sistema de gestión de conferencias.
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar 
 * revisores dentro del repositorio.
 * 
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioRevisor {
    
    /**
     * Almacena un revisor en el repositorio.
     * 
     * @param objRevisor Objeto de tipo Revisor que se desea almacenar.
     * @return true si el revisor se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarRevisor(Revisor objRevisor);
    
    /**
     * Lista todos los revisores almacenados en el repositorio.
     * 
     * @return Una lista con todos los revisores registrados.
     */
    public List<Revisor> listarRevisores();
    
    /**
     * Elimina un revisor del repositorio según su identificador.
     * 
     * @param idRevisor Identificador del revisor que se desea eliminar.
     * @return true si el revisor se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarRevisor (int idRevisor);
    
    /**
     * Consulta un revisor específico en el repositorio utilizando su identificador.
     * 
     * @param idRevisor Identificador del revisor que se desea consultar.
     * @return El objeto Revisor correspondiente al identificador proporcionado,
     *         o null si no se encuentra el revisor.
     */
    public Revisor consultarRevisor (int idRevisor);
    
    /**
     * Actualiza la información de un revisor en el repositorio.
     * 
     * @param objRevisor Objeto de tipo Revisor con la información actualizada.
     * @return true si el revisor se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarRevisor (Revisor objRevisor);   
}
