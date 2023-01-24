package com.unisys.herencias;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Piso extends Casa {
    Integer numPiso;
    Piso (){
        super();
        this.numPiso=1;
    }
    public Piso(String direccion, Float metrosCuadrados, Integer numPiso){
        super(direccion,metrosCuadrados);
        this.numPiso = numPiso;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "dirección='" + getDirección() + '\'' +
                ", metrosCuadrados=" + getMetrosCuadrados() + '\'' +
                ", numPiso=" + numPiso +
                '}';
    }
}
