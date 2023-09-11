
import java.util.Scanner;

public class Hipotenusa_4 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        Float catetoA, catetoB;

        System.out.println("Hola, calcularemos la hipotenusa de un triangulo rectangulo");
        System.out.println("Porfavor ingresa el valor de el primer cateto");

        catetoA = Float.parseFloat(scannerTerminal.nextLine());

        System.out.println("Ahora porfavor ingresa el valor del segundo cateto");

        catetoB = Float.parseFloat(scannerTerminal.nextLine());

        System.out.println("La hipotenusa de el triangulo es " + Math.sqrt((Math.pow(catetoA, 2)) + (Math.pow(catetoB, 2))));

    }

}
