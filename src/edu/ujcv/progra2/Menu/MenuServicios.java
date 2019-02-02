package edu.ujcv.progra2.Menu;

import edu.ujcv.progra2.Utilidades.LectorTeclado;

public class MenuServicios {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    public void presentarOpciones() {
        System.out.println("1.............. Servicio 1");
        System.out.println("2.............. Servicio 2");
        System.out.println("3.............. Servicio 3");
        System.out.println("4.............. Servicio 4");
        System.out.println("5.............. Servicio 5");
        System.out.println("6.............. Facturar");
        System.out.println("7.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Has regresado al menu principal");
                break;
        }
    }

}
