package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.ArrayList;
import java.util.List;

/**
 * RepositorioRevisorMemoriaArrayList es una implementación de la interfaz 
 * {@link InterfaceRepositorioRevisor} que utiliza un ArrayList para 
 * almacenar y gestionar los revisores en memoria.
 * 
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar 
 * revisores, manteniendo toda la información en memoria.
 * 
 * @version 1.0
 * @since 2024
 */
public class RepositorioRevisorMemoriaArrayList implements InterfaceRepositorioRevisor {

    /**
     * Lista de revisores almacenados en memoria.
     */
    private ArrayList<Revisor> listaRevisores;

    /**
     * Constructor por defecto que inicializa la lista de revisores.
     */
    public RepositorioRevisorMemoriaArrayList() {
        this.listaRevisores = new ArrayList<>();
    }

    /**
     * Almacena un nuevo revisor en la lista y le asigna un ID único.
     * 
     * @param objRevisor Objeto de tipo Revisor que se desea almacenar.
     * @return true si el revisor se almacena correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarRevisor(Revisor objRevisor) {
        objRevisor.setIdRevisor(getCantidadRevisores());
        return this.listaRevisores.add(objRevisor);
    }

    /**
     * Retorna la lista completa de revisores almacenados.
     * 
     * @return Lista de revisores en memoria.
     */
    @Override
    public List<Revisor> listarRevisores() {
        return this.listaRevisores;
    }

    /**
     * Elimina un revisor de la lista según su ID.
     * 
     * @param idRevisor ID del revisor que se desea eliminar.
     * @return true si el revisor se elimina correctamente, false si no se encuentra.
     */
    @Override
    public boolean eliminarRevisor(int idRevisor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if (this.listaRevisores.get(i).getIdRevisor() == idRevisor) {
                this.listaRevisores.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un revisor en la lista según su ID.
     * 
     * @param idRevisor ID del revisor que se desea consultar.
     * @return Objeto de tipo Revisor si se encuentra, null en caso contrario.
     */
    @Override
    public Revisor consultarRevisor(int idRevisor) {
        Revisor objRevisor = null;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if (this.listaRevisores.get(i).getIdRevisor() == idRevisor) {
                objRevisor = this.listaRevisores.get(i);
                break;
            }
        }
        return objRevisor;
    }

    /**
     * Actualiza la información de un revisor existente en la lista.
     * 
     * @param objRevisor Objeto de tipo Revisor con la información actualizada.
     * @return true si el revisor se actualiza correctamente, false si no se encuentra.
     */
    @Override
    public boolean actualizarRevisor(Revisor objRevisor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if (this.listaRevisores.get(i).getIdRevisor() == objRevisor.getIdRevisor()) {
                this.listaRevisores.set(i, objRevisor);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Obtiene la cantidad de revisores almacenados y genera un nuevo ID.
     * 
     * @return El número de revisores almacenados incrementado en 1, para asignarlo como ID.
     */
    public int getCantidadRevisores() {
        return this.listaRevisores.size() + 1;
    }
}
