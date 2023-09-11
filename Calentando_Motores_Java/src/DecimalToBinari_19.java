import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class DecimalToBinari_19 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Convertir numero decimal a binario");
            System.out.print("Numero a convertir: ");
            Integer numero = Integer.parseInt(scannerscannerTerminal.nextLine());
            String binario = Integer.toBinaryString(numero);
            System.out.println("Este es el numero binario: " + binario);
        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
    
}
