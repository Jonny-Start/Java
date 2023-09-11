
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class array_bidimensional {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);
            Random random = new Random();

            int[][] matriz = new int[4][4];

            int CountImpar = 0, CountPar = 0, sumImpar = 0, sumPar = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matriz[i][j] = random.nextInt(100);

                    if (matriz[i][j] % 2 == 0) {
                        //El número es par
                        CountPar++;
                        sumPar += matriz[i][j];

                    } else {
                        //El número es impar
                        CountImpar++;
                        sumImpar += matriz[i][j];
                    }

                }
            }

            System.out.println("Estos son los datos generados");
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Cambio de línea después de cada fila
            }
            
            System.out.print("El promedio de los numeros pares es: " + (sumPar / CountPar));
            System.out.println(" y el promedio de los numero impares es: " + (sumImpar / CountImpar));

        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
