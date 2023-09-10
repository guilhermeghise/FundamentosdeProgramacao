
/**
 * Implemente um programa que leia um valor n, calcule e escreva n2, n3 e n4.
 */

import java.util.Scanner;
import java.lang.Math;
public class exercicio3
{
   public static void main(String args[]){
       
      double n1;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("\fDigite um número: ");
       n1 = keyboard.nextDouble();
       
       System.out.println("Seu número elevado a 2: "+Math.pow(n1, 2));
      System.out.println("Seu número elevado a 3: "+Math.pow(n1,3));
       System.out.println("Seu número elevado a 4: "+Math.pow(n1,4));
       
   }
}
