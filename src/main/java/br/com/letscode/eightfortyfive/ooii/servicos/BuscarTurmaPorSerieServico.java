package br.com.letscode.eightfortyfive.ooii.servicos;

import br.com.letscode.eightfortyfive.ooii.dominio.Turma;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;

import java.util.List;

public class BuscarTurmaPorSerieServico {
    public List<Turma> execute(String serie) {
        return PersistenciaAcesso.getTurmasRepository().consultarPorSerie(serie);
    }
}
