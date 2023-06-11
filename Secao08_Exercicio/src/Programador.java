import java.util.Scanner;

public class Programador {

    private static Equipe[] ligaEquipes = new Equipe[4];

    public static Equipe getLigaEquipes(int equipeId) {
        return ligaEquipes[equipeId];
    }

    public static void addEquipesLiga(Scanner scanner) {

        for (int i = 0; i < ligaEquipes.length; i++) {
            System.out.printf("Digite o nome da Equipe 0%d: %n", i + 1);
            ligaEquipes[i] = new Equipe(scanner.nextLine());
        }
    }

    public static void imprimirEstatisticas() {

        double temperaturaMax = 0.0;
        double totalTemperatura = 0.0;

        System.out.println(" ----- RESULTADOS DA TEMPORADA -----\n");

        for (Equipe equipe : ligaEquipes) {
            System.out.println("Equipe: " + equipe.getNome() + "\n"
                    + "Vitórias = " + equipe.getVitorias()
                    + ", Empates = " + equipe.getEmpates()
                    + ", Derrotas = " + equipe.getDerrotas()
                    + ", Gols marcados = " + equipe.getGolsMarcados()
                    + ", Gols sofridos = " + equipe.getGolsSofridos() + "\n"
            );
        }

        for (Jogo jogo : Jogo.getListaJogos()) {
            System.out.printf("Jogo #%d: \n", jogo.getJogoId());
            System.out.printf("Equipe %s: \n Gols Marcados: %d, Gols Sofridos: %d \n\n", jogo.getEquipe1().getNome(), jogo.getPlacarEquipe1(), jogo.getPlacarEquipe2());
            System.out.printf("Equipe %s: \n Gols Marcados: %d, Gols Sofridos: %d \n\n", jogo.getEquipe2().getNome(), jogo.getPlacarEquipe2(), jogo.getPlacarEquipe1());

            totalTemperatura += jogo.getTemperatura();

            if (jogo.getTemperatura() > temperaturaMax) {
                temperaturaMax = jogo.getTemperatura();
            }
        }

        double temperaturaMedia = totalTemperatura / Jogo.getListaJogos().size();
        System.out.printf("Temperatura Máxima = %.1f, Temperatura Média = %.1f %n%n", temperaturaMax, temperaturaMedia);
    }
}
