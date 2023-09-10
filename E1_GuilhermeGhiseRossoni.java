
/**
Faça um programa que leia 5 valores reais, calcula e escreve a média desses valores
conforme regras a seguir:
(a) descartar o maior e o menor valor, calcula a média dos valores restantes.
(b) descartar os dois menores valores, calcula a média dos valores restantes
 */

import java.util.Scanner;

public class E1_GuilhermeGhiseRossoni
{
    public static void main(String args[]) {
    Scanner teclado = new Scanner (System.in);
   
   double n1,n2,n3,n4,n5, maior = 0, menor = 9999, menor2 = 9999, media;
   char option;
   
   System.out.println("\fDigite o primeiro número: ");
   n1 = teclado.nextDouble();
   
   System.out.println("Digite o segundo número: ");
   n2 = teclado.nextDouble();
   
   System.out.println("Digite o terceiro número: ");
   n3 = teclado.nextDouble();
   
   System.out.println("Digite o quarto número: ");
   n4 = teclado.nextDouble();
   
   System.out.println("Digite o quinto número: ");
   n5 = teclado.nextDouble();
   
   System.out.println("\fEscolha uma opção: ");
   System.out.println("[a] descartar o maior e o menor valor, calcula a média dos valores restantes. ");
   System.out.println("[b] descartar os dois menores valores, calcula a média dos valores restantes. ");
   option = teclado.next().charAt(0);
   
     // Verificar o menor número:
     
     if (n1 < menor) {
       menor = n1;
   } if (n2 < menor) {
       menor = n2;
   }  if (n3 < menor) {
      menor = n3;
   }  if (n4 < menor) {
       menor = n4;
   } if (n5 < menor) {
      menor = n5;
    }
   
    // Verificar o maior número
   
   if (n1 > maior) {
       maior = n1;
   } if (n2 > maior) {
       maior = n2;
   } if (n3 > maior) {
       maior = n3;
   } if (n4 > maior) {
       maior = n4;
   }  if (n5 > maior) {
       maior = n5;
   }

    // Resultado
    
    // Opção A
   if (option == 'a') { // Descartará o menor e o maior valor.
        media = ((n1+n2+n3+n4+n5)-menor-maior)/3;
        System.out.println(media);
    }
    
    
    // Opção B
    if (option == 'b') { // Descartará os dois menores valores.
        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
        menor2 = n1;
    }
         if (n2 < n1 && n2 < n3 && n2 < n4 && n1 < n5) {
        menor2 = n1;
    }
       if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
        menor2 = n1;
    }
     if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
        menor2 = n1;
    }
    if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
        menor2 = n1;
    }
       media = ((n1+n2+n3+n4+n5)-menor-menor2)/3;
        System.out.println(media);  
    }
    }
}
