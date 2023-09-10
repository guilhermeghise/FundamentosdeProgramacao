
/**
 Faça um programa que informe se o aluno está aprovado ou está em G2 ou foi
reprovado.
 */

import java.util.Scanner;

public class exercicio2
{
   public static void main (String args[]) {
       double nota;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("\fDigite sua nota: ");
       nota = teclado.nextDouble();
       
       if (nota >= 7) {
           System.out.println("Aprovado");
       } else if (nota >=4 && nota < 7) {
           System.out.println("Está em G2.");
       } else if (nota < 4) {
           System.out.println("Reprovado");
       }
   }
   }
