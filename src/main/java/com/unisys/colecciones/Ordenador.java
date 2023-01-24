package com.unisys.colecciones;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ordenador implements Serializable {

    private String marca;
    private String modelo;

    private Pieza  pieza;

    public Ordenador(String marca, String modelo, Pieza pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = pieza;
    }

    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.pieza=new Pieza();
        this.pieza.setNombre("");
        this.pieza.setTipoPieza("");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza='" + pieza + '\'' +
                '}';
    }
}
