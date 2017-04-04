package persona;

@Author(name = "Daniel Mutu")

public class persona implements Movimento{

	//Attributi
	protected static String nome;

	//costructor
	public persona(String nome){
		nome="";	
	}
	//set
	public void setPersona(String setNome){
		this.nome=setNome;
	}
	//get 
	public String getNome(){
		return nome;
		
	}
	//annotations
	@Override
	public void mangia() {
		System.out.println("Sta mangiando");
		
	}
	//annotations
	@Override
	public void cammina() {
		System.out.println("sta camminando");
		
	}
	
}
