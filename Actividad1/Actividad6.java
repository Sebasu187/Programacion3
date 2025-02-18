import java.util.Scanner;
public class Actividad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de viviendas: ");
        int N = scanner.nextInt();

        double[] alquileres = new double[N];       
        double[] porcentajesGanancia = new double[N]; 
        double[] ganancias = new double[N];

        System.out.println("\nIngrese los datos de las viviendas:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nVivienda " + (i + 1) + ":");
            System.out.print("Alquiler mensual: ");
            alquileres[i] = scanner.nextDouble();
            System.out.print("Porcentaje de ganancia (%): ");
            porcentajesGanancia[i] = scanner.nextDouble();


    }
    
}
