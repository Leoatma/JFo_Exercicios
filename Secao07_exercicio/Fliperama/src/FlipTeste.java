
public class FlipTeste {
    public static void main(String[] args) {

        Cartao cartao1 = new Cartao(4000, 150);
        Cartao cartao2 = new Cartao(0, 0);
        Cartao cartao3 = new Cartao(1000, 500);

        Terminal.verificarSaldoCartao(cartao3);
        Terminal.verificarSaldoCartao(cartao2);

        Terminal.transferirCreditos(3000, 100, cartao1, cartao2);
        Terminal.comprarCreditosCartao(cartao3, 1100);
        Terminal.transferirCreditos(4000, 400, cartao3, cartao2);

        Jogo pinball = new Jogo(300);
        Jogo daytona = new Jogo(1500);
        Jogo dungeonsAndDragons = new Jogo(700);

        Premio ursinho = new Premio("Ursinho de Pelúcia", 400, 7);
        Premio bolaFutebol = new Premio("Bola de Futebol", 1000, 1);
        Premio boneca = new Premio("Boneca Pimentinha", 2000, 1);

        daytona.jogar(cartao2);
        pinball.jogar(cartao2);
        Terminal.trocarTickets(cartao2, bolaFutebol);
        Terminal.trocarTickets(cartao2, ursinho);

        dungeonsAndDragons.jogar(cartao1);
        dungeonsAndDragons.jogar(cartao1);
        Terminal.trocarTickets(cartao1, bolaFutebol);
        Terminal.trocarTickets(cartao1, boneca);

    }

}
