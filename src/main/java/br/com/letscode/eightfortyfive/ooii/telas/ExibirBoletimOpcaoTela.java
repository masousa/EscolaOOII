package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.servicos.ListarNotasPorDisciplinaEAluno;
import br.com.letscode.eightfortyfive.ooii.servicos.ProcurarAlunoPorMatriculaServico;

import java.util.Scanner;

public class ExibirBoletimOpcaoTela implements OpcaoTela {
    private ProcurarAlunoPorMatriculaServico procurarAlunoPorMatriculaServico;
    private ListarNotasPorDisciplinaEAluno listarNotasPorDisciplinaEAluno;

    public ExibirBoletimOpcaoTela() {
        procurarAlunoPorMatriculaServico = new ProcurarAlunoPorMatriculaServico();
        listarNotasPorDisciplinaEAluno = new ListarNotasPorDisciplinaEAluno();
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a matricula do aluno");
        Aluno aluno = procurarAlunoPorMatriculaServico.executar(scanner.next());
        StringBuilder builder = new StringBuilder();
        for (Disciplina disciplina : Disciplina.values()) {
            builder.append(String.format("%s %n",
                    ExibeResultadoFormatadoNotas
                            .execute(listarNotasPorDisciplinaEAluno.execute(disciplina, aluno), disciplina)));
        }
        String notas = builder.toString();
        System.out.println(ExibeCabecalho.exibir());
        System.out.println(notas);
        EnviarBoletim.enviar(notas, aluno);
    }
}
