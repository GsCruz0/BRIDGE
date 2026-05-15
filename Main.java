package concrete;

import abstraction.*;
import implementation.*;

public class Main {

    public static void main(String[] args) {

        Documento relatorio = new RelatorioGerencial(new GeradorPDF());
        Documento proposta = new PropostaComercial(new GeradorHTML());
        Documento nota = new NotaFiscal(new GeradorJSON());
        Documento contrato = new ContratoSimplificado(new GeradorTXT());

        relatorio.gerar();
        proposta.gerar();
        nota.gerar();
        contrato.gerar();
    }
}
