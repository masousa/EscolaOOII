package br.com.letscode.eightfortyfive.ooii.servicos.envio;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;

public class SMSFormaEnvio implements FormaEnvio {
    @Override
    public void enviar(String texto, Aluno aluno) {
        System.out.printf("Mensagem de texto %s%n enviada para o número %s %n", texto, aluno.getResponsaveis().getTelefone());
    }
}
