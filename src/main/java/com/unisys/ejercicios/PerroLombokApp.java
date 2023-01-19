package com.unisys.ejercicios;

public class PerroLombokApp {
    public static void main(String[] args) {
        PerroLombok perrito= new PerroLombok();
        perrito.setDueno("Anabel");
        perrito.setEdad("99");
        System.out.println(perrito);
        PerroLombok chucho =new PerroLombok("Susana","10");
        System.out.println(chucho);
    }

}
