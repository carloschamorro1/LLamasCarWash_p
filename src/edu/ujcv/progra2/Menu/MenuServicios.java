package edu.ujcv.progra2.Menu;

import edu.ujcv.progra2.Gestion.GestionFacturacion;
import edu.ujcv.progra2.Modelos.Facturas;
import edu.ujcv.progra2.Utilidades.LectorTeclado;

import java.util.ArrayList;

public class MenuServicios {
    public int opcion;
    Facturas servicio = new Facturas();
    LectorTeclado lt = new LectorTeclado();
    GestionFacturacion gestionFacturacion = new GestionFacturacion();
    public void presentarOpciones() {
        System.out.println("1.............. Lavado de Vehiculo");
        System.out.println("2.............. Lavado y Aspirado de Vehiculo");
        System.out.println("3.............. Aspirado de Vehiculo");
        System.out.println("4.............. Lavado de motor");
        System.out.println("5.............. Shamposeado");
        System.out.println("6.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                this.servicio.setServicio("Lavado de Vehiculo");
                this.servicio.setPrecio("90");
                gestionFacturacion.facturar();
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
                System.out.println("Has regresado al menu principal");
                break;
        }
    }

}
