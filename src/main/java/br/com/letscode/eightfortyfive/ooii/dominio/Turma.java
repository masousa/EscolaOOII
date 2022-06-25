package br.com.letscode.eightfortyfive.ooii.dominio;

import java.util.Objects;

public class Turma {
    private String sala;
    private String serie;

    public Turma(String sala, String serie) {
        this.sala = sala;
        this.serie = serie;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return sala.equals(turma.sala) && serie.equals(turma.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sala, serie);
    }
}
