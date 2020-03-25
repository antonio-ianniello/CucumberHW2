package it.uniroma3.diadia.comandi;




import it.uniroma3.diadia.interfacciaComandi.InterfacciaUtente;


//non più utilizzataa si usa la stessa fabbrica
public class FabbricaDiComandiFisarmonica implements FabbricaDiComandi {
	
	
	private String nomeComando;
	private String parametro;
	private Comando comando;
	private InterfacciaUtente interfaccia;
	
	public FabbricaDiComandiFisarmonica(InterfacciaUtente tipoInterfaccia) {
		this.nomeComando=null;
		this.parametro = null;
		this.comando = null;
		this.interfaccia = tipoInterfaccia;
	}
	
	
	public Comando costruisciComando(String istruzione) {
		
		this.interfaccia.costruisciIstruzione(istruzione);
		
		
		//if(interfaccia.getNomeIstruzione()!=null  && interfaccia.getNomeParamaetro()!=null) {
		//	nomeComando= interfaccia.getNomeIstruzione();
			//parametro =interfaccia.getNomeParamaetro();
	/*		
			System.out.print(nomeComando+" è il nome che riceve il comando\n");
			System.out.print(parametro+" è il parametro che riceve il comando\n");
		}
		
		
		if(interfaccia.getNomeIstruzione()!=null) {
			nomeComando = interfaccia.getNomeIstruzione();
			System.out.print(nomeComando+" è il nome che riceve il comando\n");
			System.out.print(parametro+" è il parametro che riceve il comando\n");
		}
		
		*/
			
			if(interfaccia.getNomeParamaetro()==null) {
				this.nomeComando = interfaccia.getNomeIstruzione();
			}
			if(interfaccia.getNomeParamaetro()!=null) {
				this.nomeComando = interfaccia.getNomeIstruzione();
				this.parametro = interfaccia.getNomeParamaetro();
			}

		
		if(nomeComando==null)
			comando=new ComandoNonValido();
//fino qui		
		
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

}