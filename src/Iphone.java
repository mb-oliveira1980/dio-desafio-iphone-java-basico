public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    // Navegador de Internet

    @Override
    public String exibirPagina(String url) {
        return "Exibindo página da internet. "+url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    // Aparelho Telefônico

    @Override
    public String ligar(String numero) {
        return "Ligando para o número: "+ numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    // Reprodutor Musical

    @Override
    public void tocar() {
        System.out.println("Tocando música escolhida");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "O nome da música é: " + musica;
    }


}
