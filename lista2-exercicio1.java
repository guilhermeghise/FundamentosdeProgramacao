
/**
 Escreva um programa que lê a idade e informa se é menor ou maior de idade.
 */

import java.util.Scanner;

public class exercicio1
{
   public static void main (String args[]) {
       int idade;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("\fDigite a idade: ");
       idade = teclado.nextInt();
       
       if (idade < 18) {
           System.out.println("Menor de idade.");
       } else {
           System.out.println("Maior de idade.");
       }
   }
   }
