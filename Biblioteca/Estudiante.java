public class Estudiante extends Usuario {
    public Estudiante(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos: Préstamos limitados");
    }
}
