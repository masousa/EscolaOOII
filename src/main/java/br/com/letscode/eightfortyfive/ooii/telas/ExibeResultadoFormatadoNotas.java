package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Bimestre;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.dominio.Nota;

import java.util.List;
import java.util.Objects;

public class ExibeResultadoFormatadoNotas {
    public static String execute(List<Nota> notas, Disciplina disciplina) {
        return String.format("%s \t %s ", disciplina.getLabel(), imprimeNotas(notas));
    }

    private static String imprimeNotas(List<Nota> notas) {
        var builder = new StringBuilder();
        for (Bimestre bimestre : Bimestre.values()) {
            var nota = containsNota(notas, bimestre);
            if (Objects.nonNull(nota)) {
                builder.append(String.format("%0,2f \t", nota.getNota()));
            } else {
                builder.append("NA \t");
            }


        }
        return builder.toString();
    }

    private static Nota containsNota(List<Nota> notas, Bimestre bimestre) {
        for (Nota nota : notas) {
            if (nota.getBimestre().equals(bimestre)) {
                return nota;
            }
        }
        return null;
    }
}
