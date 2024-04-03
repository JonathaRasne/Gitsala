package br.com.fiapp;

public class Televisor {

	
public int volume ;
public int canal ;

public void aumentarvolume () {volume++;}
public void diminuirvolume() { volume--;}
public void trocarCanal (int f) {canal = f; }
public void mostrar () {System.out.println("Volume:" + volume + "\ncanal:" + canal);
    
    }

	
	
	
}
