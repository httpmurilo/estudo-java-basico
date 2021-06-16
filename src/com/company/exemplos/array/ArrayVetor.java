package com.company.exemplos.array;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {


        String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
        double[] notas = new double[Integer.parseInt(posicoes)];

        for(int pos =0; pos < notas.length; pos++) {
            String valor = JOptionPane.showInputDialog("qual o valor da posição" + pos);
            notas[pos] = Double.parseDouble(valor);
        }
            for (int pos = 0; pos < notas.length ; pos++){
            System.out.println("nota" + (pos + 1) + "e" + notas[pos]);
        }
    }
}
