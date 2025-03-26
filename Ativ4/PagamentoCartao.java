package Ativ4;

public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(){
        super();
    }

    @Override
    protected void realizarPagamento(){
        System.out.println("Pagamento com cartão aprovado!");
    }
}
