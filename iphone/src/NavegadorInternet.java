public class NavegadorInternet implements Iphone {

    @Override
    public void tocar() {
     
    }

    @Override
    public void pausar() {
         }

    @Override
    public void selecionarMusica(String musica) {
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
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

}
