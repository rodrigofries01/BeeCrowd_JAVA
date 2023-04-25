/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo
 * e o total de vendas efetuadas por ele no mês (em dinheiro).
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
 * informar o total a receber no final do mês, com duas casas decimais.
 **/

import java.util.Scanner;

public class BEE_1009 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String nome = entrada.nextLine();
    double perc = 0.15;
    double salarioFixo = entrada.nextFloat();
    double totalVendas = entrada.nextFloat();

    double comissao = (perc * totalVendas);
    double salarioFinal = comissao + salarioFixo;

    System.out.println(nome);
    System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
  }
}
