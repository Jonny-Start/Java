
import java.util.Scanner;

public class Minutos_8 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        int number1, horas, minutos;
        try {
            System.out.println("Hola, calcularemos las horas y minutos con una entrada de solo minutos");
            System.out.println("Porfavor ingresa la cantidad de minutos a convertir");

            number1 = Integer.parseInt(scannerTerminal.nextLine());

            horas = number1 / 60;
            minutos = number1 % 60;

            System.out.println("Este es el resultado en horas y minutos " + horas + ":" + minutos);

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }

    }

}
