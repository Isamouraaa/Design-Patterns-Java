public class SistemaLoja {
    public static void main(String[] args) {
        PayPalService servicoExterno = new PayPalService();
        
        ProcessadorPagamento processador = new PayPalAdapter(servicoExterno);
        
        processador.debitar(150.00);
    }
}