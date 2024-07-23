package defaultPackage;

public class Main {
    public static void main(String[] args) {
        //Criando clientes:
        Cliente lucas = new Cliente("Lucas");
        Cliente pedro = new Cliente("Pedro");

        //Criando as contas
        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(pedro);

        //Atribuindo valores a elas via deposito
        cc.depositar(120);
        cp.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //Transferindo valores entre contas
        cc.transferir(80, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
