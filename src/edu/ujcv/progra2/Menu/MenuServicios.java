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
        System.out.println("1.............. Lavado de Vehiculo               L90.00");
        System.out.println("2.............. Lavado y Aspirado de Vehiculo    L150.00");
        System.out.println("3.............. Aspirado de Vehiculo             L60.00");
        System.out.println("4.............. Lavado de motor                  L250.00");
        System.out.println("5.............. Shamposeado                      L950.00");
        System.out.println("6.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                facturar(90,"Lavado de Vehiculo");
                break;
            case 2:
                facturar(150,"Lavado y Aspirado de Vehiculo");
                break;
            case 3:
                facturar(60,"Aspirado de Vehiculo");
                break;
            case 4:
                facturar(250,"Lavado de motor ");
                break;
            case 5:
                facturar(950,"Shamposeado");
                break;
            case 6:
                System.out.println("Has regresado al menu principal");
                break;
        }
    }

    public void facturar(int precio, String nombre){
        gestionFacturacion.subtotal2 = precio;
        gestionFacturacion.servicio1 = nombre;
        gestionFacturacion.facturar();
    }
}
