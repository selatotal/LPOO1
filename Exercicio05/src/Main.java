
public class Main {

	public static void main(String[] args) {
		int totalPerfeitos = 0;
		int numero = 1;
	
		while(totalPerfeitos < 10){
			int soma = 0;
			int totImpares = 0;
			for(int i=1; soma < numero; i+=2){
				soma += i;
				totImpares++;
			}
			if (numero == soma){
				System.out.println(numero);
				totalPerfeitos++;
			}
			numero++;
		}
	}

}
