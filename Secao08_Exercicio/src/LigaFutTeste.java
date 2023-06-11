import java.util.Scanner;

public class LigaFutTeste {
    public static void main(String[] args) {

        System.out.println("\n----------  Olá, bem vindo a Liga de Futebol!!! ---------\n");
        System.out.println("A primavera chegou em precisamos cadastrar as equipes da liga.\n");

        Scanner keyIn = new Scanner(System.in);

        Programador.addEquipesLiga(keyIn);

        Jogo.addJogo(keyIn);

        Programador.imprimirEstatisticas();

        keyIn.close();
    }
}
