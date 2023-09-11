
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Intercambio_valores_16 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Ingresa el valor de las variables");
            System.out.print("A: ");
            String A = scannerscannerTerminal.nextLine();
            System.out.print("B: ");
            String B = scannerscannerTerminal.nextLine();
            System.out.println("Intercambio de variables ...");

            String C = A;
            A = B;
            B = C;

            System.out.println("A: " + A);
            System.out.println("B: " + B);

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
