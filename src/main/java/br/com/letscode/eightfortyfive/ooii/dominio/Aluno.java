package br.com.letscode.eightfortyfive.ooii.dominio;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;

    private Turma turma;

    private Responsaveis responsaveis;

    private String matricula;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String serie, Turma turma, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
        this.responsaveis = new Responsaveis();
        this.turma = turma;
        responsaveis.setEmail(email);
        responsaveis.setTelefone(telefone);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Responsaveis getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(Responsaveis responsaveis) {
        this.responsaveis = responsaveis;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
