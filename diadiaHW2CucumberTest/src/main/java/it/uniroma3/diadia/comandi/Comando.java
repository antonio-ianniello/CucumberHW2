package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

/**
 * interfaccia comando
 * @author anton
 * 
 * Questa interfaccia modella un comando.
 * Un comando consiste al piu' di due parole:
 * il nome del comando ed un parametro
 * su cui si applica il comando.
 * (Ad es. alla riga digitata dall'utente "vai nord"
 *  corrisponde un comando di nome "vai" e parametro "nord").
 */


public interface Comando {
	/**
	 * esegue la partita
	 * @param partita
	 * il paramatero passato deve essere di tipo partita
	 */
	public void esegui(Partita partita);
	
	
	/**
	 * set parametro del comando
	 * @param parametro
	 * il parametro è la stringa digitata dallì utente
	 */
	public void setParametro(String parametro);

}
