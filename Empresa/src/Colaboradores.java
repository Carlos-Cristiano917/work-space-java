
public class Colaboradores {
	String nome;
	String cargo;
	double salario;

	String exibir() {
		return "Colaborador: " + nome + " Cargo: " + cargo + " Salário: r$: " + salario;
	}

	void ajustarSalario(double persentual) {
		salario = salario + (salario * (persentual / 100));
	}

}
