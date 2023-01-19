package com.unisys.ejercicios;

public class Variables {

    public static void main ( String[] args) {
        int numero=1;
        short marianico=23;
        long gasol=1000;
        boolean independencia=true;
        double presupuesto =10.00;
        float longitud = 14.4f;
        long suma;

        suma = gasol +marianico;

        System.out.println("El valor de numero es " +numero ) ;
        System.out.println("El valor de marianico es " +marianico ) ;
        System.out.println("El valor de gasol es " +gasol ) ;
        System.out.println("El valor de independencia es " +independencia ) ;
        System.out.println("El valor de presupuesto es " +presupuesto ) ;
        System.out.println("El valor de longitud es " +longitud ) ;

        System.out.println("El valor de suma es " +suma);

    }


    public static class EstaticosApp {
        public static void main(String[] args) {
            System.out.println(PerroLombok.Estaticos.PI);
            PerroLombok.Estaticos.berrinche();
        }
    }
}
