package TDSR2603;

import java.time.LocalDate;
import java.util.Scanner;

public class Usapessoa2 {

	public static void main(String[] args) {
		// dando instanciacao
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		Pessoa p1;
		
		Scanner scan;
		// String nome;
		// int anoNascimento;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome e ano de nascimento");
			// nome = scan.next();
			// anoNascimento = scan.nextInt();

			p1 = new Pessoa(scan.next(), scan.nextInt());
			int idade = p1.calculaIdade(2024);

			System.out.println("Nome: " + p1.getNome());
			System.out.println("Idade " + idade + " anos ");

		} catch (Exception e) {
			System.out.println("Nome ou Ano Nascimento invalidos(s)!");
		}
	}

}
//  for para jogar os valores em variaveis se no check point pedir faca o que esta com // se nao faca esse que esta normal

// se no check point pedir 
