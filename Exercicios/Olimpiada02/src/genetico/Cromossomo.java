package genetico;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Cromossomo implements Comparable<Cromossomo> {

	int[] cromossomo;
	LinkedList<Long> valoresOriginais;
	long valorAntonio;
	
	public Cromossomo(int tamanho, LinkedList<Long> valores) {
		cromossomo = new int[tamanho];
		valoresOriginais = valores;
	}
	
	public Cromossomo(int[] cromossomo, LinkedList<Long> valores) {
		this.cromossomo = cromossomo;
		valoresOriginais = valores;
	}
	
	public int[] getCromossomo() {
		return this.cromossomo;
	}
	
	public long getValorAntonio() {
		return this.valorAntonio;
	}
	
	public void criaRandomico() {
		Random rand = new Random();
		for (int i=0; i < cromossomo.length; i++) {
			cromossomo[i] = rand.nextInt(2);
		}
	}
	
	public long calculaAptidao() {
		boolean vezAntonio = true;
		long valorAntonio = 0;
		long valorOutro = 0;

		LinkedList<Long> valores = new LinkedList<>();
		for(Long valor : this.valoresOriginais) {
			valores.add(valor);
		}

		for(int posicao: cromossomo) {
			if (vezAntonio) {
				if (posicao == 0) {
					valorAntonio += valores.getFirst();
					valores.removeFirst();
				} else {
					valorAntonio += valores.getLast();
					valores.removeLast();
				}
				vezAntonio = false;
			} else {
				if (posicao == 0) {
					valorOutro += valores.getFirst();
					valores.removeFirst();
				} else {
					valorOutro += valores.getLast();
					valores.removeLast();
				}
				vezAntonio = true;
			}
		}
		this.valorAntonio = valorAntonio;
		return Math.abs(valorAntonio-valorOutro);
	}

	@Override
	public int compareTo(Cromossomo o) {
		long valorThis = this.calculaAptidao();
		long valorO = o.calculaAptidao();
		
		if (valorThis > valorO) {
			return 1;
		} else if (valorThis < valorO) {
			return -1;
		}
		return 0;
	}
	
}
