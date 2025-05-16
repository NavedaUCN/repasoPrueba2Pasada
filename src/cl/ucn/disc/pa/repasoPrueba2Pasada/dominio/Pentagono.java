package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public class Pentagono extends Poligono {

    private  int apotema;

    public Pentagono(int arista, int apotema) {
        super(arista);
        this.apotema = apotema;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Apotema: " + this.apotema + "\n";
    }

    @Override
    public double calcularArea() {
        return this.calcularPerimetro() * this.apotema / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.arista * 5;
    }
}
