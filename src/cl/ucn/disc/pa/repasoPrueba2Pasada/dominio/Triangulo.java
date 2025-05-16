package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public class Triangulo extends Poligono {

    private int altura;

    public Triangulo(int arista, int altura){
        super(arista);
        this.altura = altura;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Altura: " + this.altura + "\n";
    }

    @Override
    public double calcularArea() {
        return this.arista * this.altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.arista * 3;
    }
}
