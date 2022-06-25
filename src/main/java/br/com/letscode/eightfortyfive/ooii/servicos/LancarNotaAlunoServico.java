package br.com.letscode.eightfortyfive.ooii.servicos;


import br.com.letscode.eightfortyfive.ooii.dominio.Nota;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;

import java.util.Objects;

public class LancarNotaAlunoServico {
    private BuscarNotaServico buscarNotaServico;

    public LancarNotaAlunoServico() {
        buscarNotaServico = new BuscarNotaServico();
    }

    public Nota executar(Nota nota) {
        nota.setTurma(nota.getAluno().getTurma());
        Nota notaPersistida = buscarNotaServico.execute(nota);

        if (Objects.nonNull(notaPersistida)) {
            notaPersistida.setNota(nota.getNota());
            nota = notaPersistida;
        } else {
            PersistenciaAcesso.getNotaRepository().addElemento(nota);
        }

        return nota;
    }
}
