
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Descuento_10 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        float totalCompra;
        double porcentaje = 0.15;
        try {
            System.out.println("Hola, restaremos en 15% total de el valor inscrito");
            System.out.println("Ingresa el porfavor valor total");

            totalCompra = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Este es total que debera pagar ya con el 15% aplicado " + (totalCompra - (totalCompra * porcentaje)));

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e); 
        }
    }

}
