
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class decimalAbinario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingresa un numero decimal no mayor a 255: ");
            int numeroDecimal = teclado.nextInt();

            if (numeroDecimal < 0 || numeroDecimal > 255) {
                System.out.println("El numero debe estar en el rango de 0 a 255.");
                return;
            }

            int[] arregloBinario = decimalABinario(numeroDecimal);
            System.out.println("Numero decimal: " + numeroDecimal);
            System.out.print("Representacion binaria en el arreglo: ");
            imprimirArreglo(arregloBinario);

        } catch (Exception e) {
            System.out.print("El dato ingresado tiene que ser nuerico");
        }

    }

    public static int[] decimalABinario(int decimal) {
        int[] arregloBinario = new int[8];

        for (int i = 7; i >= 0; i--) {
            arregloBinario[i] = decimal % 2;
            // decimal /= 2;
            decimal = decimal / 2;
        }

        return arregloBinario;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num);
        }
        System.out.println();
    }
}
