public class Terminal {

    public static void comprarCreditosCartao(Cartao cartao, int valorCompra) {
        cartao.setSaldoAtual(cartao.getSaldoAtual() + (valorCompra * 2));
        System.out.println("-------- COMPRA DE CRÉDITO REALIZADA ---------\n");
        System.out.printf("Cartão nº%d, Saldo = %d créditos. %n%n", cartao.getNumCartao(), cartao.getSaldoAtual());
        System.out.println("------ FIM DA OPERAÇÂO ---------\n");
    }

    public static void verificarSaldoCartao(Cartao cartao) {
        System.out.println("----- SALDO -----\n");
        System.out.printf("Cartão nº%d, Saldo atual = %d créditos. \n\n", cartao.getNumCartao(), cartao.getSaldoAtual());
        System.out.println("------ FIM DA OPERAÇÃO ---------\n");
    }

    public static void transferirCreditos(int creditosATransferir, int ticketsATransf, Cartao cartaoTransf, Cartao cartaoReceber) {
        System.out.println(" ------ TRANSFERÊNCIA ------\n");
        if ((creditosATransferir <= cartaoTransf.getSaldoAtual()) && (ticketsATransf <= cartaoTransf.getSaldoTickets())) {

            System.out.printf("Você está transferindo %d creditos de %d créditos disponíveis. \n", creditosATransferir, cartaoTransf.getSaldoAtual());
            cartaoTransf.setSaldoAtual(cartaoTransf.getSaldoAtual() - creditosATransferir);
            cartaoReceber.setSaldoAtual(cartaoReceber.getSaldoAtual() + creditosATransferir);

            System.out.printf("Você está transferindo %d tickets de %d disponíveis. \n\n", ticketsATransf, cartaoTransf.getSaldoTickets());
            cartaoTransf.setSaldoTickets(cartaoTransf.getSaldoTickets() - ticketsATransf);
            cartaoReceber.setSaldoTickets(cartaoReceber.getSaldoTickets() + ticketsATransf);

            System.out.printf("Cartão nº%d, Saldo = %d créditos. Restam: %d tickets \n", cartaoTransf.getNumCartao(), cartaoTransf.getSaldoAtual(), cartaoTransf.getSaldoTickets());
            System.out.printf("Cartão nº%d, Saldo = %d tickets. Tickets: %d unidades \n\n", cartaoReceber.getNumCartao(), cartaoReceber.getSaldoAtual(), cartaoReceber.getSaldoTickets());
        } else {
            System.out.printf("Não há créditos ou tickets suficientes(Créditos a transferir = %d, Créditos disponíveis = %d \nTickets a transferir = %d, Tickets disponíveis = %d)%n%n", creditosATransferir, cartaoTransf.getSaldoAtual(), ticketsATransf, cartaoTransf.getSaldoTickets());
        }
        System.out.println("---- FIM DA OPERAÇÂO ----- \n");
    }

    public static void trocarTickets(Cartao cartao, Premio premio) {
        System.out.println("----- TROCA DE PRÊMIOS ------\n");
        if ((premio.getValorEmTickets() <= cartao.getSaldoTickets()) && (premio.getQtdeEstoque() > 0)) {
            cartao.setSaldoTickets(cartao.getSaldoTickets() - premio.getValorEmTickets());
            premio.setQtdeEstoque(premio.getQtdeEstoque() - 1);
            System.out.printf("Parabéns pelo prêmio: '%s'! Quantidade em estoque restante = %d unidades.%n%n", premio.getNome(), premio.getQtdeEstoque());
        } else if (premio.getQtdeEstoque() == 0) {
            System.out.println("Não há quantidade em estoque para este prêmio.\n");
        } else {
            System.out.printf("Saldo de Tickets insuficiente. Valor Prêmio = %d tickets (Saldo Tickets: %d).\n\n", premio.getValorEmTickets(), cartao.getSaldoTickets());
        }
        System.out.println(" ----- FIM DA OPERAÇÂO -----\n");
    }
}

