package TDSR2603;

public class Funcionario {
	private String nome;
	private float valorHora;
	private float salario;

	public Funcionario() {
	}

	public Funcionario(String nome, float valorHora, float salario) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.salario = salario;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float valorHora() {
		return valorHora;
	}
   public float salaro() {
	   return salario;
   }
    public void  setvalorHora(float valorHora) {try {
	if ("valorHora <=0 ) 

    	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}}
}
