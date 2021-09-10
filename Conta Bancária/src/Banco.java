import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		ContaCorrente conta = new ContaCorrente(1235, 5, "Jo�o", "1254621");
		do {
			System.out.println("Seja bem-vindo (a) ao CC Bank!");
			System.out.println("Escolha uma das op��es:");
			System.out.println("Digite 1 para Informa��es, 2 para Sac, 3 para dep�sito, ou 0 para finalizar.");
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
					System.out.println("Voc� n�o possui saldo suficiente para opera��o");
				}
				break;
			case 0:
				System.out.println("Agradecemos pela prefer�ncia. Volte sempre.");
				break;
			default:
				System.out.println("Op��o inv�lida...");
			}

		} while (opcao != 0);
	}
}
