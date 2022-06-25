package br.com.letscode.eightfortyfive.ooii.servicos;

import br.com.letscode.eightfortyfive.ooii.dominio.Nota;
import br.com.letscode.eightfortyfive.ooii.excecoes.ItemNaoEncontradoException;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;

public class BuscarNotaServico {
    public Nota execute(Nota nota) {
        try {
            return PersistenciaAcesso.getNotaRepository().encontrarPorIdentificador(nota);
        } catch (ItemNaoEncontradoException itemNaoEncontradoException) {
            return null;
        }
    }
}
