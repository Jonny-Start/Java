
import java.util.Scanner;

public class Fahrenheit_6 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        Float number1;
        try {
            System.out.println("Hola, calcularemos los grados Celsius dado valores en Fahrenheit");
            System.out.println("Porfavor ingresa el valor de grados Fahrenheit");

            number1 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("En grados Celsius son " + ((number1 - 32) * 5 / 9));

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }

    }

}
