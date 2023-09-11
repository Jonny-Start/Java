
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Pares_numeros_13 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Ingresa las coordenadas del primer punto:");
            System.out.print("x1: ");
            double x1 = scannerscannerTerminal.nextDouble();
            System.out.print("y1: ");
            double y1 = scannerscannerTerminal.nextDouble();

            System.out.println("Ingresa las coordenadas del segundo punto:");
            System.out.print("x2: ");
            double x2 = scannerscannerTerminal.nextDouble();
            System.out.print("y2: ");
            double y2 = scannerscannerTerminal.nextDouble();

            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            System.out.println("La distancia entre los dos puntos es: " + distancia);

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }
    }
}
