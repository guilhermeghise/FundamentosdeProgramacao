
/**
 Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.
 */

import java.util.Scanner;

public class exercicio3
{
   public static void main (String args[]) {
       int idade;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("\fDigite uma idade: ");
       idade = teclado.nextInt();
       
       if (idade <= 11) {
           System.out.println("Criança.");
       } else if (idade >= 12 && idade <= 17) {
           System.out.println("Adolescente.");
       } else if (idade >= 18 && idade <= 59) {
           System.out.println("Adulto");
       } else if (idade >= 60) {
           System.out.println("Idoso");
   }
   }
}
