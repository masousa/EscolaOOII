package br.com.letscode.eightfortyfive.ooii.servicos.envio;

public class FormaEnvioFactory {

    public static FormaEnvio getInstance(FormaEnvioEnum formaEnvioEnum) {
        switch (formaEnvioEnum) {
            case EMAIL:
                return new EmailFormaEnvio();
            case CELULAR:
                return new SMSFormaEnvio();
            case IMPRESSO:
                return new EntregaResponsavelFormaEnvio();
            default:
                throw new RuntimeException("Opção inválida");
        }
    }

}
