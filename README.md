## 1. Somatório dos N primeiros números naturais

Implementação de uma função recursiva para calcular o somatório dos N primeiros números naturais. A função retorna zero para números negativos.

- **Condição de parada:** O somatório para N = 0 é zero.
- **Relação de chamada:** A soma de N é calculada como N + soma(N - 1).

## 2. Menor valor em um vetor

Implementação de uma função recursiva que recebe um vetor de inteiros e retorna o menor valor contido nele.

- **Condição de parada:** Quando o tamanho do vetor for 1.
- **Relação de chamada:** Compara o último elemento com o menor valor encontrado nos elementos anteriores.

## 3. Cálculo do fatorial

Implementação de uma função recursiva para calcular o fatorial de um número (limite de entrada recomendado: 12).

- **Condição de parada:** Quando N == 1, retorna 1.
- **Relação de chamada:** O fatorial de N é calculado como N * fatorial(N - 1).

## 4. Contagem de elementos negativos em um vetor

Função recursiva para contar quantos elementos negativos existem em um vetor de inteiros.

- **Condição de parada:** Quando o vetor tem tamanho 0.
- **Relação de chamada:** Verifica se o elemento é negativo e soma ao total de negativos encontrados nos elementos anteriores.

## 5. Somatória da série harmônica

Implementação de uma função recursiva para calcular a série harmônica até um número N.

- **Condição de parada:** Quando N == 1, retorna 1.
- **Relação de chamada:** A soma é calculada como 1.0 / N + soma(N - 1).

## 6. Soma de dois números sem operador de soma

Função recursiva para somar dois números naturais sem utilizar o operador de soma.

- **Condição de parada:** Quando um dos números for 0, retorna o outro.
- **Relação de chamada:** A soma é calculada adicionando 1 ao primeiro número e decrementando o segundo até que ele seja 0.
