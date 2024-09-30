package co.edu.unicauca.mvc.modelos;

/**
 * Clase que representa una revisión de un artículo científico.
 * Contiene información relacionada con la evaluación de un artículo, 
 * como comentarios, calificación y el revisor asignado.
 * 
 * @author sonhuila
 */
public class ArticuloReview {
    /**
     * ID único para cada revisión de un artículo.
     */
    private int idReview; 
    
    /**
     * Referencia al artículo que se está revisando.
     */
    private Articulo articulo; 
    
    /**
     * Comentarios del revisor sobre el artículo.
     */
    private String comentarios; 
    
    /**
     * Calificación asignada al artículo por el revisor.
     */
    private double calificacion; 
    
    /**
     * Revisor encargado de evaluar el artículo.
     */
    private Revisor revisor; 

    /**
     * Constructor principal para crear una revisión de artículo.
     * 
     * @param comentarios Comentarios del revisor acerca del artículo.
     * @param calificacion Calificación otorgada al artículo.
     */
    public ArticuloReview(String comentarios, double calificacion) {
        this.comentarios = comentarios;
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el ID único de la revisión.
     * 
     * @return El ID de la revisión.
     */
    public int getIdReview() {
        return idReview;
    }

    /**
     * Establece el ID único de la revisión.
     * 
     * @param idReview El ID a asignar a la revisión.
     */
    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    /**
     * Obtiene el artículo asociado a la revisión.
     * 
     * @return El artículo revisado.
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * Establece el artículo a revisar.
     * 
     * @param articulo El artículo a asociar con la revisión.
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /**
     * Obtiene los comentarios del revisor sobre el artículo.
     * 
     * @return Los comentarios del revisor.
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Establece los comentarios del revisor sobre el artículo.
     * 
     * @param comentarios Los comentarios a asignar.
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Obtiene la calificación otorgada al artículo por el revisor.
     * 
     * @return La calificación del artículo.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación otorgada al artículo.
     * 
     * @param calificacion La calificación a asignar.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el revisor asignado a la evaluación del artículo.
     * 
     * @return El revisor encargado.
     */
    public Revisor getRevisor() {
        return revisor;
    }

    /**
     * Establece el revisor encargado de la evaluación del artículo.
     * 
     * @param revisor El revisor a asignar.
     */
    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }
}
