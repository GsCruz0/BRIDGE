package abstraction;

import implementation.GeradorArquivo;

public class ContratoSimplificado extends Documento {

    public ContratoSimplificado(GeradorArquivo gerador) {
        super(gerador);
    }

    @Override
    public void gerar() {
        String conteudo = "CONTRATO\nPartes: Empresa X e Cliente Y\nCláusula: prestação de serviço\nAssinatura: __________";
        gerador.escrever(conteudo);
    }
}
