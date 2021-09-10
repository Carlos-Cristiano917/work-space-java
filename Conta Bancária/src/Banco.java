import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaCorrente conta = new ContaCorrente(1235, 5, "João", "1254621");
		do {
			System.out.println("Seja bem-vindo (a) ao CC Bank!");
			System.out.println("Escolha uma das opções:");
			System.out.println("Digite 1 para Informações, 2 para Sac, 3 para depósito, ou 0 para finalizar.");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(conta.exibir());
				break;
			case 2:
				System.out.println("Digite o valor:");
				valor = teclado.nextDouble();
				conta.depositar(valor);
				break;
			case 3:
				valor = teclado.nextDouble();
				boolean resultado = conta.sacar(valor);
				if (resultado == true) {
					System.out.println("Sac efetuado!");
				} else {
					System.out.println("Você não possui saldo suficiente para operação");
				}
				break;
			case 0:
				System.out.println("Agradecemos pela preferência. Volte sempre.");
				break;
			default:
				System.out.println("Opção inválida...");
			}

		} while (opcao != 0);
	}
}
