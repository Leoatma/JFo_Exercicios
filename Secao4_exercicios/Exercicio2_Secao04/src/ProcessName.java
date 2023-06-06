import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        System.out.println("Digite o seu nome: ");
        String nomeCompleto = scan.nextLine();
        scan.close();

        String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        String sobreNome = nomeCompleto.substring((nomeCompleto.lastIndexOf(" ") + 1), nomeCompleto.length());

        System.out.printf("Seu nome é: %s, %s.%n", sobreNome, primeiroNome.toUpperCase().charAt(0));

        /*
         * OUTRO MODO DE FAZER COM A IMPRESSAO DE SOMENTE O ULTIMO SOBRENOME
         * 
         * String[] nomes = nomeCompleto.split(" ");
         * System.out.printf("%s, %s.%n", nomes[nomes.length - 1],
         * nomes[0].toUpperCase().charAt(0));
         */

    }
}
