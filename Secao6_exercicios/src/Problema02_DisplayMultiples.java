import java.util.Scanner;

public class Problema02_DisplayMultiples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int userNumber = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%dx%d = %d%n", userNumber, i, userNumber * i);
        }
    }
}
