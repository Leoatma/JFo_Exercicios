public class Cartao {
    private int saldoAtual;
    private int saldoTickets;
    private final int numCartao;
    private static int contagemCartao;

    public Cartao() {
        contagemCartao++;
        this.numCartao = contagemCartao;
        System.out.printf("Cartão nº%d criado com %d de saldo. \n", this.numCartao, this.saldoAtual);
    }

    public Cartao(int saldoAtual, int saldoTickets) {
        contagemCartao++;
        this.numCartao = contagemCartao;
        this.saldoAtual = saldoAtual;
        this.saldoTickets = saldoTickets;
        System.out.printf("Cartão nº%d criado com %d de saldo. \n", this.numCartao, this.saldoAtual);
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }

    public int getNumCartao() {
        return numCartao;
    }

}