package com.unisys.ejercicios;

public class Cadenas {
    public static void main(String [] args) {
        String saludo = "Hola";
        System.out.println(saludo);
        System.out.println(saludo.charAt(3));
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf("l"));
        String saludo2="pepe";
        Colores color =new Colores();
        System.out.println(color.ANSI_RED+saludo2.equalsIgnoreCase(saludo)+color.ANSI_RESET);
        System.out.println("\uD83D\uDC7D"); // y un emoji
    }
}
