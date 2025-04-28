/******************************************************************************
 Faça um programa que calcule e exiba a soma dos números pares de 1 a 100
 utilizando um laço de repetição. Utilize while.
*******************************************************************************/

import java.util.Scanner;
public class While3
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int soma = 0, n = 1;
	    
	    while (n <= 100){
	        n++;
	        if (n%2 == 0){
	        soma+= n;
	        }
	    }
		System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
	}
}
