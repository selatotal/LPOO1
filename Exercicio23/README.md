# Exercício 23 - Lâmpada

Crie uma classe chamada Lâmpada, com o atributo estado (ligado/desligado) e os métodos Ligar e Desligar e um método chamado mostraEstado() que mostra o estado da Lâmpada

Crie duas classes filhas desta classe, uma chamada LED e outra Fluorescente, com o método mostraEstado mostrando o estado da lâmpada LED ou Fluorescente.

Crie uma classe chamada FabricaLampadas, que possui um método chamado criaLampada(char tipo) que, se for passado o valor 'L' retorna uma nova lâmpada LED e, se for passado o valor 'F', retorna uma Lâmpada Fluorescente. Se outro valor for passado, deve retornar o valor nulo.

Crie uma classe de testes que perguntará ao usuário o tipo de Lâmpada a ser criado. Após, manda a fábrica criar a lâmpada LED ou Fluorescente, de acordo com o usuário, manda ligar, mostra o estado e manda desligar, mostrando o estado.