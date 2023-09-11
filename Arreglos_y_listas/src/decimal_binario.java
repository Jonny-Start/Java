
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class decimal_binario {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            Integer numero = 255;
            String binario = Integer.toBinaryString(numero);

            ArrayList<String> numerosBin = new ArrayList<>();

            String[] binarioParts = binario.split("");

            for (int i = 0; i < 8; i++) {
                numerosBin.add(binarioParts[i]);
            }

            System.out.println("Este es el arreglo con los numeros binarios de tu numero decimal: ");

            System.out.print("[ ");
            for (String numerosFor : numerosBin) {
                System.out.print(numerosFor + " ");
            }
            System.out.println("]");

        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
