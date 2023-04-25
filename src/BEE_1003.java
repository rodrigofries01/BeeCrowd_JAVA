/*
 * Leia dois valores inteiros, no caso para variáveis A e B.
 * A seguir, calcule a soma entre elas e atribua à variável SOMA.
 * A seguir escrever o valor desta variável.
 */


import java.util.Scanner;

public class BEE_1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int SOMA = (A + B);

        System.out.println("SOMA = " + SOMA);
    }
}