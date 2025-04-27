package collec_principal;

public class Principal {

    public static void main(String[] args) {
        // Crear el gestor de tareas usando LinkedHashSet
        GestorTareasHashSet gestor = new GestorTareasHashSet();

        // Crear tareas
        TareaHashSet t1 = new TareaHashSet(1, "Estudiar para examen de TPOO");
        TareaHashSet t2 = new TareaHashSet(2, "Hacer practica de Redes");
        TareaHashSet t3 = new TareaHashSet(3, "Disenar base de datos");
        TareaHashSet t4 = new TareaHashSet(2, "Hacer practica de redes"); // ID duplicado

        // Agregar tareas
        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);
        gestor.agregarTarea(t4); // No se agregará porque ya existe una con ID 2

        // Listar tareas
        System.out.println("Tareas:");
        gestor.listarTareas();

        // Verificar si existe una tarea con ID 3
        System.out.println("\nExiste la tarea con ID 3?: " + gestor.existeTarea(3));

        // Eliminar tarea con ID 3
        gestor.eliminarTarea(3);
        System.out.println("\nTareas despues de eliminar ID 3:");
        gestor.listarTareas();
    }
    
}
