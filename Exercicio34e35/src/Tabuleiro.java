
public class Tabuleiro {

	private CorPeca[][] tabuleiro = new CorPeca[19][19];

	public boolean jogar(CorPeca corPeca, int linha, int coluna) {
		if (this.tabuleiro[linha][coluna] != null) {
			return false;
		}
		this.tabuleiro[linha][coluna] = corPeca;
		return true;
	}

	public void imprimeTabuleiro() {
		char[][] tabuleiroImpressao = new char[19][19];
		for (int j = 0; j < 19; j++) {
			for (int k = 0; k < 19; k++) {
				if (tabuleiro[j][k] == null) {
					tabuleiroImpressao[j][k] = ' ';
				} else if (tabuleiro[j][k] == CorPeca.XIS) {
					tabuleiroImpressao[j][k] = 'X';
				} else {
					tabuleiroImpressao[j][k] = 'O';
				}
			}
		}
		for (int i=0; i < 19; i++) {
			if (i == 0) {
				System.out.println("  1+2+3+4+5+6+7+8+9+0+1+2+3+4+5+6+7+8+9");
				System.out.println("  -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			}
			for (int j = 0; j < 19; j++) {
				if (j==0) {
					System.out.print((i+1)%10+ " ");
				}
				System.out.print(tabuleiroImpressao[i][j]);
				if (j < 18) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < 18) {
				System.out.println("  -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
			}
		}
	}

	public boolean checaVizinhanca(int linha, int coluna) {
		// vizinhanca Horizontal
		CorPeca cor = this.tabuleiro[linha][coluna] ;
		int col=coluna;
		int pecasSequencia=0;
		while(col >= 0 && this.tabuleiro[linha][col] == cor) {
			pecasSequencia++;
			col--;
		}
		col = coluna + 1;
		while(col <= 19 && this.tabuleiro[linha][col] == cor) {
			pecasSequencia++;
			col++;
		}
		if (pecasSequencia >= 5) {
			return true;
		}

		// vizinhanca Vertical
		int lin=linha;
		pecasSequencia=0;
		while(lin >= 0 && this.tabuleiro[lin][coluna] == cor) {
			pecasSequencia++;
			lin--;
		}
		lin = linha + 1;
		while(lin <= 19 && this.tabuleiro[lin][coluna] == cor) {
			pecasSequencia++;
			lin++;
		}
		if (pecasSequencia >= 5) {
			return true;
		}

		// vizinhanca Diagonal
		lin=linha;
		col=coluna;
		pecasSequencia=0;
		while(lin >= 0 && col>= 0 && this.tabuleiro[lin][col] == cor) {
			pecasSequencia++;
			lin--;
			col--;
		}
		lin=linha+1;
		col=coluna+1;
		while(lin <= 19 && col<= 19 && this.tabuleiro[lin][col] == cor) {
			pecasSequencia++;
			lin++;
			col++;
		}
		if (pecasSequencia >= 5) {
			return true;
		}

		lin=linha;
		col=coluna;
		pecasSequencia=0;
		while(lin >= 0 && col<= 19 && this.tabuleiro[lin][col] == cor) {
			pecasSequencia++;
			lin--;
			col++;
		}
		lin=linha+1;
		col=coluna-1;
		while(lin <= 19 && col>= 0 && this.tabuleiro[lin][col] == cor) {
			pecasSequencia++;
			lin++;
			col--;
		}
		if (pecasSequencia >= 5) {
			return true;
		}

		return false;
	}
	public CorPeca checkVitoria() {
		CorPeca retorno = CorPeca.ACABOU;
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				if (this.tabuleiro[i][j] != null) {
					retorno = null;
					if (this.checaVizinhanca(i, j)) {
						return this.tabuleiro[i][j];
					}
				}
			}
		}
		return retorno;
	}

}
