package br.com.fiapp;

public class Usaradio {

	public static void main(String[] args) {
	//declarar um obj da classe
		Radioss rad = new Radioss();
		//instaciar um obj da classe
		 rad.volume = 5;
		 rad.estacao = 89.1f;
		 rad.mostrar();
		
		 
		 rad.trocarEstacao(82.3f);
		 rad.aumentarVolume();
		 rad.aumentarVolume();
		 rad.mostrar();
		
		
		
		
		
		
		
		
	}
}
