
public class Pagamento {
public static void main(String[] args) {
	Colaboradores f1;
	f1 = new Colaboradores();
	f1.nome = "Jozé Niuton";
	f1.cargo = "Segurança";
	f1.salario = 640.00;
	System.out.println(f1.exibir());
	Colaboradores f2;
	f2 = new Colaboradores();
	f2.nome = "Marcos";
	f2.cargo = "Servente";
			f2.salario = 585.00;
		System.out.println(f2.exibir());
					Colaboradores f3;
			f3 = new Colaboradores();
			f3.nome = "Antônio";
			f3.cargo = "Jardineiro";
			f3.salario = 599.00;
			System.out.println(f3.exibir());
			Colaboradores f4;
			f4 = new Colaboradores();
			f4.nome = "João";
			f4.cargo = "Motorista";
			f4.salario = 380.00;
			System.out.println(f4.exibir());
					
			f1.ajustarSalario(8);
			System.out.println(f1.exibir());
			f2.ajustarSalario(8);
			System.out.println(f2.exibir());
			f3.ajustarSalario(8);
			System.out.println(f3.exibir());
			f4.ajustarSalario(8);
			System.out.println(f4.exibir());
			
			
					
}
}
