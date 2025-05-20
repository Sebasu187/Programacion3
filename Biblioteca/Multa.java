public class Multa {
    private double monto;
    private SistemaPuntos puntos;

    public Multa(double monto) {
        this.monto = monto;
        this.puntos = new SistemaPuntos();
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public SistemaPuntos getPuntos() {
        return puntos;
    }
}
