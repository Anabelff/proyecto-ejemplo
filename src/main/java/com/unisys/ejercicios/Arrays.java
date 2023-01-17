package com.unisys.ejercicios;

public class Arrays {
    public static void main (String[] args){
        int [] miArray={1,2,3,4};

        int i;
        for (i=0;i<miArray.length;i++) {
            System.out.println("For:El valor del elemento " +i + " del array es " + miArray[i]);
        }
        i=0;
        while (i<miArray.length) {
            System.out.println("While:El valor del elemento " +i + " del array es " + miArray[i]);
            i++;
        }
        System.out.println("Ahora vamos con el Do While");
        i=0;
        do {
            System.out.println("Do While:El valor del elemento " +i + " del array es " + miArray[i]);
            i++;
        } while (i<miArray.length);

        Float [] flotantes = new Float[2000];

        for (i=0;i<flotantes.length;i++) {
            flotantes[i]=0.0f;
        }
        flotantes[2] = 7.3f;
        System.out.println(flotantes[2]);
        System.out.println(flotantes.length);

    }
}
