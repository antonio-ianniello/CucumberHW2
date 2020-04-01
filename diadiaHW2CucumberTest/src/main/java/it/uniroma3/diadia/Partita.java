
package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {
	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	private String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa"};

	/**
	 * costruttore Partita
	 */
	
	public Partita(){
		this.labirinto=new Labirinto();
		this.giocatore=new Giocatore();
		this.finita = false;
		
	}

    

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente().getNome().equals(labirinto.getStanzaVincente().getNome());
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
	/**
	 * ritorna l' elenco dei comandi
	 * @return elencoComandi[]
	 */
	public String[] getElencoComandi() {
		return this.elencoComandi;
	}
	/**
	 * ritorna il giocatore
	 * @return giocatore
	 */
	public Giocatore getGiocatore() {
		return this.giocatore;
	}
	/**
	 * ritorna il labirinto
	 * @return labirinto
	 */
	public Labirinto getLabirinto() {
		return this.labirinto;
	}
	
}
