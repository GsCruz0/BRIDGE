package abstraction;

import implementation.GeradorArquivo;

public class RelatorioGerencial extends Documento {

    public RelatorioGerencial(GeradorArquivo gerador) {
        super(gerador);
    }

    @Override
    public void gerar() {
        String conteudo = "RELATÓRIO GERENCIAL\nIndicadores: Lucro 20%\nResultados positivos\nObservações: crescimento contínuo";
        gerador.escrever(conteudo);
    }
}
