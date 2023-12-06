package com.mycompany.primerproyectocursojava;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jonny
 */
public class CiclosyCondicionales {

    public static void main(String[] args) {
        Scanner Escribir = new Scanner(System.in);

//        int num1, num2, respuesta;
//        System.out.println("Ingrese el primer numero");
//        num1 = Escribir.nextInt();
//
//        System.out.println("Ingrese el segundo numero");
//        num2 = Escribir.nextInt();
//
//        if (num1 == num2) {
//            respuesta = num1 * num2;
//        } else if (num1 > num2) {
//            respuesta = num1 - num2;
//        } else {
//            respuesta = num1 + num2;
//        }
//
//        System.out.println("La respuesta es: " + respuesta);
        int numeroActual;
        for (int i = 1; i <= 100; i++) {
            numeroActual = i;
            if (numeroActual % 7 != 0) {
                System.out.println("numero actual " + i);
            }
        }

    }
}
