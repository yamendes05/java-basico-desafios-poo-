public class desafio {
    public static void main(String[] args) throws Exception {
        // Criação de instâncias das classes
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        // Testando os métodos do AparelhoTelefonico
        aparelho.ligar("123456789");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        // Testando os métodos do NavegadorInternet
        navegador.exibirPagina("www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        // Testando os métodos do ReprodutorMusical
        reprodutor.selecionarMusica("Minha Música Favorita");
        reprodutor.tocar();
        reprodutor.pausar();
    }
}
