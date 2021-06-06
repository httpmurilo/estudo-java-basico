package com.company.exemplos.Heranca;


import java.util.ArrayList;
import java.util.List;

public class AlunoHeranca extends Pessoa{

    public AlunoHeranca(){}

    public AlunoHeranca(String nomePadrao){
        nome = nomePadrao;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral(){
        return registroGeral;
    }
    public void setRegistroGeral(String registroGeral){
        this.registroGeral = registroGeral;
    }
    public AlunoHeranca(String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    public List<DisciplinaHeranca> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaHeranca> disciplinas) {
        this.disciplinas = disciplinas;
    }

    private List<DisciplinaHeranca> disciplinas = new ArrayList<DisciplinaHeranca>();

    public double getMediaNota(){
        double somaNotas = 0;
        for (DisciplinaHeranca disciplina : disciplinas){
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();
    }
}
