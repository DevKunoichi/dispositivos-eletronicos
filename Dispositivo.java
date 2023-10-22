public class Dispositivo {
    public void reprodutorMusical() {
        System.out.println("Iniciando Reprodutor Musical...");
        System.out.println("Tocando música...");
        System.out.println("Pausando música...");
        System.out.println("Selecionando música...");
        System.out.println("Encerrando Reprodutor Musical...\n");
    }

    public void aparelhoTelefonico() {
        System.out.println("Iniciando Aparelho Telefônico...");
        System.out.println("Ligando...");
        System.out.println("Atendendo chamada...");
        System.out.println("Iniciando correio de voz...");
        System.out.println("Encerrando Aparelho Telefônico...\n");
    }

    public void navegadorInternet() {
        System.out.println("Iniciando Navegador de Internet...");
        System.out.println("Exibindo página...");
        System.out.println("Adicionando nova aba...");
        System.out.println("Atualizando página...");
        System.out.println("Encerrando Navegador de Internet...\n");
    }

    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.reprodutorMusical();
        dispositivo.aparelhoTelefonico();
        dispositivo.navegadorInternet();
    }
}
