import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un autor
        Autor autor = new Autor();
        autor.setNombre("J.K. Rowling");
        autor.setNacionalidad("Britanica");

        // 2. Crear un libro con su valoración
        Libro libro = new Libro("Harry Potter y la Piedra Filosofal", "978-8478884452", autor);
        libro.getValoracion().setPuntuacion(4.5);

        // 3. Crear usuarios
        Usuario estudiante = new Estudiante("Maria Lopez", "EST2023");
        Usuario profesor = new Profesor("Carlos Ruiz", "PROF456");
        Administrador admin = new Administrador("Admin", "ADMIN001");

        // 4. Autenticar usuario (ejemplo)
        estudiante.getAutenticacion().setContraseña("maria123");
        System.out.println("Autenticacion estudiante: " + 
            estudiante.getAutenticacion().autenticar("maria123")); // true

        // 5. Realizar un préstamo
        Prestamo prestamo = new Prestamo(estudiante, libro, LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        prestamo.setFechaDevolucion(LocalDate.now().plusDays(14).format(DateTimeFormatter.ISO_DATE));

        // 6. Agregar una reseña al libro
        Reseña reseña = new Reseña();
        reseña.setUsuario(estudiante);
        reseña.setLibro(libro);
        reseña.setCalificacion(5);
        reseña.setComentario("¡Increible libro! Lo ame.");
        libro.getValoracion().agregarReseña(reseña);

        // 7. Generar una multa (ejemplo)
        Multa multa = new Multa(10.50);
        prestamo.setMulta(multa);
        prestamo.getMulta().getPuntos().agregarPenalizacion(2);

        // 8. Mostrar información
        System.out.println("\n=== Información del Prestamo ===");
        System.out.println("Libro: " + prestamo.getLibro().getTitulo());
        System.out.println("Usuario: " + prestamo.getUsuario().getNombre());
        System.out.println("Fecha devolucion: " + prestamo.getFechaDevolucion());
        System.out.println("Multa: $" + prestamo.getMulta().getMonto());
        System.out.println("Puntos penalizacion: " + 
            prestamo.getMulta().getPuntos().getPuntosPenalizacion());

        System.out.println("\n=== Reseñas ===");
        for (Reseña r : libro.getValoracion().getReseñas()) {
            System.out.println(r.getUsuario().getNombre() + ": ★" + r.getCalificacion() + " - " + r.getComentario());
        }

        // 9. Mostrar permisos de usuarios
        System.out.println("\n=== Permisos ===");
        estudiante.mostrarPermisos();
        profesor.mostrarPermisos();
        admin.mostrarPermisos();
    }
}

 
