package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;

/**
 * Clase que representa un autor, el cual puede estar asociado a múltiples artículos.
 * Contiene la información básica del autor, como su nombre, apellido y una lista
 * de los artículos en los que ha participado.
 * 
 */
public class Autor {

    /**
     * ID único para identificar al autor.
     */
    private int idAutor;
    
    /**
     * Nombres del autor.
     */
    private String nombres;
    
    /**
     * Apellidos del autor.
     */
    private String apellidos;

    /**
     * Lista de artículos en los que el autor ha participado.
     */
    private ArrayList<Articulo> articulos;

    /**
     * Constructor por defecto.
     */
    public Autor() {
        
    }

    /**
     * Constructor que inicializa un autor con sus nombres, apellidos e ID.
     * 
     * @param idAutor El ID único del autor.
     * @param nombres Los nombres del autor.
     * @param apellidos Los apellidos del autor.
     */
    public Autor(int idAutor, String nombres, String apellidos) {
        this.idAutor = idAutor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.articulos = new ArrayList<>();
    }

    /**
     * Obtiene el ID del autor.
     * 
     * @return El ID del autor.
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Establece el ID del autor.
     * 
     * @param idAutor El ID a asignar al autor.
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     * Obtiene los nombres del autor.
     * 
     * @return Los nombres del autor.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del autor.
     * 
     * @param nombres Los nombres a asignar al autor.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene los apellidos del autor.
     * 
     * @return Los apellidos del autor.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del autor.
     * 
     * @param apellidos Los apellidos a asignar al autor.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la lista de artículos en los que ha participado el autor.
     * 
     * @return Una lista de artículos asociados al autor.
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * Establece la lista de artículos en los que ha participado el autor.
     * 
     * @param articulos La lista de artículos a asignar.
     */
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
}
