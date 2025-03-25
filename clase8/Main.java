import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> nombres = new Stack<>();

        System.out.println(nombres.empty());//true
        nombres.push("Messi");
        nombres.push("Ronaldo");
        nombres.push("Neymar");  
        nombres.push("Mbappe");
        nombres.push("Haaland");
        
        System.out.println(nombres);

        System.out.println(nombres.peek());

        System.out.println(nombres.search( "Ronaldo"));

        System.out.println(nombres.pop());

        System.out.println(nombres.size());


        
    }
}