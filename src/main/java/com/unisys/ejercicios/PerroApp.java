package com.unisys.ejercicios;

public class PerroApp {
    public static void main(String[] args) {
        Perro toby= new Perro();
        toby.setRaza("terrier");
        System.out.println("la raza de toby es " +toby.getRaza());
        Perro Heidi =new Perro();
        Heidi.raza = "collie";
        System.out.println("la raza de Heidi es " +Heidi.raza);
        Perro otto =new Perro();
        System.out.println("la raza de otto es " +otto.raza);
        otto.setRaza("Pastor Aleman");
        System.out.println("la raza de otto es " +otto.getRaza());
        Perro fluky =new Perro("Perro de Aguas");


        System.out.println("la raza de fluky es " +fluky.toString());
    }
}
