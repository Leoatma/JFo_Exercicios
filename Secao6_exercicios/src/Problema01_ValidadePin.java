import java.util.Scanner;

public class Problema01_ValidadePin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int PIN = 3344;
        System.out.println("Por favor, insira o PIN: ");
        int userPIN = in.nextInt();

        while (userPIN != PIN) {
            System.out.println("PIN incorreto, tente novamente: ");
            userPIN = in.nextInt();
        }
        in.close();

        if (userPIN == PIN) {
            System.out.println("PIN correto inserido, logando em 3.. 2.. 1.. ");
        }
    }
}
