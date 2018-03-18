# Exercício 09 - Detetive
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

* "Telefonou para a vítima?"
* "Esteve no local do crime?"
* "Mora perto da vítima?"
* "Devia para a vítima?"
* "Já trabalhou com a vítima?" 

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

Exemplo 1:
```
Telefonou para a vítima?
Sim
Esteve no local do crime?
Sim
Mora perto da vítima?
Sim
Devia para a vítima?
Sim
Já trabalhou com a vítima? 
Sim

Assassino
```

Exemplo 2:
```
Telefonou para a vítima?
Nao
Esteve no local do crime?
Nao
Mora perto da vítima?
Sim
Devia para a vítima?
Sim
Já trabalhou com a vítima? 
Sim

Cumplice
```
