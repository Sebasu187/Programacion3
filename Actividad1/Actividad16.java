import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de profesores: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[n];
        int[] edades = new int[n];
        char[] sexos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProfesor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            sexos[i] = scanner.next().charAt(0);
            scanner.nextLine();
        }

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double promedioEdad = (double) sumaEdades / n;
        System.out.println("\na. Edad promedio: " + promedioEdad);

        int indiceJoven = 0;
        for (int i = 1; i < n; i++) {
            if (edades[i] < edades[indiceJoven]) {
                indiceJoven = i;
            }
        }
        System.out.println("b. Profesor más joven: " + nombres[indiceJoven]);

        int indiceMayor = 0;
        for (int i = 1; i < n; i++) {
            if (edades[i] > edades[indiceMayor]) {
                indiceMayor = i;
            }
        }
        System.out.println("c. Profesor con mayor edad: " + nombres[indiceMayor]);

        int profesorasMayorPromedio = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 'F' && edades[i] > promedioEdad) {
                profesorasMayorPromedio++;
            }
        }
        System.out.println("d. Profesoras con edad mayor al promedio: " + profesorasMayorPromedio);

        int profesoresMenorPromedio = 0;
        for (int i = 0; i < n; i++) {
            if (edades[i] < promedioEdad) {
                profesoresMenorPromedio++;
            }
        }
        System.out.println("e. Profesores con edad menor al promedio: " + profesoresMenorPromedio);

        scanner.close();

    }

}
