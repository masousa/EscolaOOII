package br.com.letscode.eightfortyfive.ooii;

import br.com.letscode.eightfortyfive.ooii.dominio.Turma;
import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaAcesso;
import br.com.letscode.eightfortyfive.ooii.telas.OpcaoTela;
import br.com.letscode.eightfortyfive.ooii.telas.OpcaoTelaEnum;
import br.com.letscode.eightfortyfive.ooii.telas.OpcaoTelaFactory;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        montarFakeTurmas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
        OpcaoTela opcaoTela = null;
        do {
            for (OpcaoTelaEnum opcao : OpcaoTelaEnum.values()) {
                System.out.printf("%d - %s %n", opcao.getId(), opcao.getLabel());
            }
            opcaoTela = OpcaoTelaFactory.getInstance(OpcaoTelaEnum.fromId(scanner.nextInt()));
            opcaoTela.execute();
        } while (opcaoTela != null);


    }

    private static void montarFakeTurmas() {
        Turma[] turmas = new Turma[]{new Turma("Sala 1", "1 Serie"),
                new Turma("Sala 2", "1 Serie"), new Turma("Sala 3", "2 Serie")};

        for (Turma turma : turmas) {
            PersistenciaAcesso.getTurmasRepository().addElemento(turma);

        }
    }
}
