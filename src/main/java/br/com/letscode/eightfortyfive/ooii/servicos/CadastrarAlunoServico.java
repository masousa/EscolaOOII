package br.com.letscode.eightfortyfive.ooii.servicos;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;
import br.com.letscode.eightfortyfive.ooii.utils.IdentifierGeneratorUtil;

import java.time.LocalDate;


public class CadastrarAlunoServico {
    public void execute(Aluno aluno) {
        String matricula = String
                .format("%04dA%04d", LocalDate.now().getYear(),
                        IdentifierGeneratorUtil.generate(PersistenciaAcesso.getAlunoRepository()));
        aluno.setMatricula(matricula);
        PersistenciaAcesso.getAlunoRepository().addElemento(aluno);

    }
}
