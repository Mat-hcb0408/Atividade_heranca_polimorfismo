package Ativ4;

public final class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro() {
        super();
    }
    @Override
    protected void realizarPagamento(){
        System.out.println("Pagamento em dinheiro recebido!");
    }
}
