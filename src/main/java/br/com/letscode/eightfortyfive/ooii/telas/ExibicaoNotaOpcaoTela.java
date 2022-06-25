package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.dominio.Nota;
import br.com.letscode.eightfortyfive.ooii.servicos.ListarNotasPorDisciplinaEAluno;
import br.com.letscode.eightfortyfive.ooii.servicos.ProcurarAlunoPorMatriculaServico;
import br.com.letscode.eightfortyfive.ooii.utils.GetFromIndex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExibicaoNotaOpcaoTela implements OpcaoTela {
    private ProcurarAlunoPorMatriculaServico procurarAlunoPorMatriculaServico;
    private ListarNotasPorDisciplinaEAluno listarNotasPorDisciplinaEAluno;

    public ExibicaoNotaOpcaoTela() {
        procurarAlunoPorMatriculaServico = new ProcurarAlunoPorMatriculaServico();
        listarNotasPorDisciplinaEAluno = new ListarNotasPorDisciplinaEAluno();
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a matricula do aluno");
        Aluno aluno = procurarAlunoPorMatriculaServico.executar(scanner.next());
        System.out.println("Informe a disciplina");
        List<Disciplina> disciplinaList = Arrays.asList(Disciplina.values());
        for (Disciplina disciplinas :
                disciplinaList) {
            System.out.printf("%s %n", disciplinas.getLabel());
        }
        Disciplina disciplina = GetFromIndex.fromList(disciplinaList, scanner.nextInt());
        List<Nota> notas = listarNotasPorDisciplinaEAluno.execute(disciplina, aluno);
        System.out.println(ExibeCabecalho.exibir());
        System.out.println(ExibeResultadoFormatadoNotas.execute(notas, disciplina));
    }
}
