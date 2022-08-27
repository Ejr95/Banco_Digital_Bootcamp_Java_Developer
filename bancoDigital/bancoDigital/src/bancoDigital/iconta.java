package bancoDigital;

public interface iconta {

    void sacar (double valor);
    void transferir (double valor, conta contaDestino);
    void depositar (double valor );

    void imprimirExtrato();

}
