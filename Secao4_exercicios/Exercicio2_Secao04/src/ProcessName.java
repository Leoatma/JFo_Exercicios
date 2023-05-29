import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        System.out.println("Digite o seu nome: ");
        String nomeCompleto = scan.nextLine();
        scan.close();


        String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        String sobreNome = nomeCompleto.substring((nomeCompleto.indexOf(" ") + 1), nomeCompleto.length());

        System.out.printf("Seu nome é: %s, %s.", sobreNome, primeiroNome.toUpperCase().charAt(0));

    }
}
