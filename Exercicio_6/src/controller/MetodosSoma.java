package controller;

public class MetodosSoma {

    public int soma(int a, int b) {
        if (b == 0) { 
            return a; 
            // Condição de parada: quando b chega a zero, retornamos diretamente o valor de a,
            // pois somar zero a qualquer número resulta no próprio número.
        } else {
            return soma(a + 1, b - 1);
            // Relação de chamada dos passos: ao invés de usar a soma diretamente,
            // incrementamos 'a' em 1 e reduzimos 'b' em 1, até que b se torne 0.
        }
    }
}