/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auto;

/**
 *
 * @author jonny
 */
public class Auto {

    //atributos
    String marca;
    final String placa; //si es final no se puede cambiar el valor una vez definido 
    int modelo;
    String color;
    double kilometraje;
    float velocidad;
    boolean autoEncendido;
    Motor motor;

    public Auto(String marca, String placa, int modelo, String color, double kilometraje, float velocidad, boolean autoEncendido, Motor motor) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.velocidad = velocidad;
        this.autoEncendido = false;
        this.motor = motor;
    }
}
