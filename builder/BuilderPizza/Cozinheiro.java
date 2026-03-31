class Cozinheiro {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }

    public void montarPizza() {
        builder.criarNovaPizza();
        builder.prepararMassa();
        builder.prepararMolho();
        builder.prepararCobertura();
    }
}