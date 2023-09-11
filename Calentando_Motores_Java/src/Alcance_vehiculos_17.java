
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Alcance_vehiculos_17 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.print("Ingresa la distancia entre los vehículos (km): ");
            double distancia = scannerscannerTerminal.nextDouble();

            System.out.print("Ingresa la velocidad del vehículo más lento (km/h): ");
            double v1 = scannerscannerTerminal.nextDouble();

            System.out.print("Ingresa la velocidad del vehículo más rápido (km/h): ");
            double v2 = scannerscannerTerminal.nextDouble();

            // Calcula el tiempo en horas para que el vehículo más rápido alcance al otro
            double tiempoEnHoras = distancia / (v2 - v1);

            // Convierte el tiempo a minutos
            double tiempoEnMinutos = tiempoEnHoras * 60;

            System.out.println("El vehículo más rápido alcanzará al otro en " + tiempoEnMinutos + " minutos.");
        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }

}
