/******************************************************************************

Leia a idade de cinco pessoas e exiba a soma e a média das idades. 

*******************************************************************************/

import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade;
	    double media, soma = 0;
	    
	    for (int i = 1; i <= 5; i++){
	       System.out.println("Entre com uma idade: ");
	       idade = ler.nextInt ();
	       soma += idade;
	       media = soma / 5;
	        } 
	        
	       media = soma / 5;
	       System.out.println("Está e a soma de todas as idades: " + soma);
	       System.out.println("Está e a média de todas as idades: " + media);
	    
	}
}