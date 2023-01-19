package com.unisys.herencias;

public class Jefe extends Empleado{
    private Integer numeroEmpleados;

    public Jefe() {
        super();
        this.numeroEmpleados = 0;
    }

    public Jefe(Integer numeroEmpleados) {
        super();
        this.numeroEmpleados = numeroEmpleados;
    }

    public Jefe(String nombre, String dni, String tlf, Integer sueldo, String cargo, Integer numeroEmpleados) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.numeroEmpleados = numeroEmpleados;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "nombre='" + this.getNombre() + '\'' +
                ", dni='" + this.getDni() + '\'' +
                ", tlf='" + this.getTlf() + '\'' +
                ", sueldo=" + this.getSueldo() +'\'' +
                ", cargo='" + this.getCargo() + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                '}';
    }
}
