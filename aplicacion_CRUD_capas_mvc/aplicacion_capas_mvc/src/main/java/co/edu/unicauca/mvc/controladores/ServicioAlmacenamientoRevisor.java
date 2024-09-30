package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioRevisor;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

/**
 * ServicioAlmacenamientoRevisor es la clase responsable de la gestión 
 * y almacenamiento de revisores en el sistema.
 * Proporciona métodos para almacenar, listar, eliminar, consultar y 
 * actualizar revisores.
 * 
 * @version 1.0
 * @since 2024
 */
public class ServicioAlmacenamientoRevisor {

    /**
     * Referencia al repositorio de revisores utilizado para la 
     * persistencia de datos.
     */
    private InterfaceRepositorioRevisor referenciaRepositorioRevisor;

    /**
     * Constructor que inicializa el servicio con el repositorio de revisores.
     * 
     * @param referenciaRepositorioRevisor Repositorio utilizado para almacenar 
     *                                        y recuperar revisores.
     */
    public ServicioAlmacenamientoRevisor(InterfaceRepositorioRevisor referenciaRepositorioRevisor) {
        this.referenciaRepositorioRevisor = referenciaRepositorioRevisor;
    }

    /**
     * Almacena un nuevo revisor en el repositorio.
     * 
     * @param objRevisor Revisor que se desea almacenar.
     * @return true si el revisor se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarRevisor(Revisor objRevisor) {
        return this.referenciaRepositorioRevisor.almacenarRevisor(objRevisor);
    }

    /**
     * Lista todos los revisores almacenados en el repositorio.
     * 
     * @return Lista de revisores.
     */
    public List<Revisor> listarRevisores() {
        return this.referenciaRepositorioRevisor.listarRevisores();
    }

    /**
     * Elimina un revisor del repositorio utilizando su ID.
     * 
     * @param idRevisor ID del revisor a eliminar.
     * @return true si el revisor se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarRevisor(int idRevisor) {
        return this.referenciaRepositorioRevisor.eliminarRevisor(idRevisor);
    }

    /**
     * Consulta un revisor en el repositorio utilizando su ID.
     * 
     * @param idRevisor ID del revisor a consultar.
     * @return El revisor correspondiente al ID, o null si no se encuentra.
     */
    public Revisor consultarRevisor(int idRevisor) {
        return this.referenciaRepositorioRevisor.consultarRevisor(idRevisor);
    }

    /**
     * Actualiza la información de un revisor en el repositorio.
     * 
     * @param objRevisor Revisor con los datos actualizados.
     * @return true si el revisor se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarRevisor(Revisor objRevisor) {
        return this.referenciaRepositorioRevisor.actualizarRevisor(objRevisor);
    }
}
