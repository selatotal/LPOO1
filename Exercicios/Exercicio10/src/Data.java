
public class Data {

	// Atributos
	private int dia;
	private int mes;
	private int ano;
	
	// Metodos
	public String mostraData(){
		return dia + "/" + mes + "/" + ano;
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setDia(int d){
		dia = d;
	}
	
	public void setMes(int m){
		mes = m;
	}
	
	public void setAno(int a){
		ano = a;
	}
}
