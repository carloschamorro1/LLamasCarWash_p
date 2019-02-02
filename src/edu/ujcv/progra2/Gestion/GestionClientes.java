package edu.ujcv.progra2.Gestion;

import edu.ujcv.progra2.Fileio.LectorCvsCliente;
import edu.ujcv.progra2.Fileio.EscritorCvsCliente;
import edu.ujcv.progra2.Modelos.Cliente;
import edu.ujcv.progra2.Utilidades.LectorTeclado;

import java.util.ArrayList;

public class GestionClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void obtenerClientes() {
        clientes = LectorCvsCliente.readCsvFile("Clientes.csv");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getIdentidad() + "\t \t" + cliente.getPrimerNombre() + "\t \t \t \t"
                    + cliente.getPrimerApellido() + "\t \t \t \t" + cliente.getCodigoCliente());
        }
    }

    public ArrayList<Cliente> addClient(){
        LectorTeclado lt = new LectorTeclado();
        Cliente datos = new Cliente();
        datos.setIdentidad(lt.leerString("Por favor ingrese la identidad"));
        datos.setPrimerNombre(lt.leerString("Por favor ingrese el primer nombre"));
        datos.setPrimerApellido(lt.leerString("Por favor ingrese el primer apellido"));
        datos.setCodigoCliente(lt.leerString("Por favor ingrese el codigo del cliennte"));
        clientes.add(new Cliente(datos.getIdentidad(),datos.getPrimerNombre(),datos.getPrimerApellido(), datos.getCodigoCliente()));
        EscritorCvsCliente.writeCsvFile("Clientes.csv",clientes,false);
        return clientes;
    }

    public void deleteClient() {
        clientes = LectorCvsCliente.readCsvFile("Clientes.csv");
        int i = 0;
        for (Cliente cliente:clientes) {
            i++;
            if(clientes.size()== i){
                clientes.remove(clientes.size()-1);
                EscritorCvsCliente.writeCsvFileE("Clientes.csv",clientes,false);
                clientes.add(new Cliente("","","",""));
            }
        }

    }


    public void getClient(){
        LectorTeclado lt = new LectorTeclado();
        clientes = LectorCvsCliente.readCsvFile("Clientes.csv");
        int num = lt.leerEntero("Escriba el indice del cliente que desea obtener", "Error ha ingresado un numero no valido");
        int i = 0;
        for (Cliente clientes : clientes) {
            i++;
            if(num == i){
                System.out.println(clientes.getIdentidad() + "\t \t" + clientes.getPrimerNombre() + "\t \t \t \t"
                        + clientes.getPrimerApellido() + "\t \t \t \t" + clientes.getCodigoCliente());
            }
        }
        if(clientes.size() < num)
            System.out.println("No existe registro de clientes en ese indice");
    }
}
