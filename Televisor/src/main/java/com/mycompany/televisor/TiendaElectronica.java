/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisor;

import java.util.ArrayList;

/**
 *
 * @author jonny
 */
public class TiendaElectronica {

    private String nombre;
    private ArrayList<Televisor> listaTelevisores;

    public TiendaElectronica(String nombre) {
        this.nombre = nombre;
        this.listaTelevisores = new ArrayList<>();
    }

    public void agregarTV(Televisor televisor) {
        listaTelevisores.add(televisor);
        System.out.println("Televisor agregado a la tienda.");
    }

    public void eliminarTV(int numeroSerie) {
        Televisor televisorAEliminar = encontrarTV(numeroSerie);
        if (televisorAEliminar != null) {
            listaTelevisores.remove(televisorAEliminar);
            System.out.println("Televisor eliminado de la tienda.");
        } else {
            System.out.println("No se encontró un televisor con el número de serie proporcionado.");
        }
    }

    public Televisor encontrarTV(int numeroSerie) {
        for (Televisor televisor : listaTelevisores) {
            if (televisor.getNumeroSerie() == numeroSerie) {
                return televisor;
            }
        }
        return null; // No se encontró un televisor con el número de serie proporcionado.
    }

    public static void main(String[] args) {
        TiendaElectronica miTienda = new TiendaElectronica("Mi Tienda Electrónica");

        Televisor tv1 = new Televisor(1, 55, "4K", "Sony", true);
        Televisor tv2 = new Televisor(2, 43, "Full HD", "Samsung", false);
        Televisor tv3 = new Televisor(3, 65, "8K", "LG", true);

        miTienda.agregarTV(tv1);
        miTienda.agregarTV(tv2);
        miTienda.agregarTV(tv3);

        miTienda.eliminarTV(2);

        Televisor encontrado = miTienda.encontrarTV(1);
        if (encontrado != null) {
            System.out.println("Televisor encontrado: " + encontrado);
        } else {
            System.out.println("Televisor no encontrado.");
        }
    }
}
