package com.unisys.ejercicios;

public class Perro {
    public static String raza;

    public Perro() {
        this.raza="";
    }

    public Perro(String raza) {
        this.raza=raza;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{raza: " +raza+"}";
    }
}

