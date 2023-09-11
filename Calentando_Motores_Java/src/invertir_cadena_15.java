
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class invertir_cadena_15 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Ingresa el numero o la frace a invertir");
            System.out.print("Ingresa: ");

            String text = scannerscannerTerminal.nextLine();

            String[] parts = text.split("");
            String outputText = "";

            for (int i = parts.length - 1; i >= 0; i--) {
                outputText += parts[i];
            }

            System.out.println("El texto invertido es: " + outputText);

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
