public class Profesor extends Usuario {
    public Profesor(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos: Préstamos extendidos");
    }
}
