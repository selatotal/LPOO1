# Gomoku

O jogo japonês Gomoku é jogado por duas pessoas em um tabuleiro quadrado de tamanho 19×19. 

Cada pessoa recebe um conjunto de peças pretas e brancas que devem ser colocadas alternadamente no tabuleiro, na posição que o jogador desejar. 

Ganha o jogo o primeiro jogador que conseguir colocar cinco de suas peças em uma linha reta horizontal, vertical ou diagonal. 

Crie uma classe em Java que represente um jogo de Gomoku, usando uma matriz de duas dimensões para representar as posições do jogo. 

A matriz deve ser alocada no construtor da classe, ter o tamanho 19 × 19 e ser de um tipo que suporte três estados possíveis: vazio, preenchido com peça preta e preenchido com peça branca. 

A classe deve poder ser usada para jogos com dois jogadores. 

A classe deve ter os seguintes métodos: 

* jogaPreta, que aceita dois valores que são as coordenadas onde uma peça preta será jogada, e marca na matriz a posição somente se esta estiver livre. 

* jogaBranca, que aceita dois valores que são as coordenadas onde uma peça branca será jogada, e marca na matriz a posição somente se esta estiver livre. 

* verifica, que verifica a matriz para ver se existe algum ganhador (este método deve verificar se existem cinco peças iguais que não sejam vazias em uma horizontal, vertical ou diagonal da matriz, depois de cada jogada feita). 

* toString, que retornará uma string com a representação gráfica do jogo com as posições atuais. 

Escreva também um programa que use a classe. Esse programa deve executar um laço no qual fica perguntando as posições para os jogadores alternadamente, enquanto não houver vitória, desistência ou acabarem as posições vazias da matriz. 

