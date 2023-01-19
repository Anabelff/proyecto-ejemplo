package com.unisys.herencias;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Pepe","02537788","914151282",10000,"boss");

        empleado1.setNombre("Juan");
        empleado1.setDni("08985271");
        empleado1.setTlf("914153344");
        empleado1.setSueldo(25000);
        empleado1.setCargo("chofer");

        System.out.println(empleado1);
        System.out.println(empleado2);

        Currito currito1 = new Currito("Ana","79897979","915658768",200000,"jefaza",0);
        Jefe jefe1= new Jefe(60);
        Jefe jefe2= new Jefe();
        Jefe jefe3= new Jefe("Miguel","026687787","917985799",32000,"RRHH",10);

        jefe3.setSueldo(44);
        currito1.setNumeroTareas(3);
        System.out.println("el sueldo del currito1 es :"+currito1.getSueldo());
        currito1.setSueldo(33);
        System.out.println(currito1);

        System.out.println("Numero de empleados del jefe1: "+jefe1.getNumeroEmpleados());
        System.out.println("Numero de empleados del jefe:2 "+jefe2.getNumeroEmpleados());
        System.out.println(jefe1);
        System.out.println(jefe2);
        System.out.println(jefe3);

    }
}
