package com.unisys.colecciones;

import java.util.*;

public class ProgramaOrdenadorSet {

    public static void main(String[] args) {
        Pieza pieza=new Pieza("Raton","inalambrico");
        Set<Pieza> listado=new HashSet<>();
        OrdenadorSet ordenador3 = new OrdenadorSet("Dell","Latitude",listado);
        listado.add(pieza);
        listado.add(new Pieza("teclado","inalambrico"));
        listado.add(new Pieza("teclado","inalambrico"));
        listado.add(new Pieza("Monitor","24"));
        System.out.println(ordenador3.getPieces());
        SortedSet<Pieza> listadoOrdenado = new TreeSet<>(Comparator.comparing(Pieza::getNombre));
        listadoOrdenado.add(new Pieza("teclado","inalambrico"));
        listadoOrdenado.add(new Pieza("Monitor","24"));
        OrdenadorSet ordenador4 = new OrdenadorSet("HP","confi",listadoOrdenado);

        System.out.println("Listado Ordenado");
        System.out.println(listadoOrdenado);
        System.out.println(ordenador4.getPieces());

        //Cliente

        Map<String,String> cliente = new HashMap<>();
        cliente.put("nombre","pepe");
        cliente.put("dirección", "mi calle");
        cliente.put("tlf","6676798797");
        cliente.put("email","anabelf@gmail.com");

        System.out.println(cliente);

        //Mapa de clientes

        List<Map<String,String>>  listadoClientes = new ArrayList<>();
        listadoClientes.add(cliente);
        Map<String,String> cliente2 = new HashMap<>();
        cliente2.put("nombre","juan");
        cliente2.put("dirección", "abalos");
        cliente2.put("tlf","914151282");
        cliente2.put("email","pepita@gmail.com");
        listadoClientes.add(cliente2);

        System.out.println(listadoClientes);

        Set<Map<String,String>>  listadoClientesSet = new HashSet<>();
        listadoClientesSet.add(cliente);
        Map<String,String> cliente3 = new HashMap<>();
        cliente3.put("nombre","juan");
        cliente3.put("dirección", "abalos");
        cliente3.put("tlf","914151282");
        cliente3.put("email","pepita@gmail.com");
        listadoClientesSet.add(cliente);  //No lo vuelve a meter
        listadoClientesSet.add(cliente3);

        System.out.println(listadoClientesSet);
    }
}
