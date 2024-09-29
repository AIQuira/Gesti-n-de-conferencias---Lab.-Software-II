package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Autor;
import java.util.ArrayList;
import java.util.List;

public class RepositorioAutorMemoriaArrayList implements InterfaceRepositorioAutor {

    private ArrayList<Autor> listaDeAutores;

    public RepositorioAutorMemoriaArrayList() {
        this.listaDeAutores = new ArrayList();
    }

    @Override
    public boolean almacenarAutor(Autor objAutor) {
        objAutor.setIdAutor(getCantidadAutores());
        return this.listaDeAutores.add(objAutor);
    }

    @Override
    public List<Autor> listarAutores() {
        return this.listaDeAutores;
    }

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

    private int getCantidadAutores() {
        return this.listaDeAutores.size() + 1;
    }

}
