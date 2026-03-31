public class Documento implements Prototype {
    private String tipo;
    private String cabecalho;
    private String conteudo;

    public Documento(String tipo, String cabecalho, String conteudo) {
        this.tipo = tipo;
        this.cabecalho = cabecalho;
        this.conteudo = conteudo;
    }

    @Override
    public Prototype clone() {
        return new Documento(this.tipo, this.cabecalho, this.conteudo);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void exibir() {
        System.out.println(tipo);
        System.out.println("Header: " + cabecalho);
        System.out.println("Texto: " + conteudo);
    }
}