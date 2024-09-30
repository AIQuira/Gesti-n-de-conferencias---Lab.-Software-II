package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.infraestructura.Subject;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.ArticuloReview;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ServicioAlmacenamientoArticulos es la clase responsable de la gestión 
 * y almacenamiento de artículos en el sistema. 
 * Extiende la clase Subject para permitir la observación de cambios 
 * en los artículos por otras clases.
 * 
 * Proporciona métodos para almacenar, listar, eliminar, consultar y 
 * actualizar artículos, así como cambiar su estado de revisión y 
 * manejar revisores y revisiones asociadas.
 * 
 * @version 1.0
 * @since 2024
 */
public class ServicioAlmacenamientoArticulos extends Subject {

    /**
     * Referencia al repositorio de artículos utilizado para la 
     * persistencia de datos.
     */
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;

    /**
     * Mapa que relaciona cada artículo con sus revisiones.
     */
    private Map<Articulo, List<ArticuloReview>> revisionesPorArticulo = new HashMap<>();

    /**
     * Constructor que inicializa el servicio con el repositorio de artículos.
     * 
     * @param referenciaRepositorioArticulo Repositorio utilizado para almacenar 
     *                                       y recuperar artículos.
     */
    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo) {
        this.referenciaRepositorioArticulo = referenciaRepositorioArticulo;
    }

    /**
     * Almacena un nuevo artículo en el repositorio.
     * 
     * @param objArticulo Artículo que se desea almacenar.
     * @return true si el artículo se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }

    /**
     * Lista todos los artículos almacenados en el repositorio.
     * 
     * @return Lista de artículos.
     */
    public List<Articulo> listarArticulos() {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }

    /**
     * Elimina un artículo del repositorio según su ID.
     * 
     * @param idArticulo ID del artículo que se desea eliminar.
     * @return true si el artículo se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }

    /**
     * Consulta un artículo en el repositorio según su ID.
     * 
     * @param idArticulo ID del artículo que se desea consultar.
     * @return Objeto Articulo si se encuentra, null en caso contrario.
     */
    public Articulo consultarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }

    /**
     * Actualiza la información de un artículo existente en el repositorio.
     * 
     * @param objArticulo Artículo con la información actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }

    /**
     * Cambia el estado de revisión de un artículo según su ID.
     * 
     * @param idArticulo ID del artículo cuyo estado se desea cambiar.
     * @param nuevoEstado Nuevo estado que se asignará al artículo.
     * @return true si se cambia el estado correctamente, false si la transición no es válida.
     */
    public boolean cambiarEstadoArticulo(int idArticulo, EstadoRevision nuevoEstado) {
        Articulo articulo = consultarArticulo(idArticulo);  // Consultar artículo por ID

        if (articulo != null && articulo.cambiarEstado(nuevoEstado)) {
            referenciaRepositorioArticulo.actualizarArticulo(articulo);  // Persistir los cambios
            notifyAllObserves();
            return true;
        } else {
            System.out.println("No se pudo cambiar el estado del artículo.");
            return false; // Si la transición no es válida
        }
    }

    /**
     * Asigna un revisor a un artículo según su ID.
     * 
     * @param idArticulo ID del artículo al que se desea asignar el revisor.
     * @param objRevisor Objeto Revisor que se desea asignar al artículo.
     * @return true si se asigna el revisor correctamente, false si ya tiene un revisor asignado.
     */
    public boolean asignarRevisorArticulo(int idArticulo, Revisor objRevisor) {
        Articulo articulo = this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
        if (articulo != null) {
            if (articulo.getRevisor() == null) { // Verificar si no tiene revisor asignado
                articulo.setRevisor(objRevisor); // Asignar el revisor
                return true; // Éxito
            } else {
                System.out.println("El artículo ya tiene un revisor asignado.");
                return false; // Fallo en la asignación
            }
        }
        return false;
    }

    /**
     * Agrega una revisión a un artículo.
     * 
     * @param articulo Artículo al que se desea agregar la revisión.
     * @param revision Objeto ArticuloReview que representa la revisión a agregar.
     */
    public void agregarRevisionArticulo(Articulo articulo, ArticuloReview revision) {
        revisionesPorArticulo.putIfAbsent(articulo, new ArrayList<>());
        revisionesPorArticulo.get(articulo).add(revision);
    }

    /**
     * Obtiene todas las revisiones asociadas a un artículo.
     * 
     * @param articulo Artículo del cual se desean obtener las revisiones.
     * @return Lista de revisiones asociadas al artículo.
     */
    public List<ArticuloReview> obtenerRevisionesArticulo(Articulo articulo) {
        return revisionesPorArticulo.getOrDefault(articulo, new ArrayList<>());
    }
}
