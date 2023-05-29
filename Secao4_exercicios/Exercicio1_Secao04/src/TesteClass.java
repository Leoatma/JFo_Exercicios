import java.util.Scanner;

public class TesteClass {

    public static void main(String[] args) {

        ComputeMethods test = new ComputeMethods();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma temperatura em graus Fahrenheit: ");
        double degreesCelsius = test.fToC(scan.nextDouble()); // Chamando Método fToC()
        System.out.printf("Esta temperatura equivale a %.1f graus Celsius. \n\n", degreesCelsius);


        System.out.println("Informe agora o valor do lado a");
        int ladoa = scan.nextInt();
        System.out.println("Valor do lado b? ");
        int ladob = scan.nextInt();
        scan.close();


        double hypotenusa = test.hypotenuse(ladoa, ladob); // Chamando hypotenuse()
        System.out.printf("Hipotenusa = %.1f \n\n", hypotenusa);

        int diceSum = test.roll(); // chamando roll()
        System.out.printf("A soma dos valores dos dados = %d \n", diceSum);
    }
}
