package controller;

public class MetodosMenor {

    public int menor(int vt[], int i, int menornum) {
        if (i < 0) { // Condição de parada: quando `i` for menor que zero, retorna `menornum`
            return menornum;
        }

        if (vt[i] < menornum) { // Atualiza `menornum` se encontrar um valor menor
            menornum = vt[i];
        }

        return menor(vt, i - 1, menornum); // Chamada recursiva reduzindo `i`
    }
}