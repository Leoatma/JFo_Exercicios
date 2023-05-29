import java.util.Random;

public class Jogo {
    private int creditosParaJogar;

    private int ticketsGanho;

    public Jogo() {
    }

    public Jogo(int creditosParaJogar) {
        this.creditosParaJogar = creditosParaJogar;
    }

    public int getCreditosParaJogar() {
        return creditosParaJogar;
    }


    public void jogar(Cartao cartao) {
        if (cartao.getSaldoAtual() < this.getCreditosParaJogar()) {
            System.out.printf("Créditos insuficientes para jogar. Crédito atual = %d / Crédito para jogar = %d. %n", cartao.getSaldoAtual(), this.getCreditosParaJogar());
        } else {
            cartao.setSaldoAtual(cartao.getSaldoAtual() - this.getCreditosParaJogar());
            Random rdn = new Random();
            ticketsGanho = rdn.nextInt(100, 1001);
            cartao.setSaldoTickets(cartao.getSaldoTickets() + ticketsGanho);
            System.out.printf("Você jogou e ganhou %d tickets! \nCartão nº%d, Saldo de Tickets = %d \n", ticketsGanho, cartao.getNumCartao(), cartao.getSaldoTickets());
        }
    }

}
