package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagica extends Stanza {	

	final static private int SOGLIA_MAGICA_DEFAULT = 3;
	private int contatoreAttrezziPosati;
	private int sogliaMagica;
	
	//costruttore con soglia di default
	public StanzaMagica(String nome) {
		this(nome, SOGLIA_MAGICA_DEFAULT);		//richiama il costruttore sotto e usa una soglia di default
	}
	
	//costruttore con soglia da impostare
	public StanzaMagica(String nome, int soglia) {
		super(nome);
		this.contatoreAttrezziPosati = 0;
		this.sogliaMagica = soglia;
	}
	@Override			//unico metodo che va ridefinito perchè la stanza magica ha un comportamento particolare
	public void addAttrezzo(Attrezzo attrezzo) {
		this.contatoreAttrezziPosati ++;
		if(this.contatoreAttrezziPosati> this.sogliaMagica) {
			attrezzo = modificaAttrezzo(attrezzo);
		}
		//return super.addAttrezzo(attrezzo);   questo va se void->boolean
	}
	
	
	private Attrezzo modificaAttrezzo(Attrezzo attrezzo) {
		StringBuilder nomeInvertito;
		int pesoX2 = attrezzo.getPeso() * 2;
		nomeInvertito = new StringBuilder(attrezzo.getNome());
		nomeInvertito = nomeInvertito.reverse();
		attrezzo = new Attrezzo(nomeInvertito.toString(),pesoX2);
		return attrezzo;
	}
}