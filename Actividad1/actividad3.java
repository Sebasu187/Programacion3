import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el tamaño del arrglo: ");
        int N = scanner.nextInt();
        int[] numeros = new int[N];

        System.out.println("ingrese los numeros del arreglo:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < N; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i]; 
            } else {
                sumaImpares += numeros[i];
            }
        }
        System.out.println("\nSuma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);

        scanner.close();


    }

}
