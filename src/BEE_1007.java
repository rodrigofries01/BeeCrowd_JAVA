/**
 * Leia quatro valores inteiros A, B, C e D.
 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
 * a fórmula: DIFERENCA = (A * B - C * D).
 **/

import java.util.Scanner;

public class BEE_1007 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        int DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
