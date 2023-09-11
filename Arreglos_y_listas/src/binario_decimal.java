
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class binario_decimal {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            int[] numerosBinarios = {1, 1, 1, 1, 1, 1, 1, 1};

            String binario = "";

            for (int i = 0; i < 8; i++) {
                binario += numerosBinarios[i];
            }

            Integer decimal = Integer.parseInt(binario, 2);

            System.out.println("Este es el valor del binario en decimal " + decimal);
            
            System.out.print("[ ");
            for (int numero : numerosBinarios) {
                System.out.print(numero + " ");
            }
            System.out.println("]");
            
        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
