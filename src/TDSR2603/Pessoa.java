package TDSR2603;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private int anoNascimento;

	// public Pessoa() {
	// primeiro construtor vazio(CRTRL+3 -> gcfs) porque nao tem nada nos parenteses
	// ()
	public Pessoa() {

		// TODO Auto-generated constructor stub

	}

	// construtor com parametro (CRTRL+3 -> gcuf)
	public Pessoa(String nome, int anoNascimento) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	// metodos getters & setters (CTRL+3 ->ggas)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

//colocando data atual
	public void setAnoNascimento(int anoNascimento) {
		try {
          LocalDate dataAtual = LocalDate.now();
          int anoAtual = dataAtual.getYear();
          if ("anoNascimento >= 1900 && anoNascimento <= anoAtual") {
        	  this.anoNascimento = anoNascimento; 
		} else {
			throw new Exception ("Valor invalido! (1900-Ano Atual"))
		}

	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

	// metodos particular da classe
	public int calculaIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}

}
// construtor com parametro (CRTRL+3 -> gcuf)
// construtores "serve para criar um objeto"
// get setters
// metodos particulares da classe

// public Pessoa() {
// primeiro construtor vazio(CRTRL+3 -> gcfs) porque nao tem nada nos parenteses
// ()

// construtor com passagem de parametros, "precisa de variaveis com mesmo tipo e
// o mesmo nome de atributos"
// public Pessoa(String nome, int anoNascimento) {
// this.nome = nome;
// this.anoNascimento = anoNascimento;
	
	
	//(anoNascimento >= 1900 && anoNascimento <= anoAtual)
