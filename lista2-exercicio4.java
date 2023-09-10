
/**
 Faça um programa que lê a altura de uma pessoa em metros e o seu sexo (use 1
para feminino e 2 para masculino). A seguir, o programa deve escrever o peso ideal
dessa pessoa conforme descrito: Para homens, use 72.7 x altura -58. Para
mulheres, use 62.1 x altura -44.7
 */

import java.util.Scanner;

public class exercicio4
{
   public static void main (String args[]) {
       double altura, pesoIdealH, pesoIdealM;
       char sexo;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("\fDigite sua altura: ");
       altura = teclado.nextDouble();
       System.out.println("\fQual seu sexo? (H/M) ");
       sexo = teclado.next().toUpperCase().charAt(0);
       
       pesoIdealH = (72.7 * altura) - 58;
        pesoIdealM = (62.1 * altura) - 44.7;
       
        if (sexo == 'H') {
            System.out.print("Seu peso ideal é: " + pesoIdealH);
        } else if (sexo == 'M') {
            System.out.print("Seu peso ideal é: " + pesoIdealM);
        }
       
    }
}
