
/**
Implemente um programa que leia o saldo médio de uma conta corrente, calcule
e escreve o seu limite conforme: menor que R$ 500,00 não há limite; de R$ 500,00
a R$ 1.000,00 8% do saldo médio; maior ou igual a R$ 1.000,00 15% do saldo
médio.
 */

import java.util.Scanner;

public class exercicio6
{
    public static void main (String args[]) {
        
        double saldo;
        double limite = 0;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("\fDigite seu saldo: ");
        saldo = keyboard.nextDouble();
        
        if (saldo < 500) {
            limite = 0;       
    } else if (saldo >=500 && saldo <= 1000) {
        limite = saldo*1.08;
    } else if (saldo >= 1000) {
        limite = saldo *1.15;
    }
    
    if (limite == 0) {
        System.out.print("Não há limite disponível.");
    } else {
    System.out.printf("Seu limite é: R$%.2f%n", limite);
}
}
}

