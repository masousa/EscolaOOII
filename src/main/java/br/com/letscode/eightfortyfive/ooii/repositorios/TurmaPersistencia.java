package br.com.letscode.eightfortyfive.ooii.repositorios;

import br.com.letscode.eightfortyfive.ooii.dominio.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaPersistencia extends PersistenciaGenericaLista<Turma> {
    public List<Turma> consultarPorSerie(String nomeSerie) {
        List<Turma> turmas = new ArrayList<>();
        for (Turma turma : this.listarTodos()) {
            if (turma.getSerie().equals(nomeSerie)) {
                turmas.add(turma);
            }
        }
        return turmas;
    }
}
