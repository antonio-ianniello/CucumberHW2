package it.uniroma3.diadia.ambienti;



public class StanzaBuia extends Stanza{
	
	public  static final String BUIO = "qui c'è un buio pesto!Forse è il caso di trovare un oggetto luminoso...";
	private String attrezzoLuce;

	public StanzaBuia(String nome,String nomeAttrezzo) {
		super(nome);
		this.attrezzoLuce=nomeAttrezzo;
	}
	@Override
	public String getDescrizione() {
		return this.toString();

	}
	@Override
	public String toString() {
		StringBuilder risultato= new StringBuilder();
		
		
		if(this.hasAttrezzo(attrezzoLuce)) {
			risultato.append(this.getNome());
	    	risultato.append("\nUscite: ");
	    	for (String direzione : this.getDirezioni())
	    		if (direzione!=null)
	    			risultato.append(" " + direzione);
	    	risultato.append("\nAttrezzi nella stanza: ");
	    	risultato.append(this.attrezziesimi());

		}

		else {
			risultato.append(BUIO);

		}
		return risultato.toString();
	}
	
	
	public String getAttrezzoLuce() {
		return attrezzoLuce;
	}
	public void setAttrezzoLuce(String attrezzoLuce) {
		this.attrezzoLuce = attrezzoLuce;
	}
	
	//FONDAMENTALE CHE CI SIA
	public static String getBuio() {
		return BUIO;
	}
	
	
}
