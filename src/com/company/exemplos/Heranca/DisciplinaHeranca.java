package com.company.exemplos.Heranca;

public class DisciplinaHeranca {
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    private double nota;
    private String disciplina;
}
