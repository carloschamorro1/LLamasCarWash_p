package edu.ujcv.progra2.Menu;

import edu.ujcv.progra2.Utilidades.LectorTeclado;
import edu.ujcv.progra2.Menu.MenuClientes;
import edu.ujcv.progra2.Menu.MenuReportes;
import edu.ujcv.progra2.Menu.MenuServicios;

public class MenuPrincipal {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    MenuClientes menuClientes = new MenuClientes();
    MenuServicios menuServicios = new MenuServicios();
    MenuReportes menuReportes = new MenuReportes();
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("\n \t \t Carwash Fuera JOH \n");
        System.out.println("1.............. Gestionar Clientes");
        System.out.println("2.............. Servicios");
        System.out.println("3.............. Reportes");
        System.out.println("4.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                menuClientes.presentarOpciones();
                menuClientes.procesarOpcion(menuClientes.leerOpciones());
                break;
            case 2:
                menuServicios.presentarOpciones();
                menuServicios.procesarOpcion(menuServicios.leerOpciones());
                break;
            case 3:
                menuReportes.presentarOpciones();
                menuReportes.procesarOpcion(menuReportes.leerOpciones());
                break;
            case 4:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
}
