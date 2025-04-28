/******************************************************************************

 Crie um programa que solicite ao usuário um número e exiba a tabuada desse número
 utilizando um laço de repetição. Utilize for.

*******************************************************************************/

import java.util.Scanner;
public class For2
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, multiplicacao;
	    
	    
		System.out.println("Entre com o número que deseja ver a tabuada: ");
		n = ler.nextInt ();
		
		for (int i = 1; i <= 10; i++){
		    multiplicacao = n * i;
		    System.out.println (n + " x " + i + " = " + multiplicacao);
		}
	}
}