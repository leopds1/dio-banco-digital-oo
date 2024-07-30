
import java.util.Scanner;

public class BancoDigitalApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        // Adicionar contas ao banco
        banco.adicionarConta(new ContaCorrente("Maria Silva", 1000, 500));
        banco.adicionarConta(new ContaPoupanca("João Souza", 2000));

        // Listar contas
        banco.listarContas();

        // Realizar operações
        Conta conta = banco.buscarConta("Maria Silva");
        if (conta != null) {
            conta.depositar(200);
            conta.sacar(300);
        }

        Conta contaPoupanca = banco.buscarConta("João Souza");
        if (contaPoupanca instanceof ContaPoupanca) {
            ((ContaPoupanca) contaPoupanca).aplicarJuros();
        }

        // Fechar o scanner
        scanner.close();
    }
}
