public class Carta {

    private String naipe;
    private String valor;
    private int valorInt;

    public Carta(String naipe, String valor, int valorInt) {
        this.naipe = naipe;
        this.valor = valor;
        this.valorInt = valorInt;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getValorInt() {
        return valorInt;
    }

    public void setValorInt(int valorInt) {
        this.valorInt = valorInt;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
