
/**
Escreva um programa que determina o preço de venda dos produtos de uma loja
conforme o preço de custo desses produtos. O programa deve ler o preço de custo
e calcular o valor de venda conforme o que segue: valor abaixo de R$10,00, lucro
de 70%; de R$10,00 a menos de R$30,00, lucro de 50%; de R$30,00 a menos de
R$50,00 lucro de 40%; de R$50,00 ou mais, lucro de 30%.
 */

import java.util.Scanner;

public class exercicio5
{
   public static void main (String args[]) {
    
    double precoCusto;
    double valorVenda = 0;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("\fDigite o preço de custo do produto: ");
    precoCusto = keyboard.nextDouble();
    
    if (precoCusto < 10) {
        valorVenda = precoCusto * 1.70;
    } else if (precoCusto >= 10 && precoCusto < 30) {
        valorVenda = precoCusto * 1.50;
    } else if (precoCusto >= 30 && precoCusto < 50) {
        valorVenda = precoCusto * 1.40;
    } else if (precoCusto >= 50) {
        valorVenda = precoCusto * 1.30;
}
    System.out.printf("O valor de venda deste produto é de R$%.2f", valorVenda);
}
}
