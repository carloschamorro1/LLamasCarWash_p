package edu.ujcv.progra2.Utilidades;

import java.util.Scanner;

    public class LectorTeclado {
        private Scanner mSc;

        public LectorTeclado() {
            Scanner sc = new Scanner(System.in);
            init(sc);
        }

        private void init(Scanner sc) {
            mSc = sc;
        }

        public double leerReal(String mensaje, String mensajeError) {
            double retval = 0;
            System.out.println(mensaje);
            while (!mSc.hasNextDouble()) {
                mSc.nextLine();
                System.out.println(mensajeError);
            }
            retval = mSc.nextDouble();
            mSc.nextLine();
            return retval;
        }

        public int leerEntero(String mensaje, String mensajeError) {
            int retval = 0;
            System.out.println(mensaje);
            while (!mSc.hasNextInt()) {
                mSc.nextLine();
                System.out.println(mensajeError);
            }
            retval = mSc.nextInt();
            mSc.nextLine();
            return retval;
        }

        public String leerString(String mensaje) {
            String retval = "";
            System.out.println(mensaje);
            while(!mSc.hasNext()){
                mSc.nextLine();
            }
            retval = mSc.next();
            mSc.nextLine();
            return retval;
        }
}
