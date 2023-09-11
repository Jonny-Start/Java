
import java.util.Scanner;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SALA
 */
public class ArrayDinamico {

    public static void main(String[] args) {
        try {
            Scanner scannerscannerTerminal = new Scanner(System.in);

            System.out.print("De que tamaño quiere el arreglo: ");
            Integer tamaño = scannerscannerTerminal.nextInt();

            Integer[] arrayUser = new Integer[tamaño];

            for (int i = 0; i < tamaño; i++) {
                System.out.print("pocision " + i + ": ");
                arrayUser[i] = scannerscannerTerminal.nextInt();
            }

            System.out.println("Este es tu arreglo: ");

            System.out.print("[");
            for (int j = 0; j < arrayUser.length; j++) {
                System.out.print("[" + arrayUser[j] + "]");
            }
            System.out.println("]");
                        
            System.out.print("[");
            for (int n = arrayUser.length - 1; n >= 0; n--) {
                System.out.print("[" + arrayUser[n] + "]");
            }
            System.out.println("]");
            

            //JOptionPane.showMessageDialog(null, "Hello World");

            //String name = JOptionPane.showInputDialog("Type your name please");
            //JOptionPane.showMessageDialog(null, "Hello " + name);

        } catch (Exception e) {
            System.out.println("Revisa los valores ingresados " + e);
        }
    }
}
