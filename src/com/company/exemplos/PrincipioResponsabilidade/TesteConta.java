package com.company.exemplos.PrincipioResponsabilidade;

public class TesteConta {
    public static void main(String[] args) {

        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Conta bancaria do Alex");

        System.out.print(bancaria);
        bancaria.diminui100Reais();
        bancaria.diminui100Reais();
        System.out.print(bancaria);
    }
}
