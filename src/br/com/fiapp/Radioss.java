package br.com.fiapp;

public class Radioss {
	
	
	//atributos
	public int volume;
	public float estacao;
	
	
  //metodos
	
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void trocarEstacao(float station) {
		estacao = station;
	}
	public void mostrar () {
		System.out.println("Volume: " + volume + "\nEstacao: " + estacao);
		
	}

}
