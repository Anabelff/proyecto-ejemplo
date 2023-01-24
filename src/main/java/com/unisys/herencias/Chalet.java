package com.unisys.herencias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Chalet extends Casa{
    private Integer plantas;
    //super();

    Chalet (String dirección,Float metrosCuadrados,Integer plantas){
        super(dirección, metrosCuadrados);
        this.plantas=plantas;
    }

    @Override
    public String toString() {
        return "Chalet{" +
                "dirección='" + getDirección() + '\'' +
                ", metrosCuadrados=" + getMetrosCuadrados() +
                ", Plantas=" + plantas +
                '}';
    }
}
