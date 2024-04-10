package TDSR2603;

public class Usapessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa();
		p1.setAnoNascimento(1999);
		p1.setNome("ANTEDEGUEMON");
		int idade = p1.calculaIdade(2024);
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade " + idade + "anos");
		
		Pessoa p2 = new Pessoa("Berisvaldo", 1880);
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade " + p2.calculaIdade(2024) + "anos:");
		
		
	}
	

}
