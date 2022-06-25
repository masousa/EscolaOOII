package br.com.letscode.eightfortyfive.ooii.telas;

public class OpcaoTelaFactory {

    public static OpcaoTela getInstance(OpcaoTelaEnum opcaoTelaEnum) {
        switch (opcaoTelaEnum) {
            case CADASTRO:
                return new CadastrarAlunoOpcaoTela();
            case LANCAMENTO_NOTAS:
                return new LancarNotaOpcaoTela();
            case EXIBICAO_NOTAS:
                return new ExibicaoNotaOpcaoTela();
            case BOLETIM:
                return new ExibirBoletimOpcaoTela();

            default:
                throw new RuntimeException("Opcao ainda não desenvolvida");
        }
    }
}
