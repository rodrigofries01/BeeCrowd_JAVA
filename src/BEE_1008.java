/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
 * e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

import java.util.Scanner;
public class BEE_1008 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int funcionario = entrada.nextInt();
    int horas = entrada.nextInt();
    float precoHoras = entrada.nextFloat();
    float salario = (horas * precoHoras);

    System.out.println("NUMBER = " + funcionario);
    System.out.printf("SALARY = U$ %.2f", salario);
  }
}
