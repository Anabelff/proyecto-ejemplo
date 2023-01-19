package com.unisys.ejercicios;

import java.util.Date;

public class PerroLombokApp {
    public static void main(String[] args) {
        PerroLombok perrito= new PerroLombok();
        perrito.setDueno("Anabel");
        perrito.setEdad("99");
        perrito.setFecha(new Date(2004,10,04));
        System.out.println(perrito);
        PerroLombok chucho =new PerroLombok("Susana","10",new Date());
        System.out.println(chucho);
    }

}
