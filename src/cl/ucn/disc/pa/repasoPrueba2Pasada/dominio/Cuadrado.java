package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public class Cuadrado extends Poligono {


    public Cuadrado(int arista){
        super(arista);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularArea() {
        return this.arista * this.arista;
    }

    @Override
    public double calcularPerimetro() {
        return arista * 4;
    }
}
