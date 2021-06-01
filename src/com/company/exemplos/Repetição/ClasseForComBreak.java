package com.company.exemplos.Repetição;

public class ClasseForComBreak {
    public static void main(String[] args) {
        for (int numero = 10; numero >= 0; numero --){
            if(numero ==7)
            {
                System.out.printf("Oba,encontrei o numero 7");
                System.out.printf("Estou parando de executar");
                break;
            }
        }
    }
}
