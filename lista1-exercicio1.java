
/**
 Escreva um programa em Java que solicita 3 valores numéricos (a, b e c) para o usuário, calcula e
exiba a média aritmética e a média harmônica destes valores. A função geral da média harmônica
é:
 */

import java.util.Scanner;
public class exercicio1
{
    public static void main (String args[]) {
        Scanner keyboard = new Scanner (System.in);
        
        double n1,n2,n3;
        
        
        System.out.println("\fDigite o primeiro número: ");
        n1 = keyboard.nextDouble();
    
        System.out.println("Digite o segundo número: ");
        n2 = keyboard.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        n3 = keyboard.nextDouble();
        
        double mediaAritmetica = (n1+n2+n3)/3;
        double mediaHarmonica = 3 / ((1.0 / n1) + (1.0 / n2) + (1.0 / n3));
        
        System.out.println("A média aritmética é: "+mediaAritmetica);
        System.out.println("A média harmônica é: "+mediaHarmonica);
        
    }
}
