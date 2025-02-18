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

    }

}
