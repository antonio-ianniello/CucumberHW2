package diadiaHW2CucumberTest;

import cucumber.runtime.io.Helpers;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoAiuto;
import it.uniroma3.diadia.comandi.ComandoFine;
import it.uniroma3.diadia.comandi.ComandoGuarda;
import it.uniroma3.diadia.comandi.ComandoNonValido;
import it.uniroma3.diadia.comandi.ComandoPosa;
import it.uniroma3.diadia.comandi.ComandoPrendi;
import it.uniroma3.diadia.comandi.ComandoVai;
import it.uniroma3.diadia.comandi.FabbricaDiComandi;

public class FabbricaDiComandiAutomatici implements FabbricaDiComandi{

	private String nomeComando;
	private String parametro;
	private Comando comando;
	private StringheIO IO;

	
	
	public FabbricaDiComandiAutomatici(StringheIO IOconsole) {
		this.nomeComando=null;
		this.parametro=null;
		this.comando= null;
		this.IO = IOconsole;
		
	}
	

	
	public Comando costruisciComando(String istruzione) {
		// TODO Auto-generated method stub
		
	

		if(IO.getParametroAttuale()==null)
		nomeComando= IO.getComandoAttuale();

		if(IO.getParametroAttuale()!=null)
		nomeComando = IO.getComandoAttuale();	
		parametro=IO.getParametroAttuale();
	
	
	if(nomeComando==null)
		comando=new ComandoNonValido();
	
	//interfaccia untente console va dato il compito
	else if(nomeComando.equals("vai"))
		comando= new ComandoVai();
	else if(nomeComando.equals("prendi"))
		comando= new ComandoPrendi();
	else if(nomeComando.equals("posa"))
		comando= new ComandoPosa();
	else if(nomeComando.equals("aiuto"))
		comando= new ComandoAiuto();
	else if(nomeComando.equals("fine"))
		comando= new ComandoFine();
	else if(nomeComando.equals("guarda"))
		comando= new ComandoGuarda();
	
	else comando = new ComandoNonValido();
	
	comando.setParametro(parametro);
	return comando;

}

//getters and setters

	public String getNomeComando() {
		return nomeComando;
	}



	public void setNomeComando(String nomeComando) {
		this.nomeComando = nomeComando;
	}



	public String getParametro() {
		return parametro;
	}



	public void setParametro(String parametro) {
		this.parametro = parametro;
	}



	public Comando getComando() {
		return comando;
	}



	public void setComando(Comando comando) {
		this.comando = comando;
	}
	
	
	
	
	
}
