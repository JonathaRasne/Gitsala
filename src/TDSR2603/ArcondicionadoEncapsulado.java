package TDSR2603;

public class ArcondicionadoEncapsulado {
	
	private int temperatura ;
	public int getTemperatura() {
		return temperatura;
		
	}
	//metodos getters & setters (CTRL+3  -> ggas)
	public void setTemperatura(int temperatura) {
		
	    try {
			if (temperatura <= 15 && temperatura >=26) {
				this.temperatura = temperatura;
			} else {
				throw new Exception("Temperatura nao segue com os limites");
                }
		} catch (Exception e) {
	    System.out.println(e.getMessage());
		}
	    
	}
}   		
	


