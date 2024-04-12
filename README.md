package br.com.fiap;

import java.time.LocalDate;

public class Eleitor {
	private String nome;
	private int anoNascimento;
	private int numTitulo;
	private int zona;
	private int secao;

	public String getNome() {
		return nome;
	}

	public Eleitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eleitor(String nome, int anoNascimento, int numTitulo, int zona, int secao) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
     try {
		int anoAtual = LocalDate.now().getYear();
		int diff = anoAtual - anoNascimento;
	    if(anoNascimento <=1900) {
	   throw new Exception ("Ano de Nascimento deve ser maior que 1900");
	    }else if(diff < 16) {
	    	throw new Exception ("Diferença menor que 16 anos");
	    }
     } catch (Exception e) {
		// TODO: handle exception
	}
		
	}

	public int getNumTitulo() {
		return numTitulo;
	}

	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

}
