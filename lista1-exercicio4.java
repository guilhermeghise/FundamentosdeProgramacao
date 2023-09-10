
/**
 * Faça um programa que converte de Fahrenheit para graus Celsius. O programa deve ler um valor
em Fahrenheit, converter e escrever o valor correspondente em Celsius. Para realizar a conversão
use a fórmula:

5/9 (f – 32)
 */

import java.util.Scanner;
import java.lang.Math;
public class exercicio4
{
   public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
        double fahrenheit;
        
        System.out.println("\fDigite a temperatura em Fahrenheit: ");
        fahrenheit = keyboard.nextDouble();
        
        double celcius = 5.0/9.0*(fahrenheit-32.0);
        
        System.out.println("A temperatura em Celcius será:  "+celcius);
        
       
   }
}
