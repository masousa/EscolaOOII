package br.com.letscode.eightfortyfive.ooii.servicos;

import br.com.letscode.eightfortyfive.ooii.dominio.Turma;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListarSeriesDasTurmas {

    public List<String> execute() {
        Set<String> setSeries = new HashSet<>();
        for (Turma turma : PersistenciaAcesso.getTurmasRepository().listarTodos()) {
            setSeries.add(turma.getSerie());
        }
        List<String> seriesList = new ArrayList<>(setSeries);
        Collections.sort(seriesList);
        return seriesList;
    }
}
