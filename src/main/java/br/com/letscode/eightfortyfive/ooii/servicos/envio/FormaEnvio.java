package br.com.letscode.eightfortyfive.ooii.servicos.envio;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;

public interface FormaEnvio {
    public void enviar(String texto, Aluno aluno);
}
