
public class Tabuleiro {

	private CorPeca[][][] tabuleiro = new CorPeca[3][3][3];
	private int[][][] vitoriaTabuleiro = {
			{{0,0},{0,1},{0,2}},
			{{1,0},{1,1},{1,2}},
			{{2,0},{2,1},{2,2}},
			{{0,0},{1,0},{2,0}},
			{{0,1},{1,1},{2,1}},
			{{0,2},{1,2},{2,2}},
			{{0,0},{1,1},{2,2}},
			{{0,2},{1,1},{0,2}}
	};
	private int[][][] vitoriaDiagonais = {
			{{0,0,0},{1,0,1},{2,0,2}},
			{{0,1,0},{1,1,1},{2,1,2}},
			{{0,2,0},{1,2,1},{2,2,2}},
			{{2,0,0},{1,0,1},{0,0,2}},
			{{2,1,0},{1,1,1},{0,1,2}},
			{{2,2,0},{1,2,1},{0,2,2}},
			{{0,0,0},{1,0,1},{2,0,2}},
			{{0,1,0},{1,1,1},{2,1,2}},
			{{0,2,0},{1,2,1},{2,2,2}},
			{{2,0,0},{1,0,1},{0,0,2}},
			{{2,1,0},{1,1,1},{0,1,2}},
			{{2,2,0},{1,2,1},{0,2,2}},
			{{0,0,0},{1,1,1},{2,2,2}},
			{{0,2,0},{1,1,1},{2,0,2}},
			{{2,0,0},{1,1,1},{0,2,2}},
			{{2,2,0},{1,1,1},{0,0,2}}
	};
	
	public boolean jogar(CorPeca corPeca, int tabuleiro, int linha, int coluna) {
		if (this.tabuleiro[tabuleiro][linha][coluna] != null) {
			return false;
		}
		this.tabuleiro[tabuleiro][linha][coluna] = corPeca;
		return true;
	}
	
	public CorPeca checkVitoria() {
		
		// Verifica vitoria em tabuleiros individuais
		for (int i=0; i < 3; i++) {
			for(int[][] acerto : vitoriaTabuleiro) {
				if ((tabuleiro[i][acerto[0][0]][acerto[0][1]] != null) &&
					(tabuleiro[i][acerto[0][0]][acerto[0][1]] == tabuleiro[i][acerto[1][0]][acerto[1][1]]) &&
					(tabuleiro[i][acerto[0][0]][acerto[0][1]] == tabuleiro[i][acerto[2][0]][acerto[2][1]])){
					return tabuleiro[i][acerto[0][0]][acerto[0][1]];
				}
			}
		}
		
		// Verifica vitorias tridimensionais por posicao
		for (int j=0; j < 3; j++) {
			for(int k=0; k < 3; k++) {
				if ((tabuleiro[0][j][k] != null) &&
					(tabuleiro[0][j][k] == tabuleiro[1][j][k]) &&
					(tabuleiro[0][j][k] == tabuleiro[2][j][k])){
					return tabuleiro[0][j][k];
				}
			}
		}
		
		// Verifica vitorias tridimensionais nas diagonais
		for(int[][] acerto : vitoriaDiagonais) {
			if ((tabuleiro[acerto[0][0]][acerto[0][1]][acerto[0][2]] != null) &&
				(tabuleiro[acerto[0][0]][acerto[0][1]][acerto[0][2]] == tabuleiro[acerto[1][0]][acerto[1][1]][acerto[1][2]]) &&
				(tabuleiro[acerto[0][0]][acerto[0][1]][acerto[0][2]] == tabuleiro[acerto[2][0]][acerto[2][1]][acerto[2][2]])){
				return tabuleiro[acerto[0][0]][acerto[0][1]][acerto[0][2]];
			}
		}
				
		// Verifica se ainda tem jogadas possiveis
		// Se tiver, retorna null
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3;k++) {
					if (tabuleiro[i][j][k] == null) {
						return null;
					}
				}
			}
		}
		
		// Retorna acabou
		return CorPeca.ACABOU;
		
	}
	
	public void imprimeTabuleiro() {
		char[][][] tabuleiroImpressao = new char[3][3][3];
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3;k++) {
					if (tabuleiro[i][j][k] == null) {
						tabuleiroImpressao[i][j][k] = ' ';
					} else if (tabuleiro[i][j][k] == CorPeca.XIS) {
						tabuleiroImpressao[i][j][k] = 'X';
					} else {
						tabuleiroImpressao[i][j][k] = 'O';
					}
				}
			}
		}
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(tabuleiroImpressao[j][i][0] + "|" + tabuleiroImpressao[j][i][1] + "|" + tabuleiroImpressao[j][i][2] + "\t");
			}
			System.out.println();
			if (i < 2) {
				System.out.println("-+-+-\t-+-+-\t-+-+-");
			}
		}
	}
	
}
