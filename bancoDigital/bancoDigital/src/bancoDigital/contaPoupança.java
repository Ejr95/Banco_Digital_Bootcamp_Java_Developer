package bancoDigital;

public class contaPoupança extends conta
{

    public contaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("------Imprimindo Extrato Conta Poupança----- ");
         imprimirExtratoInformacoes();


    }
}
