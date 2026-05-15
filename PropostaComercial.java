package abstraction;

import implementation.GeradorArquivo;

public class PropostaComercial extends Documento {

    public PropostaComercial(GeradorArquivo gerador) {
        super(gerador);
    }

    @Override
    public void gerar() {
        String conteudo = "PROPOSTA COMERCIAL\nServiço: Desenvolvimento de Sistema\nValor: R$ 5000";
        gerador.escrever(conteudo);
    }
}
