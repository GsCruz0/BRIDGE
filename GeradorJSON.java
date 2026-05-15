package implementation;

public class GeradorJSON implements GeradorArquivo {
    @Override
    public void escrever(String conteudo) {
        System.out.println("{");
        System.out.println("\"conteudo\": \"" + conteudo + "\"");
        System.out.println("}");
    }
}
