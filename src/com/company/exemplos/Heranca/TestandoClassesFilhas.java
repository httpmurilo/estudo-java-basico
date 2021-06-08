package com.company.exemplos.Heranca;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        AlunoHeranca aluno = new AlunoHeranca();
        aluno.setNome("Murilo Eduardo");

        DiretorHeranca diretorHeranca = new DiretorHeranca();
        diretorHeranca.setRegistroEducacao("1");

        SecretarioHeranca secretarioHeranca = new SecretarioHeranca();
        secretarioHeranca.setExperiencia("Administração");


    }
}
