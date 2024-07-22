public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        System.out.println(iphone.selecionarMusica("Welcome to the jungle."));
        System.out.println();

        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println(iphone.ligar("99554466"));
        System.out.println();

        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        System.out.println(iphone.exibirPagina("https://web.dio.me"));
        
    }
}
