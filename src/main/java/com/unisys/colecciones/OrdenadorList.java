package com.unisys.colecciones;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class OrdenadorList implements Serializable{

    private static final long serialVersionUID = 1L;
    private String marca;
    private String modelo;

    private List<Pieza> piezas;

    public OrdenadorList() {
        this.marca = "";
        this.modelo = "";
        this.piezas = new ArrayList<Pieza>();
    }

    public OrdenadorList(String marca, String modelo, List<Pieza> piezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = piezas;
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
        return piezas;
    }

    public void setPieza(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "OrdenadorList{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + piezas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenadorList that = (OrdenadorList) o;
        return Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(piezas, that.piezas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, piezas);
    }
}
