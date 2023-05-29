public class Problema03_LoopShape {

    static void createRectangle(int width, int height) {
        if (width >= 1 && height >= 1) {
            for (int i = 1; i <= height; i++) {
                System.out.println("");
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || i == height) {
                        System.out.print("#");
                    } else {
                        if (j == 1 || j == width) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println("");
        } else {
            System.out.println("Valor inserido para o Retângulo é inválido, tente novamente.");
        }
    }

    static void createTriangle(int leg) {
        if (leg >= 1) {
            for (int linha = 1; linha <= leg; linha++) {
                System.out.println("");
                for (int coluna = 1; coluna <= linha; coluna++) {
                    if (linha == 1) {
                        System.out.print("#");
                    } else if (linha > 1 && linha < leg) {
                        if (coluna == 1 || coluna == linha) {
                            System.out.print("#");
                        } else {
                            System.out.print(" ");
                        }
                    } else if (linha == leg) {
                        System.out.print("#");
                    }
                }
            }
        } else {
            System.out.println("Valor inválido ao Triângulo. Tente novamente.");
        }
    }
}