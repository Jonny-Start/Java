/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisor;

/**
 *
 * @author jonny
 */
public abstract class SmartElectrodomestico {

    private int numeroSerie;
    private int tamaño;
    private String marca;
    private int modelo;

    public SmartElectrodomestico(int numeroSerie, int tamaño, String marca, int modelo) {
        this.numeroSerie = numeroSerie;
        this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos abstractos que deben ser implementados por las subclases.
    public abstract void encender();

    public abstract void apagar();

    // Getters y setters para los atributos.
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Número de Serie: " + numeroSerie
                + ", Tamaño: " + tamaño
                + ", Marca: " + marca
                + ", Modelo: " + modelo;
    }
}
