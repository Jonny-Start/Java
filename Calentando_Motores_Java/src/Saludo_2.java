
import java.util.Scanner; // import the Scanner class 

public class Saludo_2 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        System.out.println("Hola, ingresa tu nombre porfavor");

        String nombre = scannerTerminal.nextLine();

        System.out.println("Hola " + nombre + " un gusto saludarte!");

    }

}
