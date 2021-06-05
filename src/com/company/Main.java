package com.company;

import com.company.exemplos.Lista.Aluno;
import com.company.exemplos.Lista.Disciplina;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setName("Murilo Eduardo");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("POO");
        disciplina1.setNota(90);

        aluno.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Banco de dados");
        disciplina2.setNota(80);

        


    }
}
