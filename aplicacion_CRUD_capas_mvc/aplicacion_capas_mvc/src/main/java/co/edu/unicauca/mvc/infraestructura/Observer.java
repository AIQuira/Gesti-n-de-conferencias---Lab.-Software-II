package co.edu.unicauca.mvc.infraestructura;

/**
 * La interfaz Observer define un contrato para los objetos que desean 
 * recibir actualizaciones o notificaciones de otros objetos en el sistema.
 * Implementa el patrón de diseño Observer, donde los observadores son 
 * notificados de cambios en los sujetos a los que están registrados.
 * 
 * @version 1.0
 * @since 2024
 */
public interface Observer {

    /**
     * Método que se invoca para notificar al observador sobre un cambio 
     * en el objeto observado.
     * 
     * @param o Objeto que contiene información sobre el cambio. Puede ser 
     *          cualquier objeto relevante para la notificación.
     */
    public void update(Object o);
}
