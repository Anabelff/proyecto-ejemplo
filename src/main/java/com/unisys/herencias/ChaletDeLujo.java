package com.unisys.herencias;

import lombok.Data;

@Data
public class ChaletDeLujo extends Chalet{
    private Integer bagnos;

    public ChaletDeLujo() {
        super();
        this.bagnos = 1;
    }

    public ChaletDeLujo(String dirección, Float metrosCuadrados, Integer plantas, Integer bagnos) {
        super(dirección, metrosCuadrados, plantas);
        this.bagnos = bagnos;
    }

    @Override
    public String toString() {
        return "ChaletDeLujo{" +
                "dirección='" + getDirección() + '\'' +
                ", metrosCuadrados=" + getMetrosCuadrados() +
                ", Plantas=" + getPlantas() +
                ", bagnos=" + bagnos +
                '}';
    }
}
