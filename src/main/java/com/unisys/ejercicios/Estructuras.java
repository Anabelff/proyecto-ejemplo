package com.unisys.ejercicios;

public class Estructuras {

    //Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND= "\u001B[41m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args){
        int vueltas=10;
        int i=0;

        while (i<=vueltas) {
                System.out.println("Vamos por la vuelta "+i);
                i++;
        }
        i=0;
        System.out.println("Ahora vamos al do ");
        do {
            System.out.println("Do Vamos por la vuelta " +i);
            i++;
        } while (i<=10);

        System.out.println("Ahora vamos al for ");
        for (i=0;i<=vueltas;i++) {
            System.out.println("For vamos por la vuelta " +i);
        }

        int edad=19;
        System.out.println(ANSI_BLUE+"LA edad es:" +edad+ANSI_RESET);
        if (edad <= 18) {
            System.out.println("No puede conducir");
        } else {
            System.out.println("Puede conducir");
        }
        System.out.println("If con elseif");
  /*      if (edad ==18) {
            System.out.println("Puede conducir");
        } else if (edad==21){
            System.out.println("Puede conducir en USA");
        } else {
            System.out.println("La edad es " +edad);
        }

   */

        switch (edad) {
            case 18:
                System.out.println("Puede conducir");
                break;
            case 20:
                System.out.println("Puede beber en USA");
                break;
            default:
                System.out.println(ANSI_BLUE+"la edad es: " +edad+ANSI_RESET);
        }

        i = 0;
        while (i < 10) {
            if (i == 2) {
                i++;
                continue;
            }
            else if (i == 5) break;
            else System.out.println("While Vamos por la vuelta "+ i);
            i++;
            }

    }
}
