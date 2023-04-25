/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 * o valor unitário de cada peça 1, o código de uma peça 2,
 * o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * */
import java.util.Scanner;
public class BEE_1010 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int codPeca1 = entrada.nextInt();
        int numPecas1 = entrada.nextInt();
        double valPecas1 = entrada.nextDouble();

        int codPeca2 = entrada.nextInt();
        int numPecas2 = entrada.nextInt();
        double valPecas2 = entrada.nextDouble();

        double totalPecas1 = numPecas1 * valPecas1;
        double totalPecas2 = numPecas2 * valPecas2;

        double soma = totalPecas1 + totalPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

    }
}
