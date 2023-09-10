
/**
 * 
Implemente um programa que leia 3 valores reais (n1, n2 e n3) e um valor inteiro
(opção). O programa deve escrever os valores n1, n2 e n3 em uma determinada
ordem, a qual é definida pelo valor de opção.
(a) Se opcao for 1, o programa deve escrever os valores em ordem crescente.
(b) Se opcao for 2, o programa deve escrever os valores em ordem decrescente.
(c) Se opcao for 3, o maior deve ser escrito entre os demais.

 */

import java.util.Scanner;

public class exercicio7
{
   public static void main (String args[]) {
           double n1,n2,n3;
           double menorNumero = 0;
           double maiorNumero = 0;
           double terceiroNumero = 0;
           int option;
           
           Scanner keyboard = new Scanner (System.in);
           
           System.out.println("\fDigite o primeiro valor.");
           n1 = keyboard.nextDouble();
           
            System.out.println("Digite o segundo valor.");
           n2 = keyboard.nextDouble();
           
            System.out.println("Digite o terceiro valor.");
           n3 = keyboard.nextDouble();
           
           System.out.println("Valores em ordem: [1] Crescente / [2] Decrescente / [3] Maior entre os demais");
           option = keyboard.nextInt();
           
            // Menor Número
            if (n1 < n2 && n1 < n3) {
                menorNumero = n1;
            } else if (n2 < n1 && n2 < n3) {
                menorNumero = n2;
            } else if (n3 < n1 && n3 < n2) {
               menorNumero = n3;
            }
            
            //Maior Número
             if (n1 > n2 && n1 > n3) {
                maiorNumero = n1;
            } else if (n2 > n1 && n2 > n3) {
               maiorNumero = n2;
            } else if (n3 > n1 && n3 > n2) {
               maiorNumero = n3;
            }
            
            //Terceiro Número
            if ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)) {
                terceiroNumero = n1;
            } else if ((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3)) {
                terceiroNumero = n2;
            } else if ((n3 > n1 && n3 < n2) || (n3 < n1 && n3 > n2)) {
                terceiroNumero = n3;
            }
           
            //Opção 1
            if (option == 1) {
            System.out.println(menorNumero + "/" +terceiroNumero + "/" + maiorNumero);
            }
            
            //Opção 2
            if (option == 2) {
                System.out.println(maiorNumero + "/" +terceiroNumero + "/" + menorNumero);
            }
            
            //Opção 3
             if (option == 3) {
                System.out.println(menorNumero + "/" +maiorNumero + "/" + menorNumero);
            }
            
            
           
           
           
}
}


