package it.uniroma3.diadia.comandi;
import java.util.Scanner;

import it.uniroma3.diadia.interfacciaComandi.IO;

public class FabbricaDiComandiFisarmonica implements FabbricaDiComandi {

	private String nomeComando;
	private String parametro;
	private Comando comando;
	private IO interfaccia;

	public FabbricaDiComandiFisarmonica(IO tipoInterfaccia) {
		this.nomeComando=null;
		this.parametro = null;
		this.comando = null;
		this.interfaccia = tipoInterfaccia;
	}


	public Comando costruisciComando(String istruzione) {

		Scanner scannerDiParole= new Scanner(istruzione);


		if(scannerDiParole.hasNext())
			nomeComando= scannerDiParole.next();

		if(scannerDiParole.hasNext())
			parametro= scannerDiParole.next();
		scannerDiParole.close();

		if(nomeComando==null)
			comando=new ComandoNonValido();

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
		comando.setIO(interfaccia);
		return comando;
	}
}