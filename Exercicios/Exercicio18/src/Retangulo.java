
public class Retangulo {

	private double altura;
	private double largura;
	private Ponto vertice;

	public Retangulo(){
	}
	
	public Retangulo(double altura, double largura) {
		this.setAltura(altura);
		this.setLargura(largura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0){
			this.altura = altura;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura > 0){
			this.largura = largura;
		}
	}

	public Ponto getVertice() {
		return vertice;
	}

	public void setVertice(Ponto vertice) {
		this.vertice = vertice;
	}
	
	public Ponto getCentro(){
		if (this.altura == 0 || this.largura == 0 || this.vertice == null){
			return null;
		}
		
		double xCentro = this.vertice.getX() + (largura/2.0);
		double yCentro = this.vertice.getY() - (altura/2.0);
		
		return new Ponto(xCentro, yCentro);
	}
	
}
