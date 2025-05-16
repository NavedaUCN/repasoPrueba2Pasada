package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public class ContenedorFiguras {
    private Figura[] figuras;
    private int cantidadMaximaFiguras;
    private int cantidadActualFiguras;

    public ContenedorFiguras(int cantidadMaximaFiguras) {
        if (cantidadMaximaFiguras <= 0){
            throw new IllegalArgumentException("La cantidad maxima de figuras debe ser mayor a 0");
        }
        this.cantidadMaximaFiguras = cantidadMaximaFiguras;
        this.cantidadActualFiguras = 0;
        this.figuras = new Figura[cantidadMaximaFiguras];
    }


    public int getCantidadActualFiguras() {
        return this.cantidadActualFiguras;
    }

    public void agregar(Figura nueva){
        if (this.cantidadActualFiguras >= this.cantidadMaximaFiguras){
            throw new IllegalArgumentException("No se pueden agregar mas figuras");
        }
        if (nueva == null){
            throw new IllegalArgumentException("La figura no puede ser null");
        }

        this.figuras[cantidadActualFiguras] = nueva;
        this.cantidadActualFiguras++;
    }

    public Figura obtener(int posicion){
        if (posicion < 0 || posicion >= this.cantidadActualFiguras){
            throw new IllegalArgumentException("La posicion no es valida");
        }
        return this.figuras[posicion];
    }
}
