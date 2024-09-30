package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

/**
 * InterfaceRepositorioOrganizador define las operaciones básicas para la gestión de 
 * organizadores en el sistema de gestión de conferencias.
 * Proporciona métodos para registrar y listar organizadores dentro del repositorio.
 * 
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioOrganizador {
    
    /**
     * Registra un organizador en el repositorio.
     * 
     * @param objOrganizador Objeto de tipo Organizador que se desea registrar.
     * @return true si el organizador se registra correctamente, false en caso contrario.
     */
    public boolean registrarOrganizador(Organizador objOrganizador);
    
    /**
     * Lista todos los organizadores almacenados en el repositorio.
     * 
     * @return Una lista con todos los organizadores registrados.
     */
    public List<Organizador> listarOrganizadores();
}
