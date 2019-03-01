# Exercício 16 - Carro
a) Crie um esqueleto de uma classe em Java (atributos e a definição dos métodos) para representar o seguinte papel (note que é apropriado especificar os tipos dos atributos, retornos e parâmetros; contudo, não se preocupe em escrever o corpo dos métodos):

Carro: Um Carro pode ter as seguintes características: cor, capacidade do motor (p. ex., 1.0, 1.6, 2.0, etc.) e velocidade.

Carros como este podem aceitar somente dois comandos: aumentar uma certa quantidade de km/h em sua velocidade (quantidade esta que será escolhida pelo piloto do carro e não deverá ser pré-fixada), reduzir uma certa quantidade de km/h em sua velocidade (quantidade esta que será escolhida pelo piloto do carro e não deverá ser pré-fixada).

b) Implemente o corpo dos dois métodos (aumentarVelocidade(double) e reduzirVelocidade(double), levando em consideração as seguintes regras:

* A quantidade a ser reduzida ou aumentada na velocidade deverá ser sempre positiva; caso a quantidade entrada seja negativa, mostre uma mensagem de erro e não permita o processamento (não faça nada).
* Não existe velocidade negativa! Ou seja, ao reduzir a velocidade, não permita que ela fique menor que zero. Mostre uma mensagem de erro caso isso seja tentado.
* Há limite superior de velocidade, de acordo com a capacidade do motor. Podemos estabelecer que este limite é de 110 vezes a capacidade do motor, ou seja, um motor 1.0 andaria somente até 110 km/h, e um 2.0 até 220 km/h. Ao aumentar a velocidade, não permita que ela fique acima deste limite. Mostre uma mensagem de erro caso isso seja tentado.
* Este carro conta com um Air-Bag. Caso a redução de velocidade seja muito abrupta, ou seja, se eu tentar reduzir 60 km/h ou mais de uma única vez, o Air-Bag será disparado (obviamente, isso será simulado com uma mensagem mostrada nesta situação).

c) Crie os métodos de acesso que achar conveniente para o problema enunciado nas questões anteriores. Crie também um construtor.

d) Crie uma classe Main que deverá instanciar um carro com cor e capacidade do motor informadas pelo usuário. Após, crie um menu de opções para o usuário aumentar ou diminuir a velocidade do carro ou sair do programa. A cada alteração da velocidade, exiba a velocidade atual do carro.

e) Todos os atributos devem ser privados