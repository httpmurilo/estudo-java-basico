package com.company.exemplos.array;

public class ArrayVetor {
    public static void main(String[] args) {

        /* array pode ser todos os tipos de dados e objetos*/
        double[] notas = new double[4];
        notas[0] = 9.8;
        notas[1] = 9.4;
        notas[2] = 4.0;
        notas[3] = 3.0;

        for (int pos = 0; pos <5 ; pos++){
            System.out.println("nota" + (pos + 1) + "e" + notas[pos]);
        }
    }
}
