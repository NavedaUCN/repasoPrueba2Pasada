package cl.ucn.disc.pa.repasoPrueba2Pasada;


import cl.ucn.disc.pa.repasoPrueba2Pasada.dominio.ContenedorFiguras;
import cl.ucn.disc.pa.repasoPrueba2Pasada.servicios.SistemaGeometria;
import cl.ucn.disc.pa.repasoPrueba2Pasada.servicios.SistemaGeometriaUCN;
import cl.ucn.disc.pa.repasoPrueba2Pasada.vista.VistaConsola;

public class Main {
    public static void main(String[] args) {
        SistemaGeometria parteTrasera = new SistemaGeometriaUCN(new ContenedorFiguras(999));
        VistaConsola parteFrontal = new VistaConsola(parteTrasera);
        parteFrontal.iniciar();
    }
}