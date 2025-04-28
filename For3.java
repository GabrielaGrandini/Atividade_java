/******************************************************************************

Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 
utilizando um laço de repetição. Utilize for.

*******************************************************************************/

import java.util.Scanner;
public class For3
{
	public static void main(String[] args) {
	    Scanner ler =new Scanner (System.in);
	    int n = 0, soma = 0;
	    
	    for (int i = 0; i <= 100; i++) {
	        n++;
	        if (n%2 == 0){
	            soma+= n;
	        }
	    }
		  System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
	}
}