package com.company.exemplos.Entrada;

import javax.swing.*;

public class EntradaDeDados {
    public static void main(String[] args) {

    String carros =  JOptionPane.showInputDialog("Informe a quantidade de carros");
    String pessoas =  JOptionPane.showInputDialog("Informe a quantidade de pessoas");

    double carroNumero = Double.parseDouble(carros);
    double pessoaNumero = Double.parseDouble(pessoas);

    int divisao = (int)(carroNumero / pessoaNumero);

    double resto = carroNumero % pessoaNumero;

        System.out.printf("Divisão para pessoas deu " + divisao + "carros e sobrou" + resto + carros
        );
    }
}
