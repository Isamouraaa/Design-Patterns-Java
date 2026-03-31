public class Inimigo implements Prototype {
    private String tipo;
    private String arma;
    private int vida;

    public Inimigo(String tipo, String arma, int vida) {
        this.tipo = tipo;
        this.arma = arma;
        this.vida = vida;
    }

    @Override
    public Prototype clone() {
        return new Inimigo(this.tipo, this.arma, this.vida);
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void status() {
        System.out.println("Inimigo [Tipo: " + tipo + " | Arma: " + arma + " | Vida: " + vida + "]");
    }
}