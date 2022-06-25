package br.com.letscode.eightfortyfive.ooii.repositorios;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;

import java.util.Objects;

public class PersistenciaAcesso {
    private static TurmaPersistencia turmasRepository;

    private static PersistenciaGenericaLista<Aluno> alunoRepository;

    private static NotaPersistencia notaRepository;


    public static TurmaPersistencia getTurmasRepository() {
        if (Objects.isNull(turmasRepository)) {
            turmasRepository = new TurmaPersistencia();
        }
        return turmasRepository;
    }

    public static PersistenciaGenericaLista<Aluno> getAlunoRepository() {
        if (Objects.isNull(alunoRepository)) {
            alunoRepository = new PersistenciaGenericaLista<Aluno>();
        }
        return alunoRepository;
    }

    public static NotaPersistencia getNotaRepository() {
        if (Objects.isNull(notaRepository)) {
            notaRepository = new NotaPersistencia();
        }
        return notaRepository;
    }
}
