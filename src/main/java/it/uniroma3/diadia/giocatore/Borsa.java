package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;
/**
 * classe che modella la borsa dove verranno riposti gli oggetti del giocatore
 * @author anton
 *
 */
public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	/**
	 * costruttore borsa
	 * @param pesoMax
	 * il parametro identifica il peso massimo che puo' portare la borsa
	 */
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new Attrezzo[10]; // speriamo che bastino...
		this.numeroAttrezzi = 0;
	}
	
	/**
	 * aggiunge un attrezzo alla borsa
	 * @param attrezzo
	 * @return true se l' oggetto viene aggiunto,false altrimenti
	 */
	public boolean addAttrezzo(Attrezzo attrezzo) {
			

		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;		//peso troppo grande,spazio non sufficiente
		if (this.numeroAttrezzi==10)
			return false;		//troppi oggetti , spazio non sufficiente
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}
	/**
	 * REstituisce il massimo che può contenere la borsa
	 * @return pesoMax il peso massimo della borsa
	 */
	public int getPesoMax() {
		return pesoMax;
	}
	
	/**
	 * 
	 * @param nomeAttrezzo
	 * @return null se non vi è l' attrezzo passato come parametro,altrimenti a
	 */
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
				a = attrezzi[i];
		return a;}
	

	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			peso += this.attrezzi[i].getPeso();
		return peso;
	}
	/**
	 * 
	 * @return true se isEmpty, altrimenti false
	 */
	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	/**
	 * funzione che restituisce vero se ha rimosso l' elemento
	 * @param nomeAttrezzo,attrezzo da rimuovere
	 * @return true se ha rimosso, senno' false
	 */
	public Attrezzo  removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		boolean trovato = false;
		for(int i=0;i<this.numeroAttrezzi && !trovato;i++) {
			if(this.attrezzi[i].getNome().equals(nomeAttrezzo)) {
				a= this.attrezzi[i];
				this.attrezzi[i]=this.attrezzi[this.numeroAttrezzi-1];
				this.attrezzi[this.numeroAttrezzi-1]=null;
				this.numeroAttrezzi--;
				trovato= true;
				
			}
		}
		return a;
		
		
		
	}
	public void SetPeso(int peso) {
		this.pesoMax=peso;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.numeroAttrezzi; i++)
				s.append(attrezzi[i].toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
}