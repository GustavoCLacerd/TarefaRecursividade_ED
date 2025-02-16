package controller;

public class MetodosDivisao {
    
    public double serie (int n) { 
        if (n == 1) { 
            return 1.0; // Condição de parada: quando n for igual a 1, a função retorna 1.0 e encerra a recursão.
        } else {
            return (double) 1 / n + serie(n - 1); 
            // Relação de chamada dos passos: a função soma 1/n ao resultado da chamada recursiva para (n - 1),
            // reduzindo o valor de n até atingir a condição de parada.
        }
    }
}