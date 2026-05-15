package abstraction;

import implementation.GeradorArquivo;

public class NotaFiscal extends Documento {

    public NotaFiscal(GeradorArquivo gerador) {
        super(gerador);
    }

    @Override
    public void gerar() {
        String conteudo = "NOTA FISCAL\nCliente: João Silva\nProduto: Notebook\nValor: R$ 3500";
        gerador.escrever(conteudo);
    }
}
