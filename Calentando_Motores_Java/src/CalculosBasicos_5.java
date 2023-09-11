
import java.util.Scanner;

public class CalculosBasicos_5 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        Float number1, number2;
        try {
            System.out.println("Hola, calcularemos la suma, resta, división y multiplicación");
            System.out.println("Porfavor ingresa el primer numero");

            number1 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ahora porfavor ingresa el segundo numero");

            number2 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("La suma es " + (number1 + number2));
            System.out.println("La resta es " + (number1 - number2));
            System.out.println("La multiplicacion es " + (number1 * number2));
            if (number2 == 0 || number2 <= 0) {
                System.out.println("El denominador no puede ser 0 o el segundo valor no puede ser 0 para la division");
                return;
            }
            System.out.println("La division es " + (number1 / number2));
        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }

    }

}
