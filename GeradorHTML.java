package implementation;

public class GeradorHTML implements GeradorArquivo {
    @Override
    public void escrever(String conteudo) {
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println(conteudo);
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
