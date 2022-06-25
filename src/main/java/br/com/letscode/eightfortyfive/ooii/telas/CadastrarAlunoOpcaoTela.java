package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.dominio.Turma;
import br.com.letscode.eightfortyfive.ooii.servicos.BuscarTurmaPorSerieServico;
import br.com.letscode.eightfortyfive.ooii.servicos.CadastrarAlunoServico;
import br.com.letscode.eightfortyfive.ooii.servicos.ListarSeriesDasTurmas;
import br.com.letscode.eightfortyfive.ooii.utils.GetFromIndex;

import java.util.List;
import java.util.Scanner;

public class CadastrarAlunoOpcaoTela implements OpcaoTela {
    private BuscarTurmaPorSerieServico buscarTurmaPorSerieServico;
    private ListarSeriesDasTurmas listarSeriesDasTurmas;
    private CadastrarAlunoServico cadastrarAlunoServico;

    public CadastrarAlunoOpcaoTela() {
        listarSeriesDasTurmas = new ListarSeriesDasTurmas();
        buscarTurmaPorSerieServico = new BuscarTurmaPorSerieServico();
        cadastrarAlunoServico = new CadastrarAlunoServico();
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno");
        String nomeAluno = scanner.next();
        System.out.println("Idade");
        int idade = scanner.nextInt();
        System.out.println("Serie");
        final List<String> seriesList = listarSeriesDasTurmas.execute();
        for (String serie : seriesList) {
            System.out.println(serie);
        }
        String serie = seriesList.get((scanner.nextInt() - 1));

        System.out.println("Turma do aluno");
        List<Turma> turmas = buscarTurmaPorSerieServico.execute(serie);
        for (Turma turma : turmas) {
            System.out.printf("%s - %s %n", turma.getSerie(), turma.getSala());

        }
        Turma turma = GetFromIndex.fromList(turmas, scanner.nextInt());

        System.out.println("email");
        String email = scanner.next();
        System.out.println("Telefone");
        String telefone = scanner.next();
        Aluno aluno = new Aluno(nomeAluno, idade, serie, turma, email, telefone);
        cadastrarAlunoServico.execute(aluno);
        System.out.printf("Aluno salvo com matricula: %s %n", aluno.getMatricula());
    }
}
