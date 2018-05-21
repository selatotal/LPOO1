import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas formas deseja criar: ");
		int numFormas = Integer.parseInt(input.nextLine());
		FiguraGeometrica[] formas = new FiguraGeometrica[numFormas];
		for (int i=0; i < formas.length; i++) {
			int opcao;
			do {
				System.out.println("Que forma deseja criar:");
				System.out.println("1 - Quadrado");
				System.out.println("2 - Retangulo");
				System.out.println("3 - Circulo");
				System.out.print("Opcao: ");
				opcao = Integer.parseInt(input.nextLine());
			} while (opcao < 1 || opcao > 3);
			switch(opcao) {
			case 1:
				System.out.print("Informe o valor do lado: ");
				double lado = Double.parseDouble(input.nextLine());
				formas[i] = new Quadrado(lado);
				break;
			case 2:
				System.out.print("Informe o valor da base: ");
				double base = Double.parseDouble(input.nextLine());
				System.out.print("Informe o valor da altura: ");
				double altura = Double.parseDouble(input.nextLine());
				formas[i] = new Retangulo(base, altura);
				break;
			case 3:
				System.out.print("Informe o valor do raio: ");
				double raio = Double.parseDouble(input.nextLine());
				formas[i] = new Circulo(raio);
				break;
			}
		}

		for(FiguraGeometrica figura : formas) {
			if (figura instanceof Quadrado) {
				Quadrado quadrado = (Quadrado)figura;
				System.out.println("QUADRADO");
				System.out.println("Valor do Lado: " + quadrado.getLado1());
			} else if (figura instanceof Retangulo) {
				Retangulo retangulo = (Retangulo)figura;
				System.out.println("RETANGULO");
				System.out.println("Valor da base: " + retangulo.getLado1());
				System.out.println("Valor da altura: " + retangulo.getLado2());
			} else {
				Circulo circulo = (Circulo)figura;
				System.out.println("CIRCULO");
				System.out.println("Valor do raio: " + circulo.getRaio());
			}
			System.out.println("Valor do Perimetro: " + figura.calculaPerimetro());
			System.out.println("Valor da Area: " + figura.calculaArea());
		}
		
	}

}
