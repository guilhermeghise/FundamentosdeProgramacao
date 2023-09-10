/**
 * Construa um programa que leia dois valores inteiros e escreve na tela:
 * Soma, diferença, média, distância, maior dos dois, menor dos dois.
 * Pesquise, na API da classe Math, as funções que encontram o maior e o menor de dois valores. A
seguir, reescreva os dois últimos itens usando as funções encontradas. 
 */

import java.util.Scanner;
import java.lang.Math;
public class exercicio5
{
public static void main(String args[])
   {
        Scanner keyboard = new Scanner(System.in);
        int valor1, valor2;
        
        System.out.print("\fInforme o primeiro valor inteiro: ");
        valor1 = keyboard.nextInt();
        System.out.print("Informe o segundo valor inteiro: ");
        valor2 = keyboard.nextInt();
        System.out.println("Soma: " + (valor1+valor2));
        System.out.println("Diferença: " + (valor1-valor2));
        System.out.println("Media aritmetica: " + (valor1+valor2)/2.0);
        System.out.println("Distancia: " + Math.abs(valor1-valor2));
        System.out.println("Maior: " + (valor1+valor2 + Math.abs(valor1-valor2))/2);
        System.out.println("Maior: " + Math.max(valor1,valor2));
        System.out.println("Menor: " + (valor1+valor2 - Math.abs(valor1-valor2))/2);
        System.out.println("Menor: " + Math.min(valor1,valor2));
   }
}
