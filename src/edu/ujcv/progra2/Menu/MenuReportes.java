package edu.ujcv.progra2.Menu;

import edu.ujcv.progra2.Utilidades.LectorTeclado;

public class MenuReportes {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    public void presentarOpciones() {
        System.out.println("1.............. Presentar lista de facturas");
        System.out.println("2.............. Imprimir reporte");
        System.out.println("3.............. Salir");
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
                System.out.println("Has regresado al menu principal");
                break;
        }
    }

}
