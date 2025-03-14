import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner plus = new Scanner(System.in);
        System.out.println("Hello, World!");
        //aprendiendo 
        System.out.println("ingrese numero");
        int numero = plus.nextInt();

        System.out.println("tu numero es "+ numero);
        plus.close();

        System.out.println("tu mama no te quiere");
    }
}
