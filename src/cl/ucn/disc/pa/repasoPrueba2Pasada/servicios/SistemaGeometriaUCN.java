package cl.ucn.disc.pa.repasoPrueba2Pasada.servicios;

import cl.ucn.disc.pa.repasoPrueba2Pasada.dominio.*;

public class SistemaGeometriaUCN implements SistemaGeometria{


    private ContenedorFiguras contenedorFiguras;
    private final String[] tiposFigurasAceptado = {"Cuadrado", "Circulo", "Triangulo","Pentagono"};

    public SistemaGeometriaUCN(ContenedorFiguras contenedorFiguras) {
        this.contenedorFiguras = new ContenedorFiguras(999);
    }

    @Override
    public String agregarFigura(String tipoFigura, int[] datos) {
        return "";
    }

    @Override
    public String mostrarFigura() {


        Figura figuraActual;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.contenedorFiguras.getCantidadActualFiguras(); i++) {
            figuraActual = this.contenedorFiguras.obtener(i);

            sb.append("Figura N.- ").append(i+1).append(" - ");

            if (figuraActual instanceof Circulo){
                sb.append("Circulo");
            } else if (figuraActual instanceof Cuadrado){
                sb.append("Cuadrado");
            } else if (figuraActual instanceof Pentagono) {
                sb.append("Pentagono");
            } else if (figuraActual instanceof Triangulo) {
                sb.append("Triangulo");
            }

            sb.append("\n").append(figuraActual).append("")
        }


        return sb.toString();
    }

    @Override
    public String mostrarPerimetro() {
        return "";
    }
}
