package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

/**
 * classe Labirinto che modella il labirnto usato nel gioco
 * @author anton
 * @version base
 *
 */
public class Labirinto {
	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	/**
	 * costruttore del labirinto
	 */
	public Labirinto() {
		creaLabirinto();
	}
	
	/**
     * Crea tutte le stanze e le porte di collegamento
     */
    private void creaLabirinto() {

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
	
        Attrezzo chiave = new Attrezzo("chiave",1);
        
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		StanzaBuia buia = new StanzaBuia("Buia","lanterna");
		StanzaBloccata bloccata = new StanzaBloccata("Bloccata","nord","chiave");
		
		/* collega le stanze */
		
		
		atrio.impostaStanzaAdiacente("nord",biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		
		
		
        /* pone gli attrezzi nelle stanze */
		atrio.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		
		buia.addAttrezzo(chiave);		
	
		
		atrio.addAttrezzo(chiave);
		

		// il gioco comincia nell'atrio
        stanzaCorrente = atrio;  
		stanzaVincente = biblioteca;
    }
    
    /**
     * metodo che ritorna il valore della stanza attuale
     * @return stanzaCorrente
     */
	public Stanza getStanzaCorrente() {
		return stanzaCorrente;
	}
	
	/**
	 * metodo che setta la stanza attuale
	 * @param stanzaCorrente, bisogna passare come paramtro la stanza in cui si è
	 * 
	 */
	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}
	
	/**
	 * metodo che restituisce la stanza vincente
	 * @return stanzaVincente, stanza in cui si vince il gioco
	 */
	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}
	/**
	 * messaggio di benvenuto 
	 * @return MESSAGGIO_BENVENUTO
	 */



}
