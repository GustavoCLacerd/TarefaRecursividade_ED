package view;

import javax.swing.JOptionPane;
import controller.MetodosMenor;

public class Main {
    public static void main(String[] args) {
        int vt[] = new int[5], i;

        for (i = 0; i < 5; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor na posição " + i + ": "));
        }

        MetodosMenor metodos = new MetodosMenor();
        System.out.println("Menor número: " + metodos.menor(vt, 4, vt[4])); // Inicia com o último elemento
    }
}