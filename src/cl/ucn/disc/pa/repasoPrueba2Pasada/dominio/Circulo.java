package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public class Circulo implements Figura {

    private int radio;


    public Circulo(int radio){
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + this.radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
}
