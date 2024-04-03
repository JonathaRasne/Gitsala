package br.com.fiap;

import java.util.Scanner;

import br.com.fiapp.Folhadepagamento;

@SuppressWarnings("unused")
public class TesteFolhadePagamentoScanner 
	public static void main(String[] args) {
    Folhadepagamento folha = new Folhadepagamento();
    double salarioBruto, descontoINSS, valorPlanoDeSaude, salarioLiquido;
			int numeroDedependentes;
			Scanner scan ;
			try { scan = new Scanner(System.in);
				//lendo informacoes digitadas pelo usuario
				System.out.println("digite seu salario");
		salarioBruto = scan.nextDouble();
		System.out.println("Digite numero de dependentes");
		numeroDedependentes = scan.nextInt();
		System.out.println("Digite o desconto do inss");
		descontoINSS = scan.nextDouble();
		System.out.println("Digite o valor do plano de saude");
		valorPlanoDesaude = scan.nextDouble();
		
		folha.salariobruto = salarioBruto;
		folha.numeroDedependentes = numeroDedependentes;
		folha.descontoINSS = descontoINSS;
		folha.valorPlanoDeSaude = valorPlanoDeSaude;
		salaioLiquido = folha.CalcularSalarioLiquido();
		System.out.println("Exibindo informacoes:"
		
				+" \nSalario bruto:" + folha.salariobruto +
				"\nNumero de dependentes:" folha.numeroDedependentes 
				+"\n desconto INSS:"+ folha.descontoINSS + "%"
				+\n
		
		
		
    }catch(Exception e)
			{System.out.println("Formato incorreto!");	}	
		
		// TODO Auto-generated method stub
		

	


