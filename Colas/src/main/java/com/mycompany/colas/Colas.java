/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colas;

import java.util.Scanner;

/**
 *
 * @author jonny
 */
public class Colas {

    public static void main(String[] args) {

        FilaCajero filaCajero = new FilaCajero();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar estado final");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del nuevo cliente: ");
                    String nuevoCliente = scanner.nextLine();
                    filaCajero.agregarCliente(nuevoCliente);
                    break;
                case 2:
                    filaCajero.atenderCliente();
                    break;
                case 3:
                    filaCajero.mostrarEstadoFinal();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
