package co.edu.unicauca.mvc.modelos;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * La clase Articulo representa un artículo que puede ser revisado por
 * un revisor. Administra su estado de revisión y contiene información
 * relevante como título, autores y conferencia asociada.
 * 
 * @version 1.1
 * @since 2024
 */
public class Articulo {

    private int idArticulo;
    private String titulo;
    private String autores;
    private EstadoRevision estadoRevision;

    private Conferencia objConferencia;
    private Revisor revisor;

    private static final EnumMap<EstadoRevision, EnumSet<EstadoRevision>> transicionesValidas = new EnumMap<>(EstadoRevision.class);

    static {
        transicionesValidas.put(EstadoRevision.PENDIENTE, EnumSet.of(EstadoRevision.EN_REVISION));
        transicionesValidas.put(EstadoRevision.EN_REVISION, EnumSet.of(EstadoRevision.REVISADO));
        transicionesValidas.put(EstadoRevision.REVISADO, EnumSet.noneOf(EstadoRevision.class));  // No puede cambiar una vez revisado
    }    
    
    /**
     * Constructor para crear un artículo con un título y autores.
     * El estado de revisión se inicializa en PENDIENTE.
     *
     * @param titulo El título del artículo.
     * @param autores Los autores del artículo.
     */
    public Articulo(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
        this.estadoRevision = EstadoRevision.PENDIENTE; // Estado inicial
    }

    // Getters y Setters
    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser nulo o vacío.");
        }
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        if (autores == null || autores.trim().isEmpty()) {
            throw new IllegalArgumentException("Los autores no pueden ser nulos o vacíos.");
        }
        this.autores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public Revisor getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }

    public EstadoRevision getEstadoRevision() {
        return estadoRevision;
    }

    public void setEstadoRevision(EstadoRevision estadoRevision) {
        this.estadoRevision = estadoRevision;
    }

    /**
     * Cambia el estado de revisión del artículo a un nuevo estado
     * si la transición es válida.
     *
     * @param nuevoEstado El nuevo estado de revisión.
     * @return true si el cambio fue exitoso, false de lo contrario.
     */
    public boolean cambiarEstado(EstadoRevision nuevoEstado) {
        // Verificar si la transición es válida
        if (transicionesValidas.get(estadoRevision).contains(nuevoEstado)) {
            setEstadoRevision(nuevoEstado);
            return true; // Cambio de estado exitoso
        } else {
            System.out.println("Transición no válida desde " + estadoRevision + " a " + nuevoEstado);
            return false; // No se permite el cambio de estado
        }
    }
}
