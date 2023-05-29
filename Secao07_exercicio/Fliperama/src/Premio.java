public class Premio {
    private String nome;
    private int valorEmTickets;
    private int qtdeEstoque;

    public Premio() {
    }

    public Premio(String nome, int valorEmTickets, int qtdeEstoque) {
        this.nome = nome;
        this.valorEmTickets = valorEmTickets;
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorEmTickets() {
        return valorEmTickets;
    }

    public void setValorEmTickets(int valorEmTickets) {
        this.valorEmTickets = valorEmTickets;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
}
