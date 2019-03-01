import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static boolean checaFinal(int[] integrantes) {
		int menorValor = integrantes[0];
		for(int i=1; i < integrantes.length; i++) {
			if (menorValor != integrantes[i]) {
				if (menorValor == integrantes[integrantes.length-1]-1) {
					return true;
				}
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		entrada.nextLine();
		int[] integrantes = new int[n];
		for (int i = 0; i < n; i++) {
			integrantes[i] = entrada.nextInt();
		}
		
		Arrays.sort(integrantes);
		int compassos=1;
		while(!checaFinal(integrantes)) {
			integrantes[0]+=1;
			integrantes[n-1]-=1;
			Arrays.sort(integrantes);
			compassos++;
		}
		if (integrantes[0] != integrantes[n-1]) {
			System.out.println(-1);
		} else {
			System.out.println(compassos);
		}
	}

}
