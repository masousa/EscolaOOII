package br.com.letscode.eightfortyfive.ooii.repositorios;

import br.com.letscode.eightfortyfive.ooii.excecoes.ItemNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class PersistenciaGenericaLista<T> {
    private List<T> lista;

    public PersistenciaGenericaLista() {
        this.lista = new ArrayList<>();
    }

    public void addElemento(T elemento) {
        lista.add(elemento);
    }

    public T encontrarPorIdentificador(T elemento) {
        if (lista.contains(elemento)) {
            for (T elementoDaLista : lista) {
                if (elementoDaLista.equals(elemento)) {
                    return elementoDaLista;
                }
            }
        }
        throw new ItemNaoEncontradoException("Não foi possível encontrar o item");
    }

    public void remover(T elemento) {
        lista.remove(elemento);
    }

    public List<T> listarTodos() {
        return lista;
    }

}
