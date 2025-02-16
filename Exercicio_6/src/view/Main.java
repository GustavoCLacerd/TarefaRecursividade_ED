package view;

import javax.swing.JOptionPane;
import controller.MetodosSoma;

public class Main {
    public static void main(String[] args) {
        int a, b;

        // Entrada dos dois números naturais
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        MetodosSoma metodos = new MetodosSoma();

        // Chamada da função recursiva e exibição do resultado
        System.out.println("A soma de " + a + " e " + b + " é: " + metodos.soma(a, b));
    }
}