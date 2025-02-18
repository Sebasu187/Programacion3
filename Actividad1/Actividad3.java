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






        
    }
}
