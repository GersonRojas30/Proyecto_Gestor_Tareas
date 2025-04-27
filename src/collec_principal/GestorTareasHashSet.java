package collec_principal;

import java.util.LinkedHashSet;
import java.util.Set;

public class GestorTareasHashSet {
    private Set<TareaHashSet> conjuntoTareas;

    public GestorTareasHashSet() {
        this.conjuntoTareas = new LinkedHashSet<>(); // <- CORREGIDO
    }

    //metodo 1
    public void agregarTarea(TareaHashSet tarea) {
        conjuntoTareas.add(tarea);
    }

    //metodo 2
    public void eliminarTarea(int id) {
        conjuntoTareas.removeIf(t -> t.getId() == id);
    }
    
    //metodo 3
    public void listarTareas() {
        for (TareaHashSet t : conjuntoTareas) {
            System.out.println(t);
        }
    }

    //metodo 4
    public boolean existeTarea(int id) {
        return conjuntoTareas.stream().anyMatch(t -> t.getId() == id);
    }
    
    //metodo 5
    public int contarTareas() {
        return conjuntoTareas.size();
    }
}
