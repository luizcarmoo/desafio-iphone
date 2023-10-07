import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Menu Inicial:");
            System.out.println("1. Reproduzir Música");
            System.out.println("2. Navegar na Internet");
            System.out.println("3. Fazer Chamada Telefônica");
            System.out.println("4. Sair do Dispositivo");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    MusicPlayer musicPlayer = new MusicPlayer();
                    musicPlayer.reproduzirMusica();
                    break;
                case 2:
                    NavegadorInternet navegador = new NavegadorInternet();
                    navegador.navegarInternet();
                    break;
                case 3:
                    LigacaoTelefonica ligacao = new LigacaoTelefonica();
                    ligacao.fazerChamada();
                    System.out.println("Pressione 1 para finalizar a chamada ou 2 para iniciar o correio de voz:");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        ligacao.finalizarChamada();
                    } else if (opcao == 2) {
                        ligacao.iniciarCorreioDeVoz();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do dispositivo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 4);
    }
}
class MusicPlayer {
    public void reproduzirMusica() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Reproduzindo música...");
            System.out.println("1. Avançar");
            System.out.println("2. Voltar");
            System.out.println("3. Tocar");
            System.out.println("4. Pausar");
            System.out.println("5. Selecionar");
            System.out.println("6. Sair para o menu inicial");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Avançando para a próxima música.");
                    break;
                case 2:
                    System.out.println("Voltando para a música anterior.");
                    break;
                case 3:
                    System.out.println("Tocando a música.");
                    break;
                case 4:
                    System.out.println("Pausando a música.");
                    break;
                case 5:
                    System.out.println("Selecionando uma nova música.");
                    break;
                case 6:
                    System.out.println("Saindo para o menu inicial.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 6);
    }
}

class NavegadorInternet {
    public void navegarInternet() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Navegando na Internet...");
            System.out.println("1. Ir para URL");
            System.out.println("2. Avançar");
            System.out.println("3. Retroceder");
            System.out.println("4. Nova Aba");
            System.out.println("5. Sair para o menu inicial");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Indique a URL para a qual deseja ir:");
                    String url = scanner.next();
                    System.out.println("Navegando para " + url);
                    break;
                case 2:
                    System.out.println("Avançando para a próxima página.");
                    break;
                case 3:
                    System.out.println("Retrocedendo para a página anterior.");
                    break;
                case 4:
                    System.out.println("Abrindo uma nova aba.");
                    break;
                case 5:
                    System.out.println("Saindo para o menu inicial.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 5);
    }
}

class LigacaoTelefonica {
    public void fazerChamada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de telefone para fazer a chamada:");
        String numeroTelefone = scanner.next();
        System.out.println("Fazendo chamada para " + numeroTelefone);
    }

    public void finalizarChamada() {
        System.out.println("Chamada finalizada.");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}

