import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento de onda(em nm): ");
        double comprimentoOnda = scanner.nextDouble();
        scanner.close();

        calcularCompOnda(comprimentoOnda);

        }
    public static void calcularCompOnda(double comprimentoOnda){
        String ondaCor;
        if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
            ondaCor = "Violeta";
        } else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
            ondaCor = "Azul";
        } else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
            ondaCor = "Verde";
        } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            ondaCor = "Amarelo";
        } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            ondaCor = "Laranja";
        } else if (comprimentoOnda >= 620 && comprimentoOnda < 750) {
            ondaCor = "Vermelho";
        } else {
            ondaCor = "NA";
        }

        if (ondaCor.equals("NA")) {
            System.out.println("Este comprimento de onda não está dentro do espectro visível.");
        } else {
            System.out.printf("A cor é %s", ondaCor);
        }
    }
}
