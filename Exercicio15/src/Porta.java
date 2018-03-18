
public class Porta {

	private boolean aberta;
	private String cor;
	
	public void abre(){
		this.aberta = true;
	}
	
	public void fecha(){
		this.aberta = false;
	}
	
	public void pinta(String cor){
		this.cor = cor;
	}
	
	public boolean estaAberta(){
		return this.aberta;
	}
	
	public String getCor(){
		return this.cor;
	}
}
