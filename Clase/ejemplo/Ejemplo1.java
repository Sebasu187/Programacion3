package Clase.ejemplo;

public class Ejemplo1 {

    public String nombreSueldos(String[] n, int[] s) {
        int suma = 0;
        for (int i = 0; i < s.length; i++) {
            suma += s[i];

           
        }
        double promedio = suma / s.length;
        String cad = "";
        int cont = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= promedio) {
                cad += n[i] + " \n";
                cont++;
            }
        }
        cad += "El promedio es: " + promedio;
        return cad;

    }
}
