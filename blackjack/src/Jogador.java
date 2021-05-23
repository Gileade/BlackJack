import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private String nome;
    private List<Carta> cartas = new ArrayList<>();

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarta(Carta carta) {
        cartas.add(carta);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", cartas=" + cartas +
                '}';
    }

    public int getValorDasCartas() {
        int soma = cartas.stream().mapToInt(Carta::getValorInt).sum();
        return soma;
    }

}
