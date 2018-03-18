
public class Casa {

	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;

	public void pinta(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}

	public int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		if (porta1 != null && porta1.estaAberta()) {
			portasAbertas++;
		}
		if (porta2 != null && porta2.estaAberta()) {
			portasAbertas++;
		}
		if (porta3 != null && porta3.estaAberta()) {
			portasAbertas++;
		}
		return portasAbertas;
	}

	public int totalDePortasInstaladas() {
		int portasInstaladas = 0;
		if (porta1 != null) {
			portasInstaladas++;
		}
		if (porta2 != null) {
			portasInstaladas++;
		}
		if (porta3 != null) {
			portasInstaladas++;
		}
		return portasInstaladas;
	}

	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

}
