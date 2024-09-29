package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.ArrayList;
import java.util.List;

public class RepositorioRevisorMemoriaArrayList implements InterfaceRepositorioRevisor {

    private ArrayList<Revisor> listaRevisores;

    @Override
    public boolean almacenarRevisor(Revisor objRevisor) {
        objRevisor.setIdRevisor(getCantidadRevisores());
        return this.listaRevisores.add(objRevisor);
    }

    @Override
    public List<Revisor> listarRevisores() {
        return this.listaRevisores;
    }

    @Override
    public boolean eliminarRevisor(int idRevisor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if(this.listaRevisores.get(i).getIdRevisor() == idRevisor){
                this.listaRevisores.remove(i);
                bandera = true;
                break;
            }
        }
        
        return bandera;
    }

    @Override
    public Revisor consultarRevisor(int idRevisor) {
        Revisor objRevisor = null;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if(this.listaRevisores.get(i).getIdRevisor() == idRevisor){
                objRevisor = this.listaRevisores.get(i);
                break;
            }
        }
        
        return objRevisor;
    }

    @Override
    public boolean actualizarRevisor(Revisor objRevisor) {
        boolean bandera = false;
        for (int i = 0; i < this.listaRevisores.size(); i++) {
            if(this.listaRevisores.get(i).getIdRevisor() == objRevisor.getIdRevisor()){
                this.listaRevisores.set(i, objRevisor);
                bandera = true;
                break;
            }
        }
        
        return bandera;
    }

    public int getCantidadRevisores() {
        return this.listaRevisores.size() + 1;
    }
}
