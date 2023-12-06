/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.televisor;

/**
 *
 * @author jonny
 */
public class Televisor {

    private int numeroSerie;
    private int tamaño;
    private String resolución;
    private String marca;
    private boolean esSmartTV;
    private boolean encendido;
    private int volumen;

    public Televisor(int numeroSerie, int tamaño, String resolución, String marca, boolean esSmartTV) {
        this.numeroSerie = numeroSerie;
        this.tamaño = tamaño;
        this.resolución = resolución;
        this.marca = marca;
        this.esSmartTV = esSmartTV;
        this.encendido = false;
        this.volumen = 0;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void encender() {
        if (!encendido) {
            System.out.println("Encendiendo el televisor");
            encendido = true;
        } else {
            System.out.println("El televisor ya está encendido");
        }
    }

    public void apagar() {
        if (encendido) {
            System.out.println("Apagando el televisor");
            encendido = false;
        } else {
            System.out.println("El televisor ya está apagado");
        }
    }

    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen subido: " + volumen);
        } else {
            System.out.println("No puedes subir el volumen si el televisor está apagado");
        }
    }

    public void bajarVolumen() {
        if (encendido) {
            if (volumen > 0) {
                volumen--;
                System.out.println("Volumen bajado: " + volumen);
            } else {
                System.out.println("El volumen ya está en el mínimo");
            }
        } else {
            System.out.println("No puedes bajar el volumen si el televisor está apagado");
        }
    }

    /*
    public static void main(String[] args) {
        Televisor miTelevisor = new Televisor(55, "4K", "Sony", true);
        miTelevisor.encender();
        miTelevisor.subirVolumen();
        miTelevisor.subirVolumen();
        miTelevisor.bajarVolumen();
        miTelevisor.apagar();
    }*/
}
