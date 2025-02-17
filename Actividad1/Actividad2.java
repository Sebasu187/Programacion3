import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos empleados hay? ");
        int N = scanner.nextInt();

        double[] sueldos = new double[N];
        double[] asignaciones = new double[N];
        double[] deducciones = new double[N];
        double[] netoPagar = new double[N];

        System.out.println("Ingresa los datos de cada empleado:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmpleado " + (i + 1) + ":");
            System.out.print("Sueldo: ");
            sueldos[i] = scanner.nextDouble();
            System.out.print("Asignaciones: ");
            asignaciones[i] = scanner.nextDouble();
            System.out.print("Deducciones: ");
            deducciones[i] = scanner.nextDouble();


        }



    }
}