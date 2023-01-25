package com.unisys.colecciones;

import java.util.ArrayList;
import java.util.List;

public class ProgramaColeccionesList {

    public static void main(String[] args) {
        Pieza pieza=new Pieza("Raton","inalambrico");
        List <Pieza> listado=new ArrayList<>();
        listado.add(pieza);

        Pieza pieza1 = new Pieza("teclado","inalambrico");
        Pieza pieza2 = new Pieza("teclado","inalambrico");

        listado.add(pieza1);
        listado.add(pieza2);

        OrdenadorList ordenador2 = new OrdenadorList("Dell","Latitude",listado);
        System.out.println(ordenador2.getPieza());
    }

}
