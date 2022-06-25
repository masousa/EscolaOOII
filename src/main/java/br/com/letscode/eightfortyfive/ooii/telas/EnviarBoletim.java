package br.com.letscode.eightfortyfive.ooii.telas;

import br.com.letscode.eightfortyfive.ooii.dominio.Aluno;
import br.com.letscode.eightfortyfive.ooii.servicos.envio.FormaEnvioEnum;
import br.com.letscode.eightfortyfive.ooii.servicos.envio.FormaEnvioFactory;
import br.com.letscode.eightfortyfive.ooii.utils.GetFromIndex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EnviarBoletim {
    public static void enviar(String texto, Aluno aluno) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione a forma de envio");
        List<FormaEnvioEnum> formasEnvio = Arrays.asList(FormaEnvioEnum.values());
        for (FormaEnvioEnum formaEnvioEnum : formasEnvio) {
            System.out.printf("%s %n", formaEnvioEnum.getLabel());
        }
        FormaEnvioFactory.getInstance(GetFromIndex.fromList(formasEnvio, scanner.nextInt()))
                .enviar(texto, aluno);

    }
}
