public class PayPalAdapter implements ProcessadorPagamento {
    private PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void debitar(double valor) {
        payPalService.realizarPagamentoDigital(valor, "BRL");
    }
}