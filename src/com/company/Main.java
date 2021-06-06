package com.company;

import com.company.exemplos.Lista.Aluno;
import com.company.exemplos.Lista.Disciplina;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setName("Murilo Eduardo");

        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina "+pos+"");
            String notaDaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+"");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(notaDaDisciplina));

            aluno.getDisciplinas().add(disciplina);

        }
        System.out.print(Double.toString(aluno.getMediaNota()));
    }
}