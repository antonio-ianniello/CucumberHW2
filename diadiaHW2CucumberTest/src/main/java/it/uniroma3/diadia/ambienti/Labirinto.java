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
	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	
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
		Attrezzo lama = new Attrezzo("lama",2);
		Attrezzo spada = new Attrezzo("spada",5);
		Attrezzo leggendario = new Attrezzo("leggendario",7);
        Attrezzo chiave = new Attrezzo("chiave",1);
        
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		Stanza maledetta = new Stanza("Maledetta");
		StanzaBuia batcaverna = new StanzaBuia("batcaverna","lanterna");
		StanzaBloccata scorciatoia = new StanzaBloccata("scorciatoia","nord","chiave");
		
		/* collega le stanze */
		scorciatoia.impostaStanzaAdiacente("sud", atrio);
		scorciatoia.impostaStanzaAdiacente("nord", biblioteca);
		batcaverna.impostaStanzaAdiacente("est",maledetta );
		maledetta.impostaStanzaAdiacente("ovest", batcaverna);
		atrio.impostaStanzaAdiacente("nord",scorciatoia);
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
		biblioteca.impostaStanzaAdiacente("sud", scorciatoia);
		laboratorio.impostaStanzaAdiacente("nord", maledetta);
		maledetta.impostaStanzaAdiacente("sud", laboratorio);
		maledetta.impostaStanzaAdiacente("est", biblioteca);
		biblioteca.impostaStanzaAdiacente("ovest", maledetta);
		
        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		aulaN10.addAttrezzo(lama);
		batcaverna.addAttrezzo(chiave);		
		maledetta.addAttrezzo(leggendario);
		aulaN11.addAttrezzo(spada);
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
	public  String getMessaggioBenvenuto() {		
		return MESSAGGIO_BENVENUTO;
	}
	


}
