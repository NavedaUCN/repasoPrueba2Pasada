package cl.ucn.disc.pa.repasoPrueba2Pasada.utilidades;

import ucn.StdIn;
import ucn.StdOut;

public class ValidadorEntrada {

    public static int validar(String cadena){
        String opcion;
        while (true){
            System.out.println(cadena);
            opcion = StdIn.readString();

            try{
                return Integer.parseInt(opcion);
            }catch (NumberFormatException e){
                System.out.println("La entrada no es valida, introduzca un numero");
            }
        }

    }

}
