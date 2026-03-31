abstract class CarroBuilder {
protected Carro carro;

public Carro getCarro() {
return carro; }
public void criarNovoCarro() {
carro = new Carro(); }

public abstract void definirMarca();
public abstract void definirCor();
public abstract void definirModelo(); }