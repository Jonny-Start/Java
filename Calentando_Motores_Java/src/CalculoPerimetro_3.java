
import java.util.Scanner;

public class CalculoPerimetro_3 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        Float base, altura;

        System.out.println("Hola, calcularemos el area y el perimetro de un rectangulo");
        System.out.println("Porfavor ingresa la base del rectangulo");

        base = Float.parseFloat(scannerTerminal.nextLine());

        System.out.println("Ahora porfavor ingresa la altura del rectangulo");

        altura = Float.parseFloat(scannerTerminal.nextLine());

        System.out.println("El Area de el rectangulo es " + base * altura + "m^2 // y el perimetro es " + ((2 * base) + (2 * altura)) + "m");

    }

}
