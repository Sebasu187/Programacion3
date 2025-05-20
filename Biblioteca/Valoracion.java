import java.util.ArrayList;
import java.util.List;

public class Valoracion {
    private double puntuacion;
    private List<Reseña> reseñas;

    public Valoracion() {
        this.reseñas = new ArrayList<>();
    }

    // Getters y Setters
    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public List<Reseña> getReseñas() {
        return reseñas;
    }

    public void agregarReseña(Reseña reseña) {
        this.reseñas.add(reseña);
    }
}
