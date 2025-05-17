package cl.ucn.disc.pa.repasoPrueba2Pasada.vista;

import cl.ucn.disc.pa.repasoPrueba2Pasada.servicios.SistemaGeometria;
import cl.ucn.disc.pa.repasoPrueba2Pasada.utilidades.ValidadorEntrada;

public class VistaConsola {
    private SistemaGeometria sistema;

    public VistaConsola(SistemaGeometria sistema) {
        this.sistema = sistema;
    }

    public void iniciar(){

        System.out.println(":::SISTEMA GEOMETRIA UCN:::");
        this.menu();
    }

    private void menu() {

        int opcion;

        while (true){
            System.out.println("::MENU::");
            System.out.println("1. Agregar Figura");
            System.out.println("2. Mostrar Figuras");
            System.out.println("3. Mostrar Perimetros y Areas de las Figuras");
            System.out.println("4. Salir");

            opcion = ValidadorEntrada.validar("Ingrese una opcion:");


            if (opcion == 1){
                agregarFiguraMenu();
                continue;
            }

            if (opcion == 2){
                mostrarFiguraMenu();
                continue;
            }

            if (opcion == 3){
                mostrarAreaPerimetroMenu();
                continue;
            }

            if (opcion == 4){
                break;
            }

            System.out.println("Ingrese una opcion valida");
        }
        System.out.println("Gracias por usar nuestro sistema, Adios");
    }

    private void agregarFiguraMenu() {

    }

    private void mostrarFiguraMenu() {
        System.out.println("Mostrar Figuras");
        System.out.println(this.sistema.mostrarFigura());
    }

    private void mostrarAreaPerimetroMenu() {
        System.out.println("Mostrar Areas y Perimetros");
        System.out.println(this.sistema.mostrarPerimetro());
    }
}
