package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerroLombok {
    private String dueno;
    private String edad;
    private Date fecha;

    public static class Estaticos {
        public static final double PI = Math.PI;

        public static void berrinche (){
            System.out.println("\uD83D\uDE2D");
            System.out.println("\uD83D\uDC83");
        }


    }
}
