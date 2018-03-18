
public class Main {

	public static void main(String[] args) {

		Porta porta = new Porta();
		
		System.out.println("Esta aberta: " + porta.estaAberta());		
		porta.abre();
		System.out.println("Esta aberta: " + porta.estaAberta());
		porta.fecha();
		System.out.println("Esta aberta: " + porta.estaAberta());		
		porta.pinta("Azul");
		System.out.println("Cor da porta: " + porta.getCor());		
		porta.pinta("Branco");
		System.out.println("Cor da porta: " + porta.getCor());		
		porta.pinta("Preto");
		System.out.println("Cor da porta: " + porta.getCor());		
	}

}
