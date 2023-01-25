package com.unisys.colecciones;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class OrdenadorSet implements Serializable {
    private static final long serialVersionUID = 1L;
    private String marca;
    private String modelo;

    private Set<Pieza> pieces;

    public OrdenadorSet() {
        this.marca = "";
        this.modelo = "";
        this.pieces = new HashSet<>();
    }
    public OrdenadorSet(String marca, String modelo, Set<Pieza> pieces) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieces = pieces;
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

    public Set<Pieza> getPieces() {
        return pieces;
    }

    public void setPieces(Set<Pieza> pieces) {
        this.pieces = pieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenadorSet that = (OrdenadorSet) o;
        return Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(pieces, that.pieces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, pieces);
    }
}
