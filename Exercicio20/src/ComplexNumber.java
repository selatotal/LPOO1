
public class ComplexNumber {

	private double x;
	private double y;

	public ComplexNumber() {
		this.x = 0;
		this.y = 0;
	}
	
	public ComplexNumber(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
		double x = a.getX() + b.getX();
		double y = a.getY() + b.getY();
		return new ComplexNumber(x, y);
	}

	public void sum(ComplexNumber a) {
		ComplexNumber result = ComplexNumber.sum(this, a);
		this.setX(result.getX());
		this.setY(result.getY());
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
