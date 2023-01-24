package com.unisys.colecciones;

import java.util.ArrayList;
import java.util.List;

public class OrdenadorList implements {
    private String marca;
    private String modelo;

    private List<Pieza> pieza;

    public OrdenadorList() {
        this.marca = "";
        this.modelo = "";
        this.pieza = new ArrayList<>();
    }

    public OrdenadorList(String marca, String modelo, List<Pieza> pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = pieza;
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

    public List<Pieza> getPieza() {
        return pieza;
    }

    public void setPieza(List<Pieza> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "OrdenadorList{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + pieza +
                '}';
    }
}
