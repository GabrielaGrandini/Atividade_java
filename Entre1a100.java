/******************************************************************************

Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.

*******************************************************************************/

import java.util.Scanner;
public class Entre1a100
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n = 0, contador = 0;
	    
	    for (int i = 0; i < 10; i++){
		System.out.println("Entre com um número: ");
		n = ler.nextInt ();
		
		if (n <= 100 && n>=0){
		    contador++;
		}
	  }
	    System.out.println("Está é a quantidade de números entre 1 a 100: " + contador++);
	}
}