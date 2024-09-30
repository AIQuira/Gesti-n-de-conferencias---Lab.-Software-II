package co.edu.unicauca.mvc.modelos;

/**
 * Enumeración que representa los posibles estados de una revisión de artículo.
 * Define tres estados:
 * <ul>
 * <li>PENDIENTE: La revisión aún no ha comenzado.</li>
 * <li>EN_REVISION: El artículo está siendo revisado.</li>
 * <li>REVISADO: El artículo ya ha sido revisado.</li>
 * </ul>
 * 
 * @author wsern
 */
public enum EstadoRevision {
    /**
     * El estado en el que la revisión aún no ha comenzado.
     */
    PENDIENTE,

    /**
     * El estado en el que el artículo está en proceso de revisión.
     */
    EN_REVISION,

    /**
     * El estado en el que la revisión del artículo ya se ha completado.
     */
    REVISADO;
}
