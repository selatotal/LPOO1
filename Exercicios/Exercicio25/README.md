# Exercicio 25 - Fruteira

Utilizando uma classe Fruta, a qual possui os atributos gramas e caloriasPorGrama, crie uma classe chamada Fruteira. Esta classe deve ter como atributo apenas um vetor de Fruta.

Quando a classe Fruteira for instanciada, deve ser informado a quantidade (inteira) de Frutas que a Fruteira pode conter.
A classe fruteira deverá ter os seguintes métodos:
* public void adiciona(Fruta fruta)
** Adiciona uma Fruta na Fruteira
** Não é possível adicionar a mesma Fruta na Fruteira
** Não é possível adicionar uma fruta além da capacidade da Fruteira

* public void remove(Fruta)
** Remove uma Fruta da Fruteira
** Não posso remover uma Fruta que não está na Fruteira

public void listaFrutas()
** Lista as Frutas que estão na Fruteira no momento.
** Pode ser chamado a qualquer momento após a criação da Fruteira

Crie uma classe com um método main para testar o código de vocês. Esta classe deve instanciar Frutas, Fruteira, adicionar e remover Frutas e listar as Frutas da Fruteira após cada operação.