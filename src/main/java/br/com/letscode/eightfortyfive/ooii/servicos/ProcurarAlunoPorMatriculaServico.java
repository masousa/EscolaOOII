package br.com.letscode.eightfortyfive.ooii.servicos;


import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;


public class ProcurarAlunoPorMatriculaServico {

    public Aluno executar(String matriculaAluno) {
        Aluno alunoBusca = new Aluno(matriculaAluno);

        return PersistenciaAcesso.getAlunoRepository().encontrarPorIdentificador(alunoBusca);


    }
}
