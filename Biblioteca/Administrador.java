public class Administrador extends Usuario {
    public Administrador(String nombre, String id) {
        super(nombre, id);
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos: Total (crear, eliminar, modificar)");
    }
}
