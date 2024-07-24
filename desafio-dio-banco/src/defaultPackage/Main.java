package defaultPackage;

import defaultPackage.conta.Conta;
import defaultPackage.conta.ContaCorrente;
import defaultPackage.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        //Criando o banco:
        Banco inter = new Banco("inter");

        //Criando clientes:
        Cliente lucas = new Cliente("Lucas");
        Cliente pedro = new Cliente("Pedro");

        //Criando as contas:
        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(pedro);

        //Atribuindo valores a elas via deposito:
        cc.depositar(120);
        cp.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //Transferindo valores entre contas:
        cc.transferir(80, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        //Para adicionar contas ao banco:");
        inter.addConta(cc);
        inter.addConta(cp);
        inter.listagemDeContas();

        //Para simular compra no crédito e pagamento de fatura:
        cc.comprarNoCredito(60);
        cp.comprarNoCredito(80);
        cc.pagarFatura();
        cp.pagarFatura();
    }
}
