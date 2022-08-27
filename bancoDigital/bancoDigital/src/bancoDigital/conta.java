package bancoDigital;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public abstract class conta implements iconta
{
    private static final int AGENCIA_PADRAO = 0001 ;

    private static  int SEQUENCIAL = 1 ;


    protected int agencia ;
    protected int numero ;
    protected double saldo;

    protected Cliente cliente ;
    public conta ( Cliente cliente)
    {
        this.agencia = conta.AGENCIA_PADRAO ;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia()
    {
        return agencia;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor ;
    }

    @Override
    public void transferir(double valor, conta contaDestino )
    {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void depositar(double valor)
    {
        saldo += valor ;
    }

    protected void imprimirExtratoInformacoes()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println();
        System.out.println("--Data e Hora Atual : " + now.format(dataFormatada));
        System.out.println(String.format("Titular : %s", this.cliente.getNome()) );
        System.out.println(String.format("Agencia : %d", this.agencia) );
        System.out.println(String.format("Número : %d", this.numero) );
        System.out.println(String.format("Saldo : %.2f", this.saldo) );
    }



}
