
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
import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {

        int TamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));

        String Nombre[];
        Nombre = new String[TamanoArreglo];

        int Edad[];
        Edad = new int[TamanoArreglo];

        String Especialidad[];
        Especialidad = new String[TamanoArreglo];

        int i;
        for (i = 0; i < Nombre.length; i++) {
            Nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del obrero");
            Edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las edad"));
            Especialidad[i] = JOptionPane.showInputDialog("Ingrese la especialidad");

        }

        int j;

        for (j = (TamanoArreglo - 1); j >= 0; j--) {
            System.out.println("Nombre: " + Nombre[j] + " Edad: " + Edad[j] + " Especialidad: " + Especialidad[j]);
        }

        /*
            for (j = 0; j < Nombre.length; j++) {
                System.out.println("Nombre: " + Nombre[j] + " Edad: " + Edad[j] + " Especialidad: " + Especialidad[j]);

            }
         */
    }
}
