# Desafio dos Números Mágicos

## Descrição 
Um número X é dito “mágico” quando a raiz quadrada de X existe e é um número primo. Escreva um programa que receba como entrada uma lista de intervalos [A,B] e retorne o somatório da quantidade de números mágicos encontrados em cada intervalo. É garantido que os números A e B serão inteiros positivos e que A será sempre menor ou igual que B. Por exemplo, para a entrada [[8, 27], [49, 49]] espera-se como resultado o número 3 (seriam os números 9 e 25 do primeiro intervalo, e 49 do segundo). 

## Tecnologias utilizadas
- Java 8
- JUnit 4
- Maven
- IntelliJ IDEA

## Solução
- Optei por desenvolver o desafio utilizando Java (versão 8), visto que é a linguagem a qual possuo mais familiaridade.
- Utilizei a classe Scanner do Java como método de entrada de dados, pois acredito que além de tornar o processo mais intuitivo para o usuário, evita entradas indesejadas, como letras e caracteres especiais.
- Os métodos `isMagic()`, `isIntegerAndPositive()` e `isPrime()` da classe `MagicNumbersCalculator` foram definidos como públicos para fins de realização dos testes, porém poderiam ser definidos como privados, visto que não são utilizados em nenhuma outra classe fora do seu escopo.
- A respeito do método para definir se um número é primo ou não, utilizei uma abordagem padrão, onde tem-se o número que se deseja avaliar, e é realizada uma iteração que se inicia no número 2, e é interrompida assim que é encontrado qualquer número que seja divisor do número avaliado (resto da divisão é 0). Entendo que podem existir outros métodos mais eficientes em termos de performance, portanto seria pertinente um estudo futuro a respeito da metodologia mais adequada.
