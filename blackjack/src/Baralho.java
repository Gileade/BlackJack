import java.util.ArrayList;
import java.util.List;

public class Baralho {

    private List<Carta> baralho = new ArrayList<>();

    public Baralho(){
        baralho.add(new Carta("Ouros", "A", 1));
        baralho.add(new Carta("Ouros", "2", 2));
        baralho.add(new Carta("Ouros", "3", 3));
        baralho.add(new Carta("Ouros", "4", 4));
        baralho.add(new Carta("Ouros", "5", 5));
        baralho.add(new Carta("Ouros", "6", 6));
        baralho.add(new Carta("Ouros", "7", 7));
        baralho.add(new Carta("Ouros", "8", 8));
        baralho.add(new Carta("Ouros", "9", 9));
        baralho.add(new Carta("Ouros", "10", 10));
        baralho.add(new Carta("Ouros", "J", 10));
        baralho.add(new Carta("Ouros", "Q", 10));
        baralho.add(new Carta("Ouros", "K", 10));

        baralho.add(new Carta("Espadas", "A", 1));
        baralho.add(new Carta("Espadas", "2", 2));
        baralho.add(new Carta("Espadas", "3", 3));
        baralho.add(new Carta("Espadas", "4", 4));
        baralho.add(new Carta("Espadas", "5", 5));
        baralho.add(new Carta("Espadas", "6", 6));
        baralho.add(new Carta("Espadas", "7", 7));
        baralho.add(new Carta("Espadas", "8", 8));
        baralho.add(new Carta("Espadas", "9", 9));
        baralho.add(new Carta("Espadas", "10", 10));
        baralho.add(new Carta("Espadas", "J", 10));
        baralho.add(new Carta("Espadas", "Q", 10));
        baralho.add(new Carta("Espadas", "K", 10));

        baralho.add(new Carta("Copas", "A", 1));
        baralho.add(new Carta("Copas", "2", 2));
        baralho.add(new Carta("Copas", "3", 3));
        baralho.add(new Carta("Copas", "4", 4));
        baralho.add(new Carta("Copas", "5", 5));
        baralho.add(new Carta("Copas", "6", 6));
        baralho.add(new Carta("Copas", "7", 7));
        baralho.add(new Carta("Copas", "8", 8));
        baralho.add(new Carta("Copas", "9", 9));
        baralho.add(new Carta("Copas", "10", 10));
        baralho.add(new Carta("Copas", "J", 10));
        baralho.add(new Carta("Copas", "Q", 10));
        baralho.add(new Carta("Copas", "K", 10));

        baralho.add(new Carta("Paus", "A", 1));
        baralho.add(new Carta("Paus", "2", 2));
        baralho.add(new Carta("Paus", "3", 3));
        baralho.add(new Carta("Paus", "4", 4));
        baralho.add(new Carta("Paus", "5", 5));
        baralho.add(new Carta("Paus", "6", 6));
        baralho.add(new Carta("Paus", "7", 7));
        baralho.add(new Carta("Paus", "8", 8));
        baralho.add(new Carta("Paus", "9", 9));
        baralho.add(new Carta("Paus", "10", 10));
        baralho.add(new Carta("Paus", "J", 10));
        baralho.add(new Carta("Paus", "Q", 10));
        baralho.add(new Carta("Paus", "K", 10));

        this.baralho = baralho;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public Carta getCarta(){
        Carta carta = baralho.get(0);
        baralho.remove(0);
        return carta;
    }
}
