package collec_principal;

import java.util.Objects;

public class TareaHashSet {
    private int id;
    private String descripcion;

    // Constructor
    public TareaHashSet(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descripcion: " + descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TareaHashSet tarea = (TareaHashSet) o;
        return id == tarea.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
