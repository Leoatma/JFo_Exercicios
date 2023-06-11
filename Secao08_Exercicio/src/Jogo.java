import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    private double temperatura;
    private Equipe equipe1;
    private Equipe equipe2;

    private int placarEquipe1;
    private int placarEquipe2;

    private static ArrayList<Jogo> listaJogos = new ArrayList<>();
    private final int jogoId;
    private static int contagemJogos = 0;
    private static int contadorSemanaJogosCancelados = 3;
    private static int contadorTotalSemanasTemporada = 4;

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public int getPlacarEquipe1() {
        return placarEquipe1;
    }

    public void setPlacarEquipe1(int placarEquipe1) {
        this.placarEquipe1 = placarEquipe1;
    }

    public int getPlacarEquipe2() {
        return placarEquipe2;
    }

    public void setPlacarEquipe2(int placarEquipe2) {
        this.placarEquipe2 = placarEquipe2;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public static ArrayList<Jogo> getListaJogos() {
        return listaJogos;
    }

    public int getJogoId() {
        return jogoId;
    }

    public Jogo(double temperatura) {
        this.temperatura = temperatura;
        this.jogoId = ++contagemJogos;

        Random geradorAleatoriedade = new Random();

        int equipe1_Id = geradorAleatoriedade.nextInt(0, 3);

        switch (equipe1_Id) {
            case 0 -> this.equipe1 = Programador.getLigaEquipes(0);
            case 1 -> this.equipe1 = Programador.getLigaEquipes(1);
            case 2 -> this.equipe1 = Programador.getLigaEquipes(2);
            case 3 -> this.equipe1 = Programador.getLigaEquipes(3);
        }

        int equipe2_Id = geradorAleatoriedade.nextInt(0, 3);
        while (equipe1_Id == equipe2_Id) {
            equipe2_Id = geradorAleatoriedade.nextInt(0, 3);
        }

        switch (equipe2_Id) {
            case 0 -> this.equipe2 = Programador.getLigaEquipes(0);
            case 1 -> this.equipe2 = Programador.getLigaEquipes(1);
            case 2 -> this.equipe2 = Programador.getLigaEquipes(2);
            case 3 -> this.equipe2 = Programador.getLigaEquipes(3);
        }

        if (temperatura > 30) {
            this.placarEquipe1 = geradorAleatoriedade.nextInt(0, 9);
            this.placarEquipe2 = geradorAleatoriedade.nextInt(0, 9);

        } else {
            this.placarEquipe1 = geradorAleatoriedade.nextInt(0, 5);
            this.placarEquipe2 = geradorAleatoriedade.nextInt(0, 5);
        }


        if (this.placarEquipe1 > this.placarEquipe2) {
            this.equipe1.setVitorias(this.equipe1.getVitorias() + 1);
            this.equipe1.setGolsMarcados(this.equipe1.getGolsMarcados() + this.placarEquipe1);
            this.equipe1.setGolsSofridos(this.equipe1.getGolsSofridos() + this.placarEquipe2);

            this.equipe2.setDerrotas(this.equipe2.getDerrotas() + 1);
            this.equipe2.setGolsMarcados(this.equipe2.getGolsMarcados() + this.placarEquipe2);
            this.equipe2.setGolsSofridos(this.equipe2.getGolsSofridos() + this.placarEquipe1);

        } else if (this.placarEquipe2 > this.placarEquipe1) {

            this.equipe2.setVitorias(this.equipe2.getVitorias() + 1);
            this.equipe2.setGolsMarcados(this.equipe2.getGolsMarcados() + placarEquipe2);
            this.equipe2.setGolsSofridos(this.equipe2.getGolsSofridos() + placarEquipe1);

            this.equipe1.setDerrotas(this.equipe1.getDerrotas() + 1);
            this.equipe1.setGolsMarcados(this.equipe1.getGolsMarcados() + this.placarEquipe1);
            this.equipe1.setGolsSofridos(this.equipe1.getGolsSofridos() + this.placarEquipe2);

        } else {

            this.equipe1.setEmpates(this.equipe1.getEmpates() + 1);
            this.equipe1.setGolsMarcados(this.equipe1.getGolsMarcados() + this.placarEquipe1);
            this.equipe1.setGolsSofridos(this.equipe1.getGolsSofridos() + this.placarEquipe2);

            this.equipe2.setEmpates(this.equipe2.getEmpates() + 1);
            this.equipe2.setGolsMarcados(this.equipe2.getGolsMarcados() + this.placarEquipe2);
            this.equipe2.setGolsSofridos(this.equipe2.getGolsSofridos() + this.placarEquipe1);
        }

    }


    public static void addJogo(Scanner scanner) {

        int contadorSemana = 1;
        while (contadorSemanaJogosCancelados > 0 && contadorTotalSemanasTemporada > 0) {
            System.out.printf("\nQual a temperatura, em Celsius, durante a semana %d? \n", contadorSemana);
            double temperaturaSemana = scanner.nextDouble();


            if (temperaturaSemana <= 10.0) {
                contadorSemanaJogosCancelados--;
                System.out.printf("Jogos da semana %d Cancelados. \n", contadorSemana);
            } else {
                listaJogos.add(new Jogo(temperaturaSemana));
                listaJogos.add(new Jogo(temperaturaSemana));
                contadorTotalSemanasTemporada--;
            }
            contadorSemana++;
        }
        if (contadorSemanaJogosCancelados == 0 || contadorTotalSemanasTemporada == 0) {
            System.out.println("\n--------- Temporada de Jogos Encerrada ---------\n");
        }
    }

}







