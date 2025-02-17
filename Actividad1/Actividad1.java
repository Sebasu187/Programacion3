import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el tamaño del arreglo");
        int N = sc.nextInt();
        int [] Narreglo = new int[N]; //creamos un arreglo del tamaño ingresado en el sc}

        System.out.println("ingresa los " + N + " numeros del arreglo bro:"); //pedimos los numeros del arreglo
        for (int i = 0; i < N; i++) { //ciclo para pedir los numeros del arreglo
            System.out.print("Número " + (i + 1) + ": ");
            Narreglo[i] = sc.nextInt();
        }

        
    }
}