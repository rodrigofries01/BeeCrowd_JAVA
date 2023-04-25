/*
 * Leia dois valores inteiros.
 * A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
 * A seguir mostre a variável PROD com mensagem correspondente.
 * */

import java.util.Scanner;

public class BEE_1004 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();

        int PROD = (int) (A * B);

        System.out.println("PROD = " + PROD);
    }
}
