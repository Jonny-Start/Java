/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primerproyectocursojava;

import java.util.Scanner;

/**
 *
 * @author jonny
 */
public class PrimerProyectoCursoJava {

    public static void main(String[] args) {
        String nombre;
        int edad;
        float altura;

//        nombre = "Jonnny alejandro cano Acosta";
//        edad = 21;
//        altura = 1.66f;
        //sout
        Scanner Escribir = new Scanner(System.in);

        System.out.println("Ingrese su Nombre: ");

        nombre = Escribir.next();

        System.out.println("Ingrese su edad: ");

        edad = Escribir.nextInt();

        System.out.println("Hola bienvenido mi nombre es " + nombre + " y tengo " + edad + " años");

    }
}
