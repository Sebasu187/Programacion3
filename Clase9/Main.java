package Clase9;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Trabajador> trabajadores = new Stack<>();

        Trabajador t1 = new Trabajador("Juan Perez", "001", 500.0);
        Trabajador t2 = new Trabajador("Ana Gomez", "002", 600.0);
        Trabajador t3 = new Trabajador("Carlos Ruiz", "003", 700.0);

        trabajadores.push(t1);
        trabajadores.push(t2);
        trabajadores.push(t3);

        System.out.println(" Lista de Trabajadores:" + trabajadores);

        for (int i = 0; i < trabajadores.size(); i++) {
            System.out.println(trabajadores.elementAt(i).getNombre());// Muestra el trabajador en la cima de la pila
        }
    }

}
