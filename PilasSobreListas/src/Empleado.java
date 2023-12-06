/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonny
 */
public class Empleado {

    String nombre;
    String ID;

    public Empleado(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Persona Nombre: " + nombre + ", ID: " + ID; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
