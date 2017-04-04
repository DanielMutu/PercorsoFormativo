
package persona;

import java.util.*;

//example use Annotations
@Author(name = "Daniel Mutu")

  
class donna{
	/**
	 * @deprecated
	 * Deprecato per vedere se funziona il "deprecated"
	 */
	
	
	@Deprecated
	public void parla(){
	    System.out.println("Parla");
	}
	
	
	
	
}


interface Movimento {
	   public void mangia();
	   public void cammina();	   	   
	}

class  ragazzo extends persona{
	
	String età;
	
	//costruttore
	public ragazzo(String età){
	//Esempio utilizzo super 
		super(nome);
		this.età="18";
	}
	//set
	public void setRagazzo(String setEtà){
		this.età=setEtà;	
	}
	//get 
	public String getEtà(){
		return età;
	}
}
public class init{
public static void main(String [] args ){

	String nuovoNome;
	int scelta;
	
	persona p=new persona(""); 
	ragazzo r=new ragazzo("");
	
	System.out.println("Digita: \n 1. Per Visualizzare-Implementare nome|età|movimento (arg. interfaccie, sottoclassi)");
	System.out.println("Digita: \n 2. Per confrontare due stringhe(arg. equals)");
	Scanner input = new Scanner(System.in);
	scelta=input.nextInt();

	switch(scelta){
	
	case 1:
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Inserisci il nuovo nome da implementare nella classe persone:  ");
		nuovoNome=input2.nextLine();
		p.setPersona(nuovoNome);
		System.out.println("Il nuovo nome è: "+p.getNome()+ ", ha "+ r.getEtà()+" anni e ora "  );
		r.cammina();
		break;
		
	case 2:	
		System.out.println("Inserisci il primo nome da confrontare:  ");
		Scanner input3 = new Scanner(System.in);
		String primoNome=input3.nextLine();
		System.out.println("Inserisci il secondo nome da confrontare:  ");
		Scanner input4 = new Scanner(System.in);
		String secondoNome=input4.nextLine();
		if(primoNome.equals(secondoNome)){
			System.out.println("I due nomi sono uguali");
		}else{
			System.out.println("I due nomi sono diversi");
		}
	}
	
	

	
	}
}
