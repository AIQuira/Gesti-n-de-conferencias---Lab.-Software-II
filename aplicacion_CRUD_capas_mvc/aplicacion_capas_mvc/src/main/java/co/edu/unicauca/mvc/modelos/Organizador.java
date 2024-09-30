package co.edu.unicauca.mvc.modelos;

/**
 * Clase que representa a un organizador de una conferencia.
 * Un organizador es responsable de gestionar aspectos clave de una conferencia.
 * Contiene información sobre su nombre, apellidos y universidad de afiliación.
 * 
 * @author wsern
 */
public class Organizador {

    /**
     * Nombres del organizador.
     */
    private String nombres;

    /**
     * Apellidos del organizador.
     */
    private String apellidos;

    /**
     * Universidad a la que está afiliado el organizador.
     */
    private String universidad;

    /**
     * Constructor que inicializa un nuevo organizador con sus datos personales.
     * 
     * @param nombres Nombres del organizador.
     * @param apellidos Apellidos del organizador.
     * @param universidad Universidad de afiliación del organizador.
     */
    public Organizador(String nombres, String apellidos, String universidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.universidad = universidad;
    }

    /**
     * Obtiene los nombres del organizador.
     * 
     * @return Los nombres del organizador.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del organizador.
     * 
     * @param nombres Los nombres a asignar al organizador.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene los apellidos del organizador.
     * 
     * @return Los apellidos del organizador.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del organizador.
     * 
     * @param apellidos Los apellidos a asignar al organizador.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la universidad de afiliación del organizador.
     * 
     * @return La universidad del organizador.
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * Establece la universidad de afiliación del organizador.
     * 
     * @param universidad La universidad a asignar al organizador.
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
