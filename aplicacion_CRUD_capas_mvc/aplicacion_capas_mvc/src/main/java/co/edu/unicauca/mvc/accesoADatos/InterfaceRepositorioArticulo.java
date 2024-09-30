package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import java.util.List;

/**
 * InterfaceRepositorioArticulo define las operaciones básicas para el manejo de 
 * artículos en el sistema de gestión de conferencias.
 * Proporciona métodos para almacenar, listar, eliminar, consultar y actualizar 
 * artículos dentro del repositorio.
 * 
 * @version 1.0
 * @since 2024
 */
public interface InterfaceRepositorioArticulo {
    
    /**
     * Almacena un artículo en el repositorio.
     * 
     * @param objArticulo Objeto de tipo Articulo que se desea almacenar.
     * @return true si el artículo se almacena correctamente, false en caso contrario.
     */
    public boolean almacenarArticulo(Articulo objArticulo);
    
    /**
     * Lista todos los artículos almacenados en el repositorio.
     * 
     * @return Una lista con todos los artículos registrados.
     */
    public List<Articulo> listarArticulos();
    
    /**
     * Elimina un artículo del repositorio según su identificador.
     * 
     * @param idArticulo Identificador del artículo que se desea eliminar.
     * @return true si el artículo se elimina correctamente, false en caso contrario.
     */
    public boolean eliminarArticulo(int idArticulo);
    
    /**
     * Consulta un artículo específico en el repositorio utilizando su identificador.
     * 
     * @param idArticulo Identificador del artículo que se desea consultar.
     * @return El objeto Articulo correspondiente al identificador proporcionado,
     *         o null si no se encuentra el artículo.
     */
    public Articulo consultarArticulo(int idArticulo);
    
    /**
     * Actualiza la información de un artículo en el repositorio.
     * 
     * @param objArticulo Objeto de tipo Articulo con la información actualizada.
     * @return true si el artículo se actualiza correctamente, false en caso contrario.
     */
    public boolean actualizarArticulo(Articulo objArticulo);
}
