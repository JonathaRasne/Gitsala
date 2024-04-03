package br.com.fiapp;

public class Folhadepagamento {
	
	//atributos
	
	public double salariobruto ;
	public int numeroDedependentes ; 
	public double descontoINSS ;
	public double valorPlanoDeSaude ; 
    public double CalcularSalarioLiquido () {
    	
    //variaveis Locais 
    double desconto1, desconto2, salarioLiquido ;
    desconto1 = salariobruto * (descontoINSS /100);
    desconto2= valorPlanoDeSaude *(numeroDedependentes + 1 );
    salarioLiquido = salariobruto - (desconto1 + desconto2);
    return salarioLiquido;
    	//finalizado clase folha de pagamento....//
    
    	}
    
    
    
	
	

}
