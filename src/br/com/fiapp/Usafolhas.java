package br.com.fiapp;

public class Usafolhas {

	public static void main(String[] args) {
		//desclarar valores......//
		
		Folhadepagamento folha = new Folhadepagamento();
        folha.salariobruto = 5000;
        folha.numeroDedependentes = 2;
        folha.descontoINSS = 10;		
        folha.valorPlanoDeSaude = 100;
        
        double salarioliquido = folha.CalcularSalarioLiquido();
        System.out.println(folha.CalcularSalarioLiquido());
	}

}
