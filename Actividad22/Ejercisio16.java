package Actividad22;
import java.util.Scanner;

class Ejercisio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de profesores: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];
        int[] edades = new int[n];
        char[] sexos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nProfesor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Edad: ");
            edades[i] = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            sexos[i] = sc.next().charAt(0);
            sc.nextLine(); 
        }
        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double promedioEdad = (double) sumaEdades / n;
        System.out.println("\na. Edad promedio: " + promedioEdad);


    }
}
