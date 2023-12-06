/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonny
 */
import java.util.ArrayList;

// Clase abstracta SmartElectrodomestico
abstract class SmartElectrodomestico {
    protected int numeroSerie;
    protected int tamaño;
    protected String marca;
    protected int modelo;

    public abstract void encender();
    public abstract void apagar();

    public void conectarInternet() {
        System.out.println("Conectando a Internet");
    }

    public void desconectarInternet() {
        System.out.println("Desconectando de Internet");
    }

    public void subirVolumen() {
        System.out.println("Subiendo volumen");
    }

    public void bajarVolumen() {
        System.out.println("Bajando volumen");
    }
}

// Clase Televisor heredera de SmartElectrodomestico
class Televisor extends SmartElectrodomestico {
    private String resolucion;

    public void cambiarCanal() {
        System.out.println("Cambiando canal");
    }
}

// Clase Celular heredera de SmartElectrodomestico
class Celular extends SmartElectrodomestico {
    private int versionAndroid;
    private String gama;

    @Override
    public void subirVolumen() {
        System.out.println("Subiendo volumen del celular");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Bajando volumen del celular");
    }
}

// Clase TiendaElectronica
class TiendaElectronica {
    private ArrayList<SmartElectrodomestico> listaSmartElectrodomesticos = new ArrayList<SmartElectrodomestico>();

    public void agregarSmartElectrodomestico(SmartElectrodomestico electrodomestico) {
        listaSmartElectrodomesticos.add(electrodomestico);
    }
}

public class Main {
    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica();

        // Crear e agregar 5 celulares a la tienda
        for (int i = 1; i <= 5; i++) {
            Celular celular = new Celular();
            tienda.agregarSmartElectrodomestico(celular);
        }

        // Ejecutar métodos y mostrar el tipo de dispositivo
        for (SmartElectrodomestico electrodomestico : tienda.listaSmartElectrodomesticos) {
            electrodomestico.encender();
            electrodomestico.subirVolumen();
            // Agregar más métodos aquí...
        }
    }
}

