import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código da cor: \n1 = Vermelho \n2 = Verde \n3 = Amarelo");
        int codCor = scan.nextInt();
        scan.close();

        calcularProxCor(codCor);
    }

    public static void calcularProxCor(int codCor) {
        switch (codCor) {
            case 1:
                System.out.println("A próxima cor do sinal é Verde");
                break;
            case 2:
                System.out.println("A próxima cor do sinal é Amarelo");
                break;
            case 3:
                System.out.println("A próxima cor do sinal é Vermelho");
                break;
            default:
                System.out.println("Cor inválida");
        }
    }
}


