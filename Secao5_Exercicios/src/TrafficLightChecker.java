import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código da cor: \n1 = Vermelho \n2 = Verde \n3 = Amarelo");
        int codCor = scan.nextInt();
        scan.close();

        calcularProxCor(codCor);
    }

    public static void calcularProxCor(int codCor) {
        if (codCor == 1) {
            System.out.println("A próxima cor do sinal é Verde");
        } else if (codCor == 2) {
            System.out.println("A próxima cor do sinal é Amarelo");
        } else if (codCor == 3) {
            System.out.println("A próxima cor do sinal é Vermelho");
        } else {
            System.out.println("Cor inválida");
        }
    }
}
