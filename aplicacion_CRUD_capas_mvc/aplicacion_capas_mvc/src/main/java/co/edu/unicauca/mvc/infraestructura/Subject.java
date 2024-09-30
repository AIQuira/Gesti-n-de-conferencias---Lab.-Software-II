package co.edu.unicauca.mvc.infraestructura;

import java.util.ArrayList;

/**
 * La clase abstracta Subject implementa la funcionalidad básica para el
 * patrón de diseño Observer. Un sujeto mantiene una lista de observadores
 * que se registran para recibir notificaciones sobre cambios. Las clases 
 * que extiendan esta clase deben definir su comportamiento específico.
 * 
 * @version 1.0
 * @since 2024
 */
public abstract class Subject {

    private ArrayList<Observer> observers; // Lista de observadores registrados

    /**
     * Constructor de la clase Subject. Inicializa la lista de observadores.
     */
    public Subject() {
        observers = new ArrayList<>();
    }

    /**
     * Agrega un observador a la lista de observadores.
     * 
     * @param obs El observador a agregar.
     */
    public void addObserver(Observer obs) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    /**
     * Notifica a todos los observadores que hubo un cambio en el modelo.
     * Se invoca el método update de cada observador registrado.
     */
    public void notifyAllObserves() {
        for (Observer each : observers) {
            each.update(this);
        }
    }
}
