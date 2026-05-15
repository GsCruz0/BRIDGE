package implementation;

public class GeradorPDF implements GeradorArquivo {
    @Override
    public void escrever(String conteudo) {
        System.out.println("===== PDF =====");
        System.out.println(conteudo);
        System.out.println("================");
    }
}
