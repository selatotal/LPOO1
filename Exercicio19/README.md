# Exercício 19 - Bomba de Combustível

Faça um programa que:

* Possua uma classe chamada BombaCombustível com, no mínimo, esses atributos:

	* tipoDeCombustivel (String).
	* valorPorLitro (double)
	* quantidadeDeCombustivel (double) - quantidade de combustível disponível na bomba para abastecimento

* Possua no mínimo esses métodos:

	* double abastecerPorValor(double) – método onde é informado o valor a ser abastecido e retorna a quantidade de litros que foi colocada no veículo
	* double abastecerPorLitro(double) – método onde é informada a quantidade em litros de combustível e retornado o valor a ser pago pelo cliente.
	* Metodos acessores

OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba. A bomba não pode ficar com combustível negativo e os métodos de abastecimento não podem abastecer caso seja informado um valor negativo como parâmetro.