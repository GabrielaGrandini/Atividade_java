/******************************************************************************

 Crie um programa que solicite ao usuário um número e exiba a tabuada desse número 
 utilizando um laço de repetição. Utilize while.

*******************************************************************************/

import java.util.Scanner;
public class While2
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, multi, i = 1 ;
	    
		System.out.println("Entre com um valor para exibir o valor de sua tabuada: ");
		n = ler.nextInt();
		
		while (i <= 10){
		    multi = n * i;
		    System.out.println( n + " x " + i + " = " + multi);
		    i++;
		}
	}
}