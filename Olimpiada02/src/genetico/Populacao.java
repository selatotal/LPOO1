package genetico;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Populacao {

	Cromossomo[] geracao;
	LinkedList<Long> valores;
	Long valorMaisApto = 0L;

	public Populacao(int tamanho, LinkedList<Long> valores) {
		this.geracao = new Cromossomo[tamanho];
		this.valores = valores;
	}

	public void geraRandomico() {
		for (int i = 0; i < this.geracao.length; i++) {
			this.geracao[i] = new Cromossomo(this.valores.size(), this.valores);
			this.geracao[i].criaRandomico();
		}
	}

	public Cromossomo buscaMaisApto() {
		Arrays.sort(geracao);
		this.valorMaisApto = this.geracao[0].getValorAntonio();
		return this.geracao[0];
	}

	public void criaNovaGeracao() {
		Cromossomo[] novaGeracao = new Cromossomo[this.geracao.length];

		novaGeracao[0] = buscaMaisApto();
	}

	public void cruzamento(Cromossomo[] novaGeracao, int posicao1, int posicao2) {
		Random random = new Random();
		int pos1 = random.nextInt(valores.size() - 5);
		int pos2 = random.nextInt(valores.size() - 1);
		while (pos2 <= pos1) {
			pos2 = random.nextInt(valores.size() - 1);
		}

		int[][] cromossomos = new int[this.geracao.length - 1][];
		int pos = 0;
		for (int i = 1; i < this.geracao.length; i++) {
			cromossomos[pos++] = this.geracao[i].getCromossomo();
		}

		for (int i = 0; i <= valores.size(); i++) {
			if (i <= pos1 || i >= pos2) {
				int aux = cromossomos[0][i];
				cromossomos[0][i] = cromossomos[1][i];
				cromossomos[1][i] = aux;
				aux = cromossomos[2][i];
				cromossomos[2][i] = cromossomos[3][i];
				cromossomos[3][i] = aux;
			}

			for (int k=0; k<4; k++) {
				int posMutacao = random.nextInt(cromossomos[0].length);
				for (int j = 0; j < 4; j++) {
					if (cromossomos[j][posMutacao] == 0) {
						cromossomos[j][posMutacao] = 1;
					} else {
						cromossomos[j][posMutacao] = 0;
					}
				}
			}
		}
		
		for(int i=1; i < novaGeracao.length; i++) {
			novaGeracao[i] = new Cromossomo(cromossomos[i-1], this.valores);
		}
	}
}
