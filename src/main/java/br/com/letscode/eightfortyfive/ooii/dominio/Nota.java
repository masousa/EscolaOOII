package br.com.letscode.eightfortyfive.ooii.dominio;

import java.util.Objects;

public class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private Turma turma;
    private Bimestre bimestre;
    private double nota;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Bimestre getBimestre() {
        return bimestre;
    }

    public void setBimestre(Bimestre bimestre) {
        this.bimestre = bimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return aluno.equals(nota.aluno) && disciplina == nota.disciplina && turma.equals(nota.turma) && bimestre == nota.bimestre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno, disciplina, turma, bimestre);
    }
}
