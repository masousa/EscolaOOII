package br.com.letscode.eightfortyfive.ooii.utils;

import br.com.letscode.eightfortyfive.ooii.repositorios.PersistenciaGenericaLista;

public class IdentifierGeneratorUtil {
    public static int generate(PersistenciaGenericaLista persistenciaGenericaLista) {
        return persistenciaGenericaLista.listarTodos().size() + 1;
    }
}
