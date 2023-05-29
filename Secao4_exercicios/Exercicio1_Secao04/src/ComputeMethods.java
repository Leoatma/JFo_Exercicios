import java.util.Random;

public class ComputeMethods {

    public double fToC(double degreesF) {
        return 5.0 / 9.0 * (degreesF - 32);
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int roll() {
        Random rndGen = new Random();
        int dice1 = rndGen.nextInt(6) + 1;
        int dice2 = rndGen.nextInt(6) + 1;
        System.out.printf("Dado 1: %d \n", dice1);
        System.out.printf("Dado 2: %d \n", dice2);
        return dice1 + dice2;
    }
}
