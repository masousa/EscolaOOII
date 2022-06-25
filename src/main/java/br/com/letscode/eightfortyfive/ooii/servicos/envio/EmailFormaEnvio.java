package br.com.letscode.eightfortyfive.ooii.servicos.envio;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;

public class EmailFormaEnvio implements FormaEnvio {
    @Override
    public void enviar(String texto, Aluno aluno) {
        System.out.printf("Mensagem enviada por email com o conteúdo %s %n para %s %n", texto, aluno.getResponsaveis().getEmail());
    }
}
