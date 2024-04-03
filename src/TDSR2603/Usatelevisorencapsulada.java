package TDSR2603;
import java.util.Scanner;
public class Usatelevisorencapsulada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelevisorEncapsulada tv = new TelevisorEncapsulada();
		
		//tv.setVolume(100);
		//tv.setCanal(5);
		//tv.mostrar();
		int escolha = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Escolha um canal e seu volume");
			tv.setCanal(scan.nextInt());
			tv.setVolume(scan.nextInt());
			System.out.println("faca sua escolha:"
			+"\n(1) Mudar canal"
			+"\n(2) Mudar volume"
			+"\n(3) Aumentar volume"
			+"\n(4) Mudar volume");
			escolha = scan.nextInt();
			if (escolha == 1) {
				System.out.println("Escolha novo canal");
			    tv.setCanal(scan.nextInt());
				}
			else if (escolha == 2){
				System.out.println("Escolha novo volume");
				tv.setVolume(scan.nextInt());
				
			}else if (escolha == 3){
				System.out.println("Aumentando  volume...");
				tv.aumentarVolume();
				
		    }
			else if (escolha == 4){
				System.out.println("Diminuindo  volume...");
				tv.diminuirVolume();
				else {
					System.out.println("Escolha incorreta!(1-4);
				}
          tv.mostrar();				
		    }
		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}
		
		
		
	}

}
