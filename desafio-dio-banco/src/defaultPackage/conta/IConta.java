package defaultPackage.conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino); // em vez de por a interface IConta
    // poderia ser a classe pai Conta
    void comprarNoCredito(double valor);
    void pagarFatura();

    void imprimirExtrato();
}
