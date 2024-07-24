package defaultPackage.conta;

import defaultPackage.Cliente;
import defaultPackage.conta.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipoDeConta = 2;
    }




    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.imprimirDadosComuns();
    }
}
