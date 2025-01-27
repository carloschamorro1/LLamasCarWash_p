package edu.ujcv.progra2.Menu;


import edu.ujcv.progra2.Gestion.GestionClientes;
import edu.ujcv.progra2.Utilidades.LectorTeclado;

public class MenuClientes {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    GestionClientes gestionClientes = new GestionClientes();
    public void presentarOpciones() {
        System.out.println("1.............. Presentar lista de clientes");
        System.out.println("2.............. Agregar clientes al final");
        System.out.println("3.............. Eliminar cliente");
        System.out.println("4.............. Obtener cliente en especifico");
        System.out.println("5.............. Regresar al menu principal");

    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("\n La lista de cliente es:");
                System.out.println("Identidad \t \t Primer nombre \t \t Primer Apellido \t \t Codigo");
                gestionClientes.obtenerClientes();
                System.out.println();
                break;
            case 2:
                gestionClientes.addClient();
                System.out.println();
                break;
            case 3:
                gestionClientes.deleteClient();
                System.out.println();
                break;
            case 4:
                gestionClientes.getClient();
                System.out.println();
                break;
            case 5:
                System.out.println("Has regresado al menu principal");
        }
    }

}
