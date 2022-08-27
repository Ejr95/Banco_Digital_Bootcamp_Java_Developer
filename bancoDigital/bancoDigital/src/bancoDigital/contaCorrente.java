package bancoDigital;

public class contaCorrente extends conta
{


    public contaCorrente(Cliente cliente)
    {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("-------Imprimindo Extrato Conta Corrente------ ");
        imprimirExtratoInformacoes();
    }
}
