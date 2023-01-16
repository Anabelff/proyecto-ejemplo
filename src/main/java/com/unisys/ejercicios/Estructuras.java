package com.unisys.ejercicios;

public class Estructuras {
    public static void main(String[] args){
        int vueltas=10;
        int i=1,j=1,k=1;
        while (i<=vueltas) {
                System.out.println("Vamos por la vuelta "+i);
                i++;
        }

        System.out.println("Ahora vamos al do ");
        do {
            System.out.println("Do Vamos por la vuelta " +j);
            j++;
        } while (j<=10);

        System.out.println("Ahora vamos al for ");
        for (k=1;k<=vueltas;k++) {
            System.out.println("For vamos por la vuelta " +k);
        }
    }
}
