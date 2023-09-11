
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
public class insertArray {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            ArrayList<Float> numeros = new ArrayList<>();

            System.out.println("Ingresa cuantos numeros seran ingresados");
            System.out.print("#: ");
            int cant = scannerscannerTerminal.nextInt();
            System.out.println("Ahora ingresa los numeros");

            float sum = 0;
            for (int i = 1; i <= cant; i++) {
                System.out.print("#: ");
                float inc = scannerscannerTerminal.nextFloat();
                numeros.add(inc);
                sum += inc;
            }

            System.out.println(numeros);
            System.out.println("El promedio de los numeros ingresados es: " + (sum / cant));

        } catch (Exception e) {
            System.out.println("Revisa los datos ingresados " + e);
        }
    }
}
