package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.ArrayList;
import java.util.List;

/**
 * RepositorioAutorMemoriaArrayList es una implementación de la interfaz 
 * {@link InterfaceRepositorioAutor} que utiliza un ArrayList para almacenar y 
 * gestionar los autores en memoria.
 * 
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar
 * autores, manteniendo toda la información en memoria.
 * 
 * @version 1.0
 * @since 2024
 */
public class RepositorioAutorMemoriaArrayList implements InterfaceRepositorioAutor {

    /**
     * Lista de autores almacenados en memoria.
     */
    private ArrayList<Autor> listaDeAutores;

    /**
     * Constructor por defecto que inicializa la lista de autores.
     */
    public RepositorioAutorMemoriaArrayList() {
        this.listaDeAutores = new ArrayList<>();
    }

    /**
     * Almacena un nuevo autor en la lista.
     * 
     * @param objAutor Objeto de tipo Autor que se desea almacenar.
     * @return true si el autor se almacena correctamente, false en caso contrario.
     */
    @Override
    public boolean almacenarAutor(Autor objAutor) {
        objAutor.setIdAutor(getCantidadAutores());
        return this.listaDeAutores.add(objAutor);
    }

    /**
     * Retorna la lista completa de autores almacenados.
     * 
     * @return Lista de autores en memoria.
     */
    @Override
    public List<Autor> listarAutores() {
        return this.listaDeAutores;
    }

    /**
     * Elimina un autor de la lista utilizando su identificador.
     * 
     * @param idAutor Identificador del autor que se desea eliminar.
     * @return true si el autor se elimina correctamente, false en caso contrario.
     */
    @Override
    public boolean eliminarAutor(int idAutor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeAutores.size(); i++) {
            if (this.listaDeAutores.get(i).getIdAutor() == idAutor) {
                this.listaDeAutores.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un autor específico en la lista utilizando su identificador.
     * 
     * @param idAutor Identificador del autor que se desea consultar.
     * @return El objeto Autor correspondiente al identificador proporcionado,
     *         o null si no se encuentra el autor.
     */
    @Override
    public Autor consultarAutor(int idAutor) {
        Autor objAutor = null;
        for (int i = 0; i < this.listaDeAutores.size(); i++) {
            if (this.listaDeAutores.get(i).getIdAutor() == idAutor) {
                objAutor = this.listaDeAutores.get(i);
                break;
            }
        }
        return objAutor;
    }

    /**
     * Actualiza la información de un autor en la lista.
     * 
     * @param objAutor Objeto de tipo Autor con la información actualizada.
     * @return true si el autor se actualiza correctamente, false en caso contrario.
     */
    @Override
    public boolean actualizarAutor(Autor objAutor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeAutores.size(); i++) {
            if (this.listaDeAutores.get(i).getIdAutor() == objAutor.getIdAutor()) {
                this.listaDeAutores.set(i, objAutor);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Obtiene la cantidad de autores almacenados y genera un nuevo ID.
     * 
     * @return El número de autores almacenados incrementado en 1, para asignarlo como ID.
     */
    private int getCantidadAutores() {
        return this.listaDeAutores.size() + 1;
    }

}
