package br.com.letscode.eightfortyfive.ooii.dominio;

public enum Disciplina {
    HISTORIA("História"),
    GEOGRAFIA("Geográfia"),
    PORTUGUES("Português"),
    MATEMATICA("Matemática"),
    BIOLOGIA("Biologia"),
    QUIMICA("Química"),
    FISICA("Física");
    private String label;

    private Disciplina(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
