
public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 0.02; // 2% de juros

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void aplicarJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
        System.out.println("Juros aplicados: R$ " + juros);
    }
}
