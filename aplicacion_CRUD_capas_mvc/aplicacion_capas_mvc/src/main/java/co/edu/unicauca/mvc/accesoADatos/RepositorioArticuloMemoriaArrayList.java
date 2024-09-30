package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 * RepositorioArticuloMemoriaArrayList es una implementación de la interfaz
 * {@link InterfaceRepositorioArticulo} que utiliza un ArrayList para almacenar
 * y gestionar los artículos en memoria.
 *
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar
 * artículos, manteniendo toda la información en memoria.
 *
 * @version 1.0
 * @since 2024
 */
public class RepositorioArticuloMemoriaArrayList implements InterfaceRepositorioArticulo {

    /**
     * Lista de artículos almacenados en memoria.
     */
    private ArrayList<Articulo> listaDeArticulos;

    /**
     * Constructor por defecto que inicializa la lista de artículos.
     */
    public RepositorioArticuloMemoriaArrayList() {
        this.listaDeArticulos = new ArrayList<>();
    }

    /**
     * Almacena un nuevo artículo en la lista.
     *
     * @param objArticulo Objeto de tipo Articulo que se desea almacenar.
     * @return true si el artículo se almacena correctamente, false en caso
     * contrario.
     */
    @Override
    public boolean almacenarArticulo(Articulo objArticulo) {
        objArticulo.setIdArticulo(getCantidadArticulos());
        return this.listaDeArticulos.add(objArticulo);
    }

    /**
     * Retorna la lista completa de artículos almacenados.
     *
     * @return Lista de artículos en memoria.
     */
    @Override
    public List<Articulo> listarArticulos() {
        return this.listaDeArticulos;
    }

    /**
     * Obtiene la cantidad de artículos almacenados y genera un nuevo ID.
     *
     * @return El número de artículos almacenados incrementado en 1, para
     * asignarlo como ID.
     */
    private int getCantidadArticulos() {
        return this.listaDeArticulos.size() + 1;
    }

    /**
     * Elimina un artículo de la lista utilizando su identificador.
     *
     * @param idArticulo Identificador del artículo que se desea eliminar.
     * @return true si el artículo se elimina correctamente, false en caso
     * contrario.
     */
    @Override
    public boolean eliminarArticulo(int idArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                this.listaDeArticulos.remove(i);
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    /**
     * Consulta un artículo específico en la lista utilizando su identificador.
     *
     * @param idArticulo Identificador del artículo que se desea consultar.
     * @return El objeto Articulo correspondiente al identificador
     * proporcionado, o null si no se encuentra el artículo.
     */
    @Override
    public Articulo consultarArticulo(int idArticulo) {
        Articulo objArticulo = null;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == idArticulo) {
                objArticulo = this.listaDeArticulos.get(i);
                break;
            }
        }
        return objArticulo;
    }

    /**
     * Actualiza la información de un artículo en la lista.
     *
     * @param objArticulo Objeto de tipo Articulo con la información
     * actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso
     * contrario.
     */
    @Override
    public boolean actualizarArticulo(Articulo objArticulo) {
        boolean bandera = false;
        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == objArticulo.getIdArticulo()) {
                this.listaDeArticulos.set(i, objArticulo);
                bandera = true;
                break;
            }
        }
        return bandera;
    }
}
