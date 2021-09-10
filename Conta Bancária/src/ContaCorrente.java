
public class ContaCorrente {
	private int conta;
	private int digito;
	private String nome;
	private String cpf;
	private double saldo;

	public ContaCorrente(int conta, int digito, String nome, String cpf) {
		super();
		this.conta = conta;
		this.digito = digito;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getConta() {
		return conta;
	}

	public int getDigito() {
		return digito;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String exibir() {
		return "Número da conta: " + conta + " Dígito: " + digito + " CPF: " + cpf + " Saldo: " + String.format("%.2f",saldo);
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}
}
