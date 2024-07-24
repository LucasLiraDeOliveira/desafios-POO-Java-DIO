package defaultPackage.conta;

import defaultPackage.Cliente;

public abstract class Conta implements IConta {
    //Constates:
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    //Atributos:
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double fatura;
    protected Cliente cliente;
    protected int tipoDeConta;


    //Constructor:
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.fatura = 0;
        this.cliente = cliente;
        this.tipoDeConta = 0;
    }

    //Getters das variaveis de Conta:
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTipoDeConta() {
        return tipoDeConta;
    }

    public double getFatura() {
        return fatura;
    }



    //Metodos implementados da Interface IConta:
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void comprarNoCredito(double valor) {
        this.fatura += valor;
    }

    @Override
    public void pagarFatura() {
        if(this.saldo >= this.fatura){
            this.saldo -= this.fatura;
            this.fatura = 0;
            System.out.println("Fatura atual PAGA!");
        }
        else {
            System.out.println("Saldo insuficiente para pagar a fatura atual!");
        }
    }



    //Metodo da classe Conta:
    public void imprimirDadosComuns(){
        System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Conta: %d ", this.numero));
        System.out.println(String.format("Saldo: %.2f \n", this.saldo));
    }
}
