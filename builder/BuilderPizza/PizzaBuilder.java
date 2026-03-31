abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void criarNovaPizza() {
        pizza = new Pizza();
    }

    public abstract void prepararMassa();
    public abstract void prepararMolho();
    public abstract void prepararCobertura();
}