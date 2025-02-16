package controller;

public class MetodosFatorial {

    public int fatorial (int n) {
        // Condição de parada: a recursão para quando n for 0 ou menor
        if (n > 0) { 
            // Relação de chamada dos passos: a função multiplica n pelo fatorial de (n - 1)
            return n * fatorial(n - 1);
        } else {
            return 1; // O fatorial de 0 é 1, garantindo o caso base
        } 
    }
}