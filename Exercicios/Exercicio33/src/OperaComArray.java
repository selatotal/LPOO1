import java.util.Random;

public class OperaComArray {

	private int[] array;
	private static int MAX_VALUE = 1000;
	
	public OperaComArray(int tamanho) {
		this.array = new int[tamanho];
		Random random = new Random();
		for (int i=0; i < tamanho; i++) {
			this.array[i] = random.nextInt(MAX_VALUE);
		}
	}
	
	public int retornaSoma() {
		int soma = 0;
		for (int posicao : this.array) {
			soma += posicao;
		}
		return soma;
	}
	
	public double retornaMedia() {
		return this.retornaSoma() / (double)this.array.length;
	}
	
	public int retornaUltimo() {
		return this.array[this.array.length-1];
	}
	
	public int retornaMaior() {
		int maior = this.array[0];
		for (int posicao : this.array) {
			if (posicao > maior) {
				maior = posicao;
			}
		}
		return maior;
	}
	
	public boolean estahNoArray(int numero) {
		for (int posicao : this.array) {
			if (posicao == numero) {
				return true;
			}
		}
		return false;
	}
}
