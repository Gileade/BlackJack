import java.util.Map;
import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        Dealer dealer = new Dealer(baralho);

        int opcaoInicio = 1;
        while (opcaoInicio != 0){
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Digite 0 para PARAR de inserir os jogadores");
            System.out.println("Digite 1 para inserir um novo jogador");
            opcaoInicio = scanner.nextInt();
            if (opcaoInicio == 0) break;

            dealer.insereJogador();
        }

        dealer.embaralha();

        for (int i=0; i < dealer.getJogadores().size(); i++){
            int opcaoJogador = 1;
            while (opcaoJogador != 0){
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println(dealer.getJogador(i).getNome() + " você quer receber uma nova carta?");
                System.out.println("Digite 0 para PARAR");
                System.out.println("Digite 1 para receber uma nova carta");
                opcaoJogador = scanner.nextInt();

                if (opcaoJogador == 0) break;

                Map<Integer, String> map = dealer.daCartaAoJogador(dealer.getJogador(i), dealer.getCarta());

                //Se for 1, é que ele estourou
                if (map.containsKey(1)) {
                    System.out.println(map.get(1));
                    break;
                }else {
                    System.out.println(map.get(0));
                }
            }
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Pontuação dos jogadores");
        dealer.getJogadores().forEach(jogador -> System.out.println(jogador.getNome()+ " Sua pontuação foi de : " + jogador.getValorDasCartas()));
    }
}
