public class Main {
public static void main(String[] args) {
CarroBuilder builder = new CarroSimplesBuilder();
Montar montar = new Montar(builder);
montar.construirCarro();
Carro carro = montar.getCarro();
carro.mostrar();
}
}