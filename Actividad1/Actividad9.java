import java.util.Scanner;
public class Actividad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        int[] arreglo = new int[tamaño];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.print("\nIngrese el número a buscar: ");
        int numero = scanner.nextInt();
    }
}
