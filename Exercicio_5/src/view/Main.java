package view;

import javax.swing.JOptionPane;
import controller.MetodosDivisao;

public class Main {
    public static void main(String[] args) {
        int n;

        n = Integer.parseInt (JOptionPane.showInputDialog("Digite um número para definir o limtie das séries: "));

        MetodosDivisao metodos = new MetodosDivisao();
        
        System.out.println("O resultado da série é: " + metodos.serie (n));
    }
}