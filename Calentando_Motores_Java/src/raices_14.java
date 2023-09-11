
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class raices_14 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Ingresa el numero a sacar la raiz cuiadrada y cubica:");
            System.out.print("Numero: ");
            double numero = scannerscannerTerminal.nextDouble();

            if (numero < 0) {
                System.out.println("El numero ingresado no puede ser menor a 0 ");
                return;
            }

            System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
            System.out.println("La raiz cubica es: " + Math.cbrt(numero));

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
