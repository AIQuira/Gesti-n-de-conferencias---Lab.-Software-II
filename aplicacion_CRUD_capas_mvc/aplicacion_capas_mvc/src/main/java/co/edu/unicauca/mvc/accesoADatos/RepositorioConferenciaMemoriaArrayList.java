package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.ArrayList;
import java.util.List;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.modelos.Revisor;

/**
 * RepositorioConferenciaMemoriaArrayList es una implementación de la interfaz 
 * {@link InterfaceRepositorioConferencia} que utiliza un ArrayList para 
 * almacenar y gestionar las conferencias en memoria.
 * 
 * Proporciona métodos para almacenar y listar conferencias, manteniendo toda la 
 * información en memoria.
 * 
 * @version 1.0
 * @since 2024
 */
public class RepositorioConferenciaMemoriaArrayList implements InterfaceRepositorioConferencia {

    /**
     * Lista de conferencias almacenadas en memoria.
     */
    private ArrayList<Conferencia> listaConferencias;

    /**
     * Constructor por defecto que inicializa la lista de conferencias.
     */
    public RepositorioConferenciaMemoriaArrayList() {
        this.listaConferencias = new ArrayList<>();
    }

    /**
     * Almacena una nueva conferencia en la lista.
     * 
     * @param objConfererencia Objeto de tipo Conferencia que se desea almacenar.
     * @return true si la conferencia se almacena correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarConferencia(Conferencia objConfererencia) {
        objConfererencia.setIdConferencia(this.getCantidadConferencias());
        boolean bandera = this.listaConferencias.add(objConfererencia);
        return bandera;
    }

    /**
     * Retorna la lista completa de conferencias almacenadas.
     * 
     * @return Lista de conferencias en memoria.
     */
    @Override
    public List<Conferencia> listarConferencias() {
        return this.listaConferencias;
    }

    /**
     * Obtiene la cantidad de conferencias almacenadas y genera un nuevo ID.
     * 
     * @return El número de conferencias almacenadas incrementado en 1, para asignarlo como ID.
     */
    private int getCantidadConferencias() {
        return this.listaConferencias.size() + 1;
    }
}

