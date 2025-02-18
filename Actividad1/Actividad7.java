import java.util.Scanner;
public class Actividad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];

        System.out.println("ingrese los 10 elementos del arreglo a:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                pares[contadorPares] = A[i]; // Agregar a pares
                contadorPares++;
            } else {
                impares[contadorImpares] = A[i]; // Agregar a impares
                contadorImpares++;
            }
        }
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nNúmeros impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        scanner.close();

        
    }
    
}
