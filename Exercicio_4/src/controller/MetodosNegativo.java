package controller;

public class MetodosNegativo {

    public int negativo(double vt[], int i, int contador) {
        // Condição de parada: A recursão para quando o índice 'i' for menor que 0, indicando que todos os elementos foram verificados.
        if (i < 0) { 
            return contador;  // Retorna o contador com a quantidade de números negativos
        } else {
            
            // A função para o termo n em função do termo anterior: Se o número em vt[i] for negativo, incrementa o contador
            if (vt[i] < 0) { 
                contador++;  // Incrementa o contador se o número for negativo
            }
        }
        
        // Chamada recursiva: Para o próximo elemento do vetor, diminui o índice 'i' e passa o contador atualizado
        return negativo(vt, i - 1, contador); 
    }
}