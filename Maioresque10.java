/******************************************************************************

Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.

*******************************************************************************/

import java.util.Scanner; 
public class Maioresque10
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n = 0, contador = 0;
	    
	    for (int i = 0; i <= 20; i++){
	        System.out.println("Entre com um número: ");
	        n = ler.nextInt ();
	        
	        if (n > 10){
	            contador++;
	        }
	    }
	     System.out.println("Está é a quantidade de números maiores que 10: " + contador++);
		
	}
}