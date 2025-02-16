package view;

import javax.swing.JOptionPane;
import controller.MetodosSoma;

public class Main {
    public static void main(String[] args) {
        double n;

        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de n: "));
        MetodosSoma metodos = new MetodosSoma ();
        System.out.println (metodos.somatoria (n));

    }
}