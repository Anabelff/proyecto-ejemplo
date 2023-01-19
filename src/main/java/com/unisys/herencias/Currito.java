package com.unisys.herencias;

public class Currito extends Empleado{
    private Integer numeroTareas;

    public Currito() {
        super();
        this.numeroTareas = 0;
    }

    public Currito(String nombre, String dni, String tlf, Integer sueldo, String cargo, Integer numeroTareas) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.numeroTareas = numeroTareas;
    }

    public Integer getNumeroTareas() {
        return numeroTareas;
    }

    public void setNumeroTareas(Integer numeroTareas) {
        this.numeroTareas = numeroTareas;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "nombre='" + this.getNombre() + '\'' +
                ", dni='" + this.getDni() + '\'' +
                ", tlf='" + this.getTlf() + '\'' +
                ", sueldo=" + this.getSueldo() + '\'' +
                ", cargo='" + this.getCargo() + '\'' +
                ", numeroTareas=" + numeroTareas +
                '}';
    }
}
