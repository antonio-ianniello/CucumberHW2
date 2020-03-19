package it.uniroma3.diadia.giocatore;
/**
 * 
 * @author anton
 *classe che modella un giocatore
 *gestisce i cfu del giocatore
 */
public class Giocatore {

	private static int CFU_INIZIALI=20;
	private int cfu;	
	private Borsa borsa;
	
	public Giocatore() {		//costruttore giocatore
		this.cfu= CFU_INIZIALI;
		this.borsa= new Borsa();
		
	}
	/**
	 * ritorna i cfu del gicoatore
	 * @return cfu, i cfu del giocatore
	 */
	public int getCfu() {
		return this.cfu;
	}
	
	public void setCfu(int cfu) {
		this.cfu=cfu;
	}

	public Borsa getBorsa() {
		return borsa;
	}
	
	public boolean giocatoreIsVivo() {
		if(this.getCfu()>0) {
			return true;
		}
		else
			return false;
			
	}
	
	public String getDescrizione() {
		return this.toString();
	}
	
	public String toString() {
		StringBuilder risultato= new StringBuilder();
		risultato.append("hai ancora i seguenti crediti: " + this.getCfu());
		
		return risultato.toString();
		
		
	}
	
	
}
