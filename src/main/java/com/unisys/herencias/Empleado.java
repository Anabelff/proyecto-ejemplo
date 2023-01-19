package com.unisys.herencias;

public class Empleado extends Persona {
    /*private String nombre;
    private String dni;
    private String tlf; */
    protected Integer sueldo;
    private String cargo;

    public Empleado() {
        super();
        this.sueldo = 0;
        this.cargo = "";
    }

    public Empleado(String nombre, String dni, String tlf, Integer sueldo, String cargo) {
        super(nombre,dni,tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }



    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                ", dni='" + this.getDni() + '\'' +
                ", tlf='" + this.getTlf() + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
