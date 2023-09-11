
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
public class arreglo_primos {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            ArrayList<Integer> numerosPrimos = new ArrayList<>();

            System.out.println("Ingresa el numero inicial para hallar numeros primos");
            System.out.print("#: ");
            int inicialNum = scannerscannerTerminal.nextInt();
            System.out.println("Ahora ingresa el numero final");
            System.out.print("#: ");
            int finalNum = scannerscannerTerminal.nextInt();

            if (finalNum <= inicialNum) {
                System.out.println("El numero final no puede ser menor o igual al numero inicial");
            }

            for (int i = inicialNum; i <= finalNum; i++) {
                int countCero = 0;

                for (int j = 1; j <= i; j++) {
                    if (countCero >= 3) {
                        break;
                    }
                    if ((i % j) == 0) {
                        countCero++;
                    }
                }

                if (countCero <= 2) {
                    numerosPrimos.add(i);
                }

            }

            System.out.println("Los numeros primos entre el rango " + inicialNum + " y " + finalNum + " son: ");
            System.out.println(numerosPrimos);

        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
