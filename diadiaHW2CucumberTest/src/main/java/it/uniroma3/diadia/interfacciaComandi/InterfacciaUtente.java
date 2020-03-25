package it.uniroma3.diadia.interfacciaComandi;




//closable
public interface InterfacciaUtente{

	
	
	public void mostraMessaggio(String messaggio);
	
	public String prendiIstruzione();
	
	public void fineRevisione();
	
	
	
	//aggiunto
	public void costruisciIstruzione(String istruzione);
	
	public String getNomeIstruzione();
	
	public String getNomeParamaetro();
	
	
	
	
	
}
