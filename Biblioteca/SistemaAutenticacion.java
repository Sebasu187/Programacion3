public class SistemaAutenticacion {
    private String contraseña;

    // Getters y Setters
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método de autenticación
    public boolean autenticar(String contraseñaIntentada) {
        return this.contraseña.equals(contraseñaIntentada);
    }
}
