
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SALA
 */
public class Primo_21 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Saber si un numero es primo ");
            System.out.print("Numero: ");
            Integer numero = Integer.parseInt(scannerscannerTerminal.nextLine());

            int countCero = 0;

            for (int i = 1; i <= numero; i++) {
                if (countCero >= 3) {
                    break;
                }
                if ((numero % i) == 0) {
                    countCero++;
                }
            }

            if (countCero > 2) {
                System.out.println("El numero: " + numero + " NO es primo");
            } else {
                System.out.println("El numero: " + numero + " es primo");
            }

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
