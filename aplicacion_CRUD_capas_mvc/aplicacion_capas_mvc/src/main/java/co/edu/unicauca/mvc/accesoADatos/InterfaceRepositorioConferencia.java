package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

/**
 * InterfaceRepositorioConferencia define las operaciones básicas para el manejo de 
 * conferencias en el sistema de gestión de conferencias.
 * Proporciona métodos para almacenar y listar conferencias dentro del repositorio.
 * 
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioConferencia {
    
    /**
     * Almacena una conferencia en el repositorio.
     * 
     * @param objConferencia Objeto de tipo Conferencia que se desea almacenar.
     * @return true si la conferencia se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarConferencia(Conferencia objConferencia);
    
    /**
     * Lista todas las conferencias almacenadas en el repositorio.
     * 
     * @return Una lista con todas las conferencias registradas.
     */
    public List<Conferencia> listarConferencias();
}
