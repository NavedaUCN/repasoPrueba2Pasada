package cl.ucn.disc.pa.repasoPrueba2Pasada.dominio;

public abstract class Poligono implements Figura {

    protected int arista;

    public Poligono(int arista){
        this.arista = arista;
    }

    @Override
    public String toString() {
        return "\n" +
                "Arista: " + this.arista + "\n";
    }
}
