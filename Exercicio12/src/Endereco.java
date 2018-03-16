
public class Endereco {

	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;

	public Endereco(){
		
	}
	
	public Endereco(String rua, int numero, String complemento, String bairro, String cep, String cidade){
		this.setRua(rua);
		this.setNumero(numero);
		this.setComplemento(complemento);
		this.setBairro(bairro);
		this.setCep(cep);
		this.setCidade(cidade);
	}
	
	public void mostraDados(){
		System.out.println("Rua: " + this.getRua());
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Complemento: " + this.getComplemento());
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Cep: " + this.getCep());
		System.out.println("Cidade: " + this.getCidade());
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
