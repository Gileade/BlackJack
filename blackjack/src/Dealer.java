import java.util.*;

public class Dealer {

    private List<Jogador> jogadores = new ArrayList<>();
    private Baralho baralho;
    private Scanner scanner;

    public Dealer(Baralho baralho){
        this.baralho = baralho;
        this.scanner = new Scanner(System.in);
    }

    public List<Carta> embaralha() {
        Collections.shuffle(this.baralho.getBaralho());
        return baralho.getBaralho();
    }

    public int getQuantidadeDeJogadores() {
        return jogadores.size();
    }

    public void insereJogador() {
        System.out.println("Qual o nome do jogador ");
        String nomeDoJogador = scanner.nextLine();

        Jogador jogador = new Jogador(nomeDoJogador);
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public Jogador getJogador(int i) {
        return jogadores.get(i);
    }


    public Carta getCarta() {
        return baralho.getCarta();
    }

    public Map<Integer,String> daCartaAoJogador(Jogador jogador, Carta carta) {
        int estourou = 0;
        Map<Integer, String> mapa = new HashMap<Integer, String>();

        String stringDeRetorno = " Sua carta é: " + carta.toString();

        jogador.setCarta(carta);
        if (jogador.getValorDasCartas() > 21){
            stringDeRetorno = jogador.getNome() + stringDeRetorno + " e seu total é de " + jogador.getValorDasCartas() + " infelizmente você perdeu.";
            estourou = 1;
        }else {
            stringDeRetorno = jogador.getNome() + stringDeRetorno + " e seu total é de " + jogador.getValorDasCartas();
        }

        mapa.put(estourou,stringDeRetorno);

        return mapa;
    }
}
