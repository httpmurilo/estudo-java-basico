package com.company.exemplos.Lista;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private Integer Id;

    @Override
    public String toString() {
        return "Aluno{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }

    private String Name;

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public double getMediaNota(){
        return 0;
    }
}
