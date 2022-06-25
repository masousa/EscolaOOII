package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Bimestre;

public class ExibeCabecalho {
    public static String exibir() {
        return String.format("Disciplina \t %s", imprimeBimestres());
    }

    private static String imprimeBimestres() {
        StringBuilder builder = new StringBuilder();
        for (Bimestre bimestre : Bimestre.values()) {
            builder.append(String.format("%s \t", bimestre.name()));
        }
        return builder.toString();
    }
}
