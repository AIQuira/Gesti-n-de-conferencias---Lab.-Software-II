package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.ArrayList;
import java.util.List;

/**
 * RepositorioOrganizadorMemoriaArrayList es una implementación de la interfaz 
 * {@link InterfaceRepositorioOrganizador} que utiliza un ArrayList para 
 * almacenar y gestionar los organizadores en memoria.
 * 
 * Proporciona métodos para registrar y listar organizadores, manteniendo toda la 
 * información en memoria.
 * 
 * @version 1.0
 * @since 2024
 */
public class RepositorioOrganizadorMemoriaArrayList implements InterfaceRepositorioOrganizador {

    /**
     * Lista de organizadores almacenados en memoria.
     */
    private ArrayList<Organizador> listaOrganizadores;

    /**
     * Constructor por defecto que inicializa la lista de organizadores.
     */
    public RepositorioOrganizadorMemoriaArrayList() {
        this.listaOrganizadores = new ArrayList<>();
    }

    /**
     * Registra un nuevo organizador en la lista.
     * 
     * @param objOrganizador Objeto de tipo Organizador que se desea registrar.
     * @return true si el organizador se registra correctamente, false en caso contrario.
     */
    @Override
    public boolean registrarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.listaOrganizadores.add(objOrganizador);
        return bandera;
    }

    /**
     * Retorna la lista completa de organizadores almacenados.
     * 
     * @return Lista de organizadores en memoria.
     */
    @Override
    public List<Organizador> listarOrganizadores() {
        return this.listaOrganizadores;
    }
}
