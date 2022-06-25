package br.com.letscode.eightfortyfive.ooii.servicos.envio;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;

public class EntregaResponsavelFormaEnvio implements FormaEnvio {
    @Override
    public void enviar(String texto, Aluno aluno) {
        System.out.printf("Boletim será entregue aos responsáveis do aluno %s %n", aluno.getNome());
    }
}
