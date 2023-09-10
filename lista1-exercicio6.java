
/**
 Faça um programa que leia uma quantia inteira em R$ e decompõe essa quantia na menor
quantidade de notas de 100, 50, 20, 10, 5, 2 e 1.
 */

import java.util.Scanner;
import java.lang.Math;
public class exercicio6
{
   public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
        int valor, ced200, ced100, ced50, ced20, ced10, ced5, ced2, moeda1;
        
        System.out.print("\fDigite um valor em reais: ");
        valor = keyboard.nextInt();
        ced200 = valor/200;
        ced100 = valor%200/100;
        ced50 = valor%200%100/50;
        ced20 = valor%200%100%50/20;
        ced10 = valor%200%100%50%20/10;
        ced5 = valor%200%100%50%20%10/5;
        ced2 = valor%200%100%50%20%10%5/2;
        moeda1 = valor%200%100%50%20%10%5%2/1;
        
        System.out.println("A quantia "+valor+ " equivale a: ");
        System.out.println(ced200+ " notas de R$200");
        System.out.println(ced100+ " notas de R$100");
        System.out.println(ced50+ " notas de R$50");
        System.out.println(ced20+ " notas de R$20");
        System.out.println(ced10+ " notas de R$10");
        System.out.println(ced5+ " notas de R$5");
        System.out.println(ced2+ " notas de R$2");
        System.out.println(moeda1+ " moeda de R$1");
       
   }
}
