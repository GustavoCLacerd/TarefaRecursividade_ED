package controller;

public class MetodosSoma {

    public double somatoria (double n){
       if (n < 0){ // Condição de parada: a recursão para quando n for menor que zero
        return 0;
       }
       return n + somatoria (n - 1); // Relação de chamada dos passos: a função soma n e chama a si mesma com (n - 1)
    }
}