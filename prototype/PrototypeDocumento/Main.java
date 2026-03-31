public class Main {
    public static void main(String[] args) {
        Documento templateContrato = new Documento(
            "Contrato Padrão", 
            "Empresa ACME S.A. - CNPJ 00.000/0001-00", 
            "Termos e condições"
        );

        Documento contratoJoao = (Documento) templateContrato.clone();
        contratoJoao.setConteudo("Serviço de Consultoria para João da Silva.");

        Documento contratoMaria = (Documento) templateContrato.clone();
        contratoMaria.setConteudo("Serviço de Desenvolvimento para Maria de Souza.");

        templateContrato.exibir();
        contratoJoao.exibir();
        contratoMaria.exibir();
    }
}