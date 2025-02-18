import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("ingrese el numero de productos: ");
        int N = scanner.nextInt();

        double[] preciosUnitarios = new double[N]; 
        int[] cantidadesCompradas = new int[N];    
        String[] descripciones = new String[N];    
        double[] totalGastado = new double[N]; 

        System.out.println("\nIngrese los datos de los productos:");
        for (int i = 0; i < N; i++) {
            System.out.println("\nProducto " + (i + 1) + ":");
            System.out.print("Descripción: ");
            scanner.nextLine(); 
            descripciones[i] = scanner.nextLine();
            System.out.print("Precio unitario (PU): ");
            preciosUnitarios[i] = scanner.nextDouble();
            System.out.print("Cantidad comprada (CC): ");
            cantidadesCompradas[i] = scanner.nextInt();

            totalGastado[i] = preciosUnitarios[i] * cantidadesCompradas[i];
        }
        double totalGeneral = 0;
        for (int i = 0; i < N; i++) {
            totalGeneral += totalGastado[i];
        }

       
        int indiceMayorGasto = 0;
        for (int i = 1; i < N; i++) {
            if (totalGastado[i] > totalGastado[indiceMayorGasto]) {
                indiceMayorGasto = i;
            }
        }

        
        System.out.println("\nResultados:");
        System.out.println("Total general de todas las compras: " + totalGeneral);
        System.out.println("Producto con mayor gasto:");
        System.out.println("  Descripción: " + descripciones[indiceMayorGasto]);
        System.out.println("  Total gastado: " + totalGastado[indiceMayorGasto]);

        
        scanner.close();

        
    }
    
}
