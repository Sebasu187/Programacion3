import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero de personas en el prime grupo: ");
        int N = scanner.nextInt();
        System.out.print("ingrese el numero de personas en el segudo grupo: ");
        int M = scanner.nextInt();

        int[] edadesGrupo1 = new int[N];
        int[] edadesGrupo2 = new int[M];

        System.out.println("\nIngrese las edades del primer grupo:");
        for (int i = 0; i < N; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edadesGrupo1[i] = scanner.nextInt();
        }

        System.out.println("\nIngrese las edades del segundo grupo:");
        for (int i = 0; i < M; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edadesGrupo2[i] = scanner.nextInt();
        }

        int mayorEdad = encontrarMayor(edadesGrupo1, edadesGrupo2);

        System.out.println("\nLa mayor edad es: " + mayorEdad);
        scanner.close();

    }

    public static int encontrarMayor(int[] arreglo1, int[] arreglo2) {
        int mayor = Integer.MIN_VALUE;
        for (int edad : arreglo1) {
            if (edad > mayor) {
                mayor = edad;
            }
        }
        for (int edad : arreglo2) {
            if (edad > mayor) {
                mayor = edad;
            }
        }

        return mayor;
    }
}
