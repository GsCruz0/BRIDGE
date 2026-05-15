package implementation;

public class GeradorTXT implements GeradorArquivo {
    @Override
    public void escrever(String conteudo) {
        System.out.println("TXT:");
        System.out.println(conteudo);
    }
}
