package it.uniroma3.diadia.interfacciaComandi;

import java.util.Scanner;


public class IOConsole implements IO {	

	private Scanner scannerDiLinee;

	public void mostraMessaggio(String messaggio) {
		System.out.print(messaggio);		
	}

	public String leggiRiga() {
		String istruzione;
		scannerDiLinee = new Scanner(System.in);
		
		istruzione = scannerDiLinee.nextLine();
		
		
		return istruzione;
	}
}
	