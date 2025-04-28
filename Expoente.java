/******************************************************************************
Escreva um programa que calcule e exiba o valor da potência de um número informado
pelo usuário elevado a um expoente também informado pelo usuário, utilizando 
laços de repetição. Dica: Inicie a variável resultado com o valor 1.

Ex:
Base: 2
Expoente:7 
Resultado:128

Base: 5
Expoente:3 
Resultado:125

*******************************************************************************/

import java.util.Scanner;
public class Expoente
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int base, resultado = 1, n;
	    
	    System.out.println("Entre com o expoente: ");
	    n = ler.nextInt ();
	    
	    System.out.println("Entre com o valor da base: ");
		base = ler.nextInt ();
	    
	    for (int i = 0; i < n; i++ ){
            resultado = resultado * base;
	    }
	    
	    System.out.println("O resultado é: " + resultado);
	}
}