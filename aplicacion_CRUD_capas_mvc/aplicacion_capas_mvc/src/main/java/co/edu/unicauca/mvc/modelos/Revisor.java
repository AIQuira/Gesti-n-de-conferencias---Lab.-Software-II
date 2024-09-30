package co.edu.unicauca.mvc.modelos;

import co.edu.unicauca.mvc.infraestructura.Observer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que representa a un revisor de artículos. Implementa la interfaz {@link Observer}
 * para recibir notificaciones sobre cambios en el estado de los artículos asignados.
 * Un revisor puede estar asociado a varios artículos que tiene asignados para revisar.
 * 
 * @author wsern
 */
public class Revisor implements Observer {

    /**
     * Identificador único del revisor.
     */
    private int idRevisor;

    /**
     * Nombres del revisor.
     */
    private String nombres;

    /**
     * Apellidos del revisor.
     */
    private String apellidos;

    /**
     * Lista de artículos asignados al revisor para revisión.
     */
    private ArrayList<Articulo> articulosAsignados;

    /**
     * Constructor por defecto.
     */
    public Revisor() {

    }

    /**
     * Constructor que inicializa un revisor con sus datos personales.
     * 
     * @param idRevisor Identificador del revisor.
     * @param nombres Nombres del revisor.
     * @param apellidos Apellidos del revisor.
     */
    public Revisor(int idRevisor, String nombres, String apellidos) {
        this.idRevisor = idRevisor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.articulosAsignados = new ArrayList<>();
    }

    /**
     * Obtiene el identificador del revisor.
     * 
     * @return El identificador del revisor.
     */
    public int getIdRevisor() {
        return idRevisor;
    }

    /**
     * Establece el identificador del revisor.
     * 
     * @param idRevisor El identificador a asignar al revisor.
     */
    public void setIdRevisor(int idRevisor) {
        this.idRevisor = idRevisor;
    }

    /**
     * Obtiene los nombres del revisor.
     * 
     * @return Los nombres del revisor.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del revisor.
     * 
     * @param nombres Los nombres a asignar al revisor.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene los apellidos del revisor.
     * 
     * @return Los apellidos del revisor.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del revisor.
     * 
     * @param apellidos Los apellidos a asignar al revisor.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la lista de artículos asignados al revisor.
     * 
     * @return La lista de artículos asignados.
     */
    public ArrayList<Articulo> getArticulosAsignados() {
        return articulosAsignados;
    }

    /**
     * Establece la lista de artículos asignados al revisor.
     * 
     * @param articulosAsignados La lista de artículos a asignar.
     */
    public void setArticulosAsignados(ArrayList<Articulo> articulosAsignados) {
        this.articulosAsignados = articulosAsignados;
    }

    /**
     * Asigna un artículo al revisor.
     * 
     * @param articulo El artículo a asignar.
     * @return {@code true} si el artículo fue asignado con éxito, {@code false} en caso contrario.
     */
    public boolean asignarArticulo(Articulo articulo) {
        return articulosAsignados.add(articulo);
    }

    /**
     * Retorna una representación en cadena de los nombres y apellidos del revisor.
     * 
     * @return Nombres y apellidos concatenados del revisor.
     */
    @Override
    public String toString() {
        return this.nombres + " " + this.apellidos;
    }

    /**
     * Método sobrescrito de la interfaz {@link Observer} para recibir notificaciones.
     * Muestra una ventana emergente cuando se actualiza el estado de un artículo asignado.
     * 
     * @param o El objeto que generó la actualización (generalmente un artículo).
     */
    @Override
    public void update(Object o) {
        JOptionPane.showMessageDialog(null, 
            "Notificación para " + nombres + ": El estado ha cambiado.", 
            "Notificación de Cambio", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
