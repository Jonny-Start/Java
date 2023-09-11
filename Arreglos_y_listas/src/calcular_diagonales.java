
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class calcular_diagonales {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);
            Random random = new Random();

            int[][] matriz = new int[3][3];
            /**
             * int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
             */

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = random.nextInt(100);
                }
            }

            System.out.println("Estos son los datos generados");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Cambio de línea después de cada fila
            }

            System.out.println("El promedio de los numeros diagonales es: " + ((matriz[0][2] + matriz[1][1] + matriz[2][0]) / 3));

        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
