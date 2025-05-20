public class SistemaPuntos {
    private int puntosPenalizacion;

    // Getters y Setters
    public int getPuntosPenalizacion() {
        return puntosPenalizacion;
    }

    public void agregarPenalizacion(int puntos) {
        this.puntosPenalizacion += puntos;
    }
}
