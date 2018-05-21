
public class Quadrado extends Quadrilatero implements FiguraGeometrica {

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
	}
	
	@Override
	public double calculaArea() {
		return this.getLado1() * this.getLado2();
	}

}
