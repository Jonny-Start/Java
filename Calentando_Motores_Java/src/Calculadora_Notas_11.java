
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class Calculadora_Notas_11 {

    public static void main(String[] args) {

        Scanner scannerTerminal = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, nota5;

        try {
            System.out.println("Hola, calcularemos la nota final tomando encuenta los parametros de: 3 notas parciales = 55%, Examen final = 30%, Trabajo final = 15%");

            System.out.println("Ingresa la primer nota parcial");
            nota1 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa la segunda nota parcial");
            nota2 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa la tercer nota parcial");
            nota3 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa la calificacion del examen final");
            nota4 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Ingresa las nota del trabajo final");
            nota5 = Float.parseFloat(scannerTerminal.nextLine());

            System.out.println("Esta es tu nota final " + ((((nota1 + nota2 + nota3) / 3) * 0.55) + (nota4 * 0.30) + (nota5 * 0.15)));

        } catch (Exception e) {
            System.out.println("No puede estar vacio el campo de los numeros " + e);
        }
    }

}
