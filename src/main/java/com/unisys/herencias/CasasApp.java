package com.unisys.herencias;

public class CasasApp {
    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println(casa);
        Chalet chalet = new Chalet();
        System.out.println(chalet);
        chalet.setDirección("Mataelpino");
        chalet.setMetrosCuadrados(400.0F);
        chalet.setPlantas(1);
        System.out.println(chalet);
        chalet = new Chalet("cerceda",100.0F,1);
        System.out.println(chalet);
        Piso piso = new Piso();
        System.out.println(piso);
        piso = new Piso("Lierganes",95.0F,3);
        System.out.println(piso);
        ChaletDeLujo chaletDeLujo = new ChaletDeLujo();
        System.out.println(chaletDeLujo);
        chaletDeLujo = new ChaletDeLujo("rubalcaba",250.0F,3,2);
        System.out.println(chaletDeLujo);
    }


}
