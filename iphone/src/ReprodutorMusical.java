public class ReprodutorMusical implements Iphone {

    @Override
    public void tocar() {
       System.out.println("Parando a música");
    }
    @Override
    public void pausar() {
       System.out.println("Reproduzindo a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        
    }

    @Override
    public void atender() {
       
    }

    @Override
    public void iniciarCorreioVoz() {
       
    }

    @Override
    public void exibirPagina(String url) {
       
    }

    @Override
    public void adicionarNovaAba() {
        
    }

    @Override
    public void atualizarPagina() {
        
    }

}
