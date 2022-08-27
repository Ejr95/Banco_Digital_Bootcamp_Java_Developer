package bancoDigital;

public class usuario {
    public static void main(String[] args)
    {
        Cliente elizeu = new Cliente();
        elizeu.setNome("Elizeu");


        conta contaCorrente = new contaCorrente(elizeu);
        conta contaPoupanca = new contaPoupança(elizeu);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(500,contaPoupanca);

        contaPoupanca.depositar(2000);
        contaPoupanca.sacar(500);

      contaCorrente.imprimirExtrato();
      contaPoupanca.imprimirExtrato();



    }
}
