import java.util.ArrayList;

public class EmisionesCO2ArrayList {
    public static void main(String[] args) {
      
        ArrayList<String> categorias = new ArrayList<>();
        categorias.add("Camiones Livianos");
        categorias.add("Camiones Medianos");
        categorias.add("Camiones Pesados");
        categorias.add("Tractocamiones");
        categorias.add("Volquetas");

        ArrayList<Integer> vehiculos = new ArrayList<>();
        vehiculos.add(400000);
        vehiculos.add(280000);
        vehiculos.add(380000);
        vehiculos.add(1150000);
        vehiculos.add(936000);

     
        ArrayList<double[]> porcentajes = new ArrayList<>();
        porcentajes.add(new double[]{0.30, 0.40, 0.25}); // Livianos
        porcentajes.add(new double[]{0.25, 0.50, 0.25}); // Medianos
        porcentajes.add(new double[]{0.10, 0.80, 0.10}); // Pesados
        porcentajes.add(new double[]{0.05, 0.90, 0.05}); // Tractocamiones
        porcentajes.add(new double[]{0.40, 0.40, 0.20}); // Volquetas

       
        double[] factores = {2.31, 2.68, 2.00}; 
        String[] combustibles = {"Gasolina", "Diesel", "Gas"};


        for (int i = 0; i < categorias.size(); i++) {
            System.out.println("Categoría: " + categorias.get(i));
            int cantidad = vehiculos.get(i);
            double[] porcentajesComb = porcentajes.get(i);

            for (int j = 0; j < factores.length; j++) {
                double emisiones = cantidad * porcentajesComb[j] * factores[j];
                System.out.printf("  %s: %.2f kg CO2%n", combustibles[j], emisiones);
            }
            System.out.println();
        }
    }
}