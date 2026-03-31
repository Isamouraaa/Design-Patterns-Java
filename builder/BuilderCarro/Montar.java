class Montar {
private CarroBuilder builder;
public Montar(CarroBuilder builder) {
this.builder = builder; }

public void construirCarro() {
builder.criarNovoCarro();
builder.definirMarca();
builder.definirCor();
builder.definirModelo(); }
public Carro getCarro() {
return builder.getCarro(); } }