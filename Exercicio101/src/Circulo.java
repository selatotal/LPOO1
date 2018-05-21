
public class Circulo implements FiguraGeometrica {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public double calculaArea() {
		return Math.pow(this.calculaPerimetro(), 2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
