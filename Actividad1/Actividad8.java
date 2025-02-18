public class Actividad8 {
    public static void main(String[] args) {
        int[] valores = {5, 1, 2, 5, 3, 1, 5};
        int maximo = valores[0], minimo = valores[0];
        int contadorMax = 0, contadorMin = 0;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maximo) {
                maximo = valores[i];
            }
            if (valores[i] < minimo) {
                minimo = valores[i];
            }
        }
        for (int valor : valores) {
            if (valor == maximo) {
                contadorMax++;
            }
            if (valor == minimo) {
                contadorMin++;
            }
        }


    }
}
