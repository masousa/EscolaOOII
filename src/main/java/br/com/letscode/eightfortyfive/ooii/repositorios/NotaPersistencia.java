package br.com.letscode.eightfortyfive.ooii.repositorios;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.dominio.Nota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotaPersistencia extends PersistenciaGenericaLista<Nota> {

    public List<Nota> listarNotaPorDisciplinaEAluno(Disciplina disciplina, Aluno aluno) {
        Set<Nota> notaSet = new HashSet<>();
        for (Nota nota : this.listarTodos()) {
            if (nota.getAluno().equals(aluno) && nota.getDisciplina().equals(disciplina)) {
                notaSet.add(nota);
            }
        }
        List<Nota> notaList = new ArrayList<>(notaSet);
        ordenarLista(notaList);

        return notaList;
    }

    private void ordenarLista(List<Nota> notaList) {
        Collections.sort(notaList, new Comparator<Nota>() {
            @Override
            public int compare(Nota o1, Nota o2) {
                if (o1.getBimestre().ordinal() > o2.getBimestre().ordinal()) {
                    return 1;
                } else if (o1.getBimestre().ordinal() < o2.getBimestre().ordinal()) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
