
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Iniciales_Nombre_18 {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.println("Ingresa tu nombre");
            System.out.print("Nombre: ");

            String name = scannerscannerTerminal.nextLine();

            String[] parts = name.split(" ");
            String iniciales = "";

            for (int i = 0; i < parts.length; i++) {
                String[] partsSecond = parts[i].split("");
                iniciales += partsSecond[0];
            }

            System.out.println("Tus iniciales son: " + iniciales.toUpperCase());

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados" + e);
        }
    }
}
