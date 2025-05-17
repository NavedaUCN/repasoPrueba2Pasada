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

        boolean tipoFiguraAceptada = false;
        for (int i = 0; i < this.tiposFigurasAceptado.length; i++) {
           if(tipoFigura.equalsIgnoreCase(tiposFigurasAceptado[i])){
                tipoFiguraAceptada = true;
                break;
           }
        }

        if(!tipoFiguraAceptada){
            return "Tipo de figura no aceptado";
        }

        if(datos.length == 0){
            return "La cantidad de datos no es valida, intente de nuevo";
        }

        if(tipoFigura.equalsIgnoreCase(this.tiposFigurasAceptado[0])){
            return agregarCuadrdado(datos);
        }

        if(tipoFigura.equalsIgnoreCase(this.tiposFigurasAceptado[1])){
            return agregarCirculo(datos);
        }

        if(tipoFigura.equalsIgnoreCase(this.tiposFigurasAceptado[2])){
            return agregarTriangulo(datos);
        }

        return agregarPentagono(datos);
    }



    // Metodos de agregar figuras
    private String agregarCuadrdado(int[] datos) {
        Figura nuevaFigura = new Cuadrado(datos[0]);
        try {
            this.contenedorFiguras.agregar(nuevaFigura);
            return "Figura Cuadrado agregada";
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }

    private String agregarCirculo(int[] datos) {
        Figura nuevaFigura = new Circulo(datos[0]);
        try {
            this.contenedorFiguras.agregar(nuevaFigura);
            return "Figura Circulo agregada";
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }

    private String agregarTriangulo(int[] datos) {
        Figura nuevaFigura = new Triangulo(datos[0],datos[1]);
        try {
            this.contenedorFiguras.agregar(nuevaFigura);
            return "Figura Triangulo agregada";
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }

    private String agregarPentagono(int[] datos) {
        Figura nuevaFigura = new Pentagono(datos[0],datos[1]);
        try {
            this.contenedorFiguras.agregar(nuevaFigura);
            return "Figura Pentagono agregada";
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
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

            sb.append("\n").append(figuraActual).append("");
        }


        return sb.toString();
    }

    @Override
    public String mostrarPerimetro() {
        if (this.contenedorFiguras.getCantidadActualFiguras() == 0){
            return "No hay figuras agregadas";
        }

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

            sb.append("Perimetro").append(figuraActual.calcularPerimetro()).append("");
            sb.append("Area").append(figuraActual.calcularArea()).append("");
        }


        return sb.toString();
    }
}
