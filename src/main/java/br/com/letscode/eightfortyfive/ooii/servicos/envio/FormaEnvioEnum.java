package br.com.letscode.eightfortyfive.ooii.servicos.envio;

public enum FormaEnvioEnum {
    EMAIL("Email"), CELULAR("Mensagem no celular (SMS)"), IMPRESSO("Impressão do boletim e entrega na reunião de pais e alunos");

    private String label;

    private FormaEnvioEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
