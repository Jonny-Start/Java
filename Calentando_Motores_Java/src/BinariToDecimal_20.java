
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SALA
 */
public class BinariToDecimal_20 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Convertir numero binario a decimal ");
            System.out.print("Binario a convertir: ");
            String binario = scannerscannerTerminal.nextLine();

            Integer numero = Integer.parseInt(binario, 2);
            System.out.println("Este es el numero decimal: " + numero);

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
