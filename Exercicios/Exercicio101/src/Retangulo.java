
public class Retangulo extends Quadrilatero implements FiguraGeometrica {

	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
	}
	
	@Override
	public double calculaArea() {
		return this.getLado1() * this.getLado2();
	}

	
}
