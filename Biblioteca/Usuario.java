public abstract class Usuario {
    private String nombre;
    private String id;

    SistemaAutenticacion autenticacion = new SistemaAutenticacion();

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.autenticacion = new SistemaAutenticacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SistemaAutenticacion getAutenticacion() {
        return autenticacion;
    }

    public abstract void mostrarPermisos();
}
