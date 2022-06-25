package br.com.letscode.eightfortyfive.ooii.excecoes;

public class ItemNaoEncontradoException extends RuntimeException {
    public ItemNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
