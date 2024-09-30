package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

/**
 * ServicioAlmacenamientoOrganizador es la clase responsable de la gestión 
 * y almacenamiento de organizadores en el sistema. 
 * Proporciona métodos para almacenar y listar organizadores.
 * 
 * @version 1.0
 * @since 2024
 */
public class ServicioAlmacenamientoOrganizador {

    /**
     * Referencia al repositorio de organizadores utilizado para la 
     * persistencia de datos.
     */
    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizador;

    /**
     * Constructor que inicializa el servicio con el repositorio de organizadores.
     * 
     * @param referenciaRepositorioOrganizador Repositorio utilizado para almacenar 
     *                                            y recuperar organizadores.
     */
    public ServicioAlmacenamientoOrganizador(InterfaceRepositorioOrganizador referenciaRepositorioOrganizador) {
        this.referenciaRepositorioOrganizador = referenciaRepositorioOrganizador;
    }

    /**
     * Almacena un nuevo organizador en el repositorio.
     * 
     * @param objOrganizador Organizador que se desea almacenar.
     * @return true si el organizador se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarOrganizador(Organizador objOrganizador) {
        return this.referenciaRepositorioOrganizador.registrarOrganizador(objOrganizador);
    }

    /**
     * Lista todos los organizadores almacenados en el repositorio.
     * 
     * @return Lista de organizadores.
     */
    public List<Organizador> listarOrganizador() {
        return this.referenciaRepositorioOrganizador.listarOrganizadores();
    }
}
