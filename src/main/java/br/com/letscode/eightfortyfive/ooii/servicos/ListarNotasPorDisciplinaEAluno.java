package br.com.letscode.eightfortyfive.ooii.servicos;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.dominio.Nota;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;

import java.util.List;

public class ListarNotasPorDisciplinaEAluno {
    public List<Nota> execute(Disciplina disciplina, Aluno aluno) {
        return PersistenciaAcesso.getNotaRepository().listarNotaPorDisciplinaEAluno(disciplina, aluno);
    }
}
