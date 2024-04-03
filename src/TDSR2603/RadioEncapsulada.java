package TDSR2603;

public class RadioEncapsulada {
	
	//atributos
	private int volume;
	private float estacao;
	public int getVolume() {
		return volume;
	}
	//metodos getters & setters (CTRL+3  -> ggas)
	public void setVolume(int volume) {
		
	    try {
			if (volume >= 0 && volume <=100) {
				this.volume = volume;
			} else {
				throw new Exception("Volume fora da faixa permitida (0-100)");
                }
		} catch (Exception e) {
	    System.out.println(e.getMessage());
		}
	}
	
	public float getEstacao() {
		return estacao;
	}
	public void setEstacao(float estacao) { 
		this.estacao = estacao;
		 try {
				if (estacao >= 80.0f && estacao <=105.0f) {
					this.estacao = estacao;
				} else {
					throw new Exception("Estacao fora da faixa permitida (80.0-105.0)");
	                }
			} catch (Exception e) {
		    System.out.println(e.getMessage());
			}
	}
	//metodos particulares
	public void aumentarVolume() {
       if (volume <100) {
		   volume ++;
	}
	}
	public void diminuirVolume () {
		if (volume >0) {
			volume--;
		} 
	}
    public void mostrar () {
         System.out.println("Volume:" + getVolume() + "\nEstacao:" + getEstacao());
		 }
	}
