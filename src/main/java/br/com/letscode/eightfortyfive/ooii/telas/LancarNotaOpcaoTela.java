package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Bimestre;
import br.com.letscode.eightfortyfive.ooii.dominio.Disciplina;
import br.com.letscode.eightfortyfive.ooii.dominio.Nota;
import br.com.letscode.eightfortyfive.ooii.servicos.LancarNotaAlunoServico;
import br.com.letscode.eightfortyfive.ooii.servicos.ProcurarAlunoPorMatriculaServico;
import br.com.letscode.eightfortyfive.ooii.utils.GetFromIndex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LancarNotaOpcaoTela implements OpcaoTela {
    private ProcurarAlunoPorMatriculaServico procurarAlunoPorMatriculaServico;
    private LancarNotaAlunoServico lancarNotaAlunoServico;

    public LancarNotaOpcaoTela() {
        procurarAlunoPorMatriculaServico = new ProcurarAlunoPorMatriculaServico();
        lancarNotaAlunoServico = new LancarNotaAlunoServico();
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
        System.out.println("Informe o bimestre");
        List<Bimestre> bimestreList = Arrays.asList(Bimestre.values());
        for (Bimestre bimestre :
                bimestreList) {
            System.out.printf("%s; %n", bimestre.name());
        }
        Bimestre bimestre = GetFromIndex.fromList(bimestreList, scanner.nextInt());
        Nota nota = new Nota();
        nota.setAluno(aluno);
        nota.setBimestre(bimestre);
        nota.setDisciplina(disciplina);
        System.out.println("Informe a nota do aluno");
        nota.setNota(scanner.nextDouble());
        lancarNotaAlunoServico.executar(nota);
    }
}
