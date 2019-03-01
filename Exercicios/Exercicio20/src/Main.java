
public class Main {

	public static void main(String[] args) {

		ComplexNumber complex1 = new ComplexNumber(6, 5);
		ComplexNumber complex2 = new ComplexNumber(2, -1);
		
		complex1.sum(complex2);
		
		System.out.println(complex1.getX() + " - " + complex1.getY());
	}

}
