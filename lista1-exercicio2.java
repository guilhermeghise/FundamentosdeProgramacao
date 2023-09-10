
/**
 * Um satélite será lançado para uma órbita circular em torno da Terra, de forma que complete uma
órbita completa em torno do planeta a cada T segundos.
Escreva um programa que calcule h a partir de T. Teste com 45 minutos, 90 minutos e um dia inteiro
(nesse caso, chamamos de órbita geoestacionária). O que você conclui?
DICA: para usar o valor de PI, importe a biblioteca matemática: “import math” O valor de PI é obtido
assim: “math.PI”
 */
import java.util.Scanner;
public class exercicio2
{
   public static void main(String args[]){
       
       final double G = 6.67426e-11;
       final double M = 5.97e24;
       final double R = 6371 * 1000;
       double t;
       
       Scanner tec = new Scanner(System.in);
       
       System.out.print("\fDigite um valor para T (segundos): ");
       t = tec.nextDouble();
       
       double teste = G * M * Math.pow(t,2);
       double teste2 = 4*Math.pow(Math.PI,2);
       double fracao = ((G * M * Math.pow(t,2))/(4*Math.pow(Math.PI,2)));
       
       System.out.println(teste);
       System.out.println(teste2);
       System.out.println(fracao);
       
       double h = Math.pow(((G * M * Math.pow(t,2))/(4*Math.pow(Math.PI,2))),(1/3))-R;
       
       
       System.out.println("A altitude é de: "+h);

       
   }
}
