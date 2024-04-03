package  TDSR2603;

public class TelevisorEncapsulada {
	private int Volume;
	private int canal;
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		try {
			if ( volume >=0 && volume <=20) {
				this.Volume = volume;
				} 
			else {
				throw new Exception("Volume fora da faixa permitida (0-20)");
			}
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}

	public  int getCanal() {
	return canal;
	}
	public void setCanal(int canal) {
		//this.Canal = canal;
		try {
				if(canal == 2 || canal == 4 || canal 5 == || canal 7 == ||canal == 13) {
					this.canal = canal;
					
				} else {
					throw new Exception("Canal incorreto! + canais permitidos:2, 4, 5, 7 ou 13");
	                }
			} catch (Exception e) {
		    System.out.println(e.getMessage());
			}
	}
	public void aumentarVolume() {
		// TODO Auto-generated method stub
		
	}
	public void diminuirVolume() {
		// TODO Auto-generated method stub
		
	}
}
