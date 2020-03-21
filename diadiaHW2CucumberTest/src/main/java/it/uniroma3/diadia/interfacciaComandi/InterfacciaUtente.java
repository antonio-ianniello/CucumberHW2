package it.uniroma3.diadia.interfacciaComandi;

import java.io.Closeable;



//closable
public interface InterfacciaUtente{

	
	
	public void mostraMessaggio(String messaggio);
	
	public String prendiIstruzione();
	
	public void chiudiScanner();
	
	
	
	
	
}
