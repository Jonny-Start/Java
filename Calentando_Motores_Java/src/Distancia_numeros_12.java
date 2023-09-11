
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Distancia_numeros_12 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        int number1, number2, distancia = 0, first, second;

        try {
            System.out.println("Hola, calcularemos la distancia entre dos numeros");
            System.out.println("Porfavor ingresa el primer numero");

            number1 = Integer.parseInt(scannerTerminal.nextLine());

            System.out.println("Porfavor ingresa el segundo numero");

            number2 = Integer.parseInt(scannerTerminal.nextLine());

            if (number1 > number2) {
                first = number1;
                second = number2;
            } else {
                first = number2;
                second = number1;
            }

            for (int i = second; i < first; i++) {
                distancia++;
            }

            System.out.println("La distancia entre los numero es "+distancia);
            
        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }

    }
}
