package edu.ujcv.progra2.Gestion;

import edu.ujcv.progra2.Fileio.LectorCvsReportes;
import edu.ujcv.progra2.Modelos.Reportes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GestionReportes {
    private ArrayList<Reportes> reportes = new ArrayList<>();


    public void imprimirLista(){
        reportes = LectorCvsReportes.readCsvFile("Reportes.csv");
        for (Reportes reporte: reportes) {
            System.out.println(reporte.getNombre() + "\t \t \t" + reporte.getRtn() + "\t \t \t " + reporte.getCantidadProductos() + "\t \t \t" + reporte.getTotal());
        }
    }

    public void imprimirReporte(){
        reportes = LectorCvsReportes.readCsvFile("Reportes.csv");
        double x;
        int i = 0;
        int y = 0;
        System.out.println("\n \t \t \t \t \t \t  REPORTE \n \t \t \t \t \t \t  ======= \n");
        System.out.println("\t \t \t \t \t CarWash FUERA JOH");
        System.out.println("\t \t \t \t \t RTN: 08019878659894");
        System.out.println("\t \t \t Centro Comercial Portal de Viera");
        System.out.println("\t \t \t Carretera al Hatillo, Tegucigalpa");
        System.out.println("\t \t \t \t \t Tel: +504 2248-6974");
        System.out.println("\t \t \t Correo: mercadito_torres@gmail.com");
        DateFormat hourdateFormat = new SimpleDateFormat("MMMM/yyyy");
        DateFormat hourdateFormat2 = new SimpleDateFormat("MMMM");
        Date date = new Date();
        System.out.println("\t \t \t \t \t" + hourdateFormat.format(date));
        System.out.println("\n \t \t \t \t" + reportes.size()+ " Facturas en el mes " +hourdateFormat2.format(date)+"\n");
        System.out.println("Nombre Cliente \t \t \t \t RTN Cliente \t \t Cantidad Productos Facturados \t \t \t Total Venta");
        for (Reportes reporte: reportes) {
            i++;
            System.out.println(reporte.getNombre() + "\t \t \t" + reporte.getRtn() + "\t \t \t \t \t \t" + reporte.getCantidadProductos() + "\t \t \t \t \t \t \t" + reporte.getTotal());
            x = Double.parseDouble(reporte.getTotal());
            y += x;
            if(i == reportes.size()){
                System.out.println("");
                System.out.println("Los ingresos en el mes de " + hourdateFormat2.format(date) +  " han sido de " + "L."+y +".00");
                System.out.println("Los impuestos ha pagar en el mes de " + hourdateFormat2.format(date) +  " han sido de " + "L."+(y*0.15));
                System.out.println("\t \t \t \t \t    *****");
                System.out.println("\t \t \t \t  - Reporte Cerrado -");
            }
        }

    }

}
