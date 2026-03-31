public class Main {
    public static void main(String[] args) {
        Inimigo soldadoBase = new Inimigo("Soldado Raso", "Pistola", 100);
        System.out.println("Protótipo Original");
        soldadoBase.status();

        Inimigo soldado1 = (Inimigo) soldadoBase.clone();
        
        Inimigo soldadoElite = (Inimigo) soldadoBase.clone();
        soldadoElite.setArma("Rifle de Precisão");

        System.out.println("\nExército Clonado");
        soldado1.status();
        soldadoElite.status();
        
        System.out.println("\nApós mudança no original");
        soldadoBase.setArma("Desarmado");
        soldadoBase.status();
        soldado1.status();
    }
}