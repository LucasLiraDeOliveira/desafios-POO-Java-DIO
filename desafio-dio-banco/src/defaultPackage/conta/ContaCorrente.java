package defaultPackage.conta;

import defaultPackage.Cliente;
import defaultPackage.conta.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.tipoDeConta = 1;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        super.imprimirDadosComuns();
    }
}
