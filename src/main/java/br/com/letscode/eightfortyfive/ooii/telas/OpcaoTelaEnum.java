package br.com.letscode.eightfortyfive.ooii.telas;

public enum OpcaoTelaEnum {


    CADASTRO("Cadastro de novos alunos", 1),
    LANCAMENTO_NOTAS("Lançamento de notas de uma disciplina", 2),
    EXIBICAO_NOTAS("Exibição das notas de uma determinada disciplina", 3),
    BOLETIM("Exibição do boletim escolar", 4);
    private String label;
    private int id;

    private OpcaoTelaEnum(String label, int id) {
        this.label = label;
        this.id = id;
    }

    public static OpcaoTelaEnum fromId(int id) {
        for (OpcaoTelaEnum opcao :
                OpcaoTelaEnum.values()) {
            if (opcao.getId() == id) {
                return opcao;
            }
        }
        throw new IllegalArgumentException("Opcao errada");
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }
}
