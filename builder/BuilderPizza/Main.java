public class Main {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        // Preparando uma Margherita
        PizzaBuilder margherita = new MargheritaBuilder();
        cozinheiro.setBuilder(margherita);
        cozinheiro.montarPizza();
        
        Pizza pizza1 = cozinheiro.getPizza();
        pizza1.imprimir();}}