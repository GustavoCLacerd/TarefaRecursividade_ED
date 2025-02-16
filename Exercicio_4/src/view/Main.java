package view;

import javax.swing.JOptionPane;
import controller.MetodosNegativo;

public class Main {
    public static void main(String[] args) {
        double vt[] = new double[5];  // Declaração do vetor de números
        int i;

        // Preenchimento do vetor com números digitados pelo usuário
        for (i = 0; i < 5; i++) {
            vt[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        }

        MetodosNegativo metodos = new MetodosNegativo();
        
        // A condição de parada ocorre quando o índice 'i' for menor que 0
        // Para o cálculo, o termo 'n' (quantidade de negativos) depende do valor do termo anterior,
        // que é o contador acumulado ao longo da recursão.
        System.out.println("Quantidade de números negativos é " + metodos.negativo(vt, 4, 0));
    }
}