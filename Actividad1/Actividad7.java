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
        
    }
    
}
