package view;

import javax.swing.JOptionPane;
import controller.MetodosFatorial;

public class Main {
    public static void main(String[] args) {
        int n = 13;

        // Condição de entrada: garante que o usuário insira um número menor que 13
        while (n > 12){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (obrigatoriamente menor que 13): "));
        }

        MetodosFatorial metodos = new MetodosFatorial();
        
        // Chama o método recursivo para calcular o fatorial e exibe o resultado
        System.out.println("O fatorial de " + n + " é " + metodos.fatorial(n));
    }
}