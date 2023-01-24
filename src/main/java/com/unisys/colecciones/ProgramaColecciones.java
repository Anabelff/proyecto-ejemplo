package com.unisys.colecciones;

import java.util.Set;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza pieza1=new Pieza("Dell Latitude","teclado");
        Ordenador ordenador1 = new Ordenador();
        ordenador1.setMarca("Dell");
        ordenador1.setModelo("Latitude");
        ordenador1.setPieza(pieza1);
        System.out.println(ordenador1.getPieza());
    }
}
