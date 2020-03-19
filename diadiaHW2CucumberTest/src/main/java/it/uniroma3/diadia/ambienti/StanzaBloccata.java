package it.uniroma3.diadia.ambienti;

//import it.uniroma3.diadia.giocatore.Giocatore;

public class StanzaBloccata extends Stanza {
	private String direzioneBloccata;
	private String attrezzoChiave;
	
/**
 * 
 * @param nome, nome stanza bloccata
 * @param direzione, direzione bloccata
 * @param attrezzochiave
 */
	public StanzaBloccata(String nome,String direzione,String attrezzochiave) {
		super(nome);
		this.direzioneBloccata= direzione;
		this.attrezzoChiave=attrezzochiave;		
	}

	
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
	if(!this.hasAttrezzo(attrezzoChiave)) {  // se non hai la chiave non passi
		s.append("Stanza non accessibile, forse hai bisogno di una chiave! O forse non l' hai posata nella serratura");
		
		
		}
	else {
		s.append("puoi passare complimenti!");
	}
			
			
		return s.toString();
	}
	
	
	
	
	
	
	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		
		//direzione bloccata ma hai la chiave giusta
		if(this.direzioneBloccata.equals(direzione) && this.hasAttrezzo(attrezzoChiave)) {
			System.out.println("Sei passato,sembra  che la chiave fosse quella giusta!\n");
			return super.getStanzaAdiacente(direzione);
		}
		//abbiamo scelto direzione bloccata e non abbiamo la chiave
		else if(this.direzioneBloccata.equals(direzione) && !this.hasAttrezzo(attrezzoChiave)) {
			return this; 
		}

		else
			//ritorna il valore della stanza adiacente
			return super.getStanzaAdiacente(direzione);
	}



}

