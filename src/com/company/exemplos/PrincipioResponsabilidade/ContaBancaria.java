package com.company.exemplos.PrincipioResponsabilidade;

public class ContaBancaria {

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;
    private double saldo = 8000;

    public void soma100Reais(){
        saldo += 100;
    }

    public void diminui100Reais(){
        saldo -= 100;
    }

    public void sacarDinheiro(double saque){
        saldo -= saque;
    }

    public  void depositoDinheiro(double deposito){
       saldo += deposito;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
