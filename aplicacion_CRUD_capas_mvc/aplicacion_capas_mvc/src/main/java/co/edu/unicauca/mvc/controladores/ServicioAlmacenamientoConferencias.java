package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioConferencia;
import co.edu.unicauca.mvc.infraestructura.Subject;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;

/**
 * ServicioAlmacenamientoConferencias es la clase responsable de la gestión 
 * y almacenamiento de conferencias en el sistema. 
 * Proporciona métodos para almacenar y listar conferencias.
 * 
 * @version 1.0
 * @since 2024
 */
public class ServicioAlmacenamientoConferencias extends Subject {

    /**
     * Referencia al repositorio de conferencias utilizado para la 
     * persistencia de datos.
     */
    private InterfaceRepositorioConferencia referenciaRepositorioConferencias;

    /**
     * Constructor que inicializa el servicio con el repositorio de conferencias.
     * 
     * @param referenciaRepositorioConferencias Repositorio utilizado para almacenar 
     *                                            y recuperar conferencias.
     */
    public ServicioAlmacenamientoConferencias(InterfaceRepositorioConferencia referenciaRepositorioConferencias) {
        this.referenciaRepositorioConferencias = referenciaRepositorioConferencias;
    }

    /**
     * Almacena una nueva conferencia en el repositorio.
     * 
     * @param objConfererencia Conferencia que se desea almacenar.
     * @return true si la conferencia se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        boolean bandera = this.referenciaRepositorioConferencias.almacenarConferencia(objConfererencia);
        this.notifyAllObserves(); // Notifica a todos los observadores
        return bandera;
    }

    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     * 
     * @return Lista de conferencias.
     */
    public List<Conferencia> listarConferencias() {
        return this.referenciaRepositorioConferencias.listarConferencias();
    }
}
