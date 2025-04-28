/******************************************************************************

Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de
51 a 100 utilizando um laço de repetição. Utilize for.

*******************************************************************************/

import java.util.Scanner;
public class For1
{
	public static void main(String[] args) {
	   Scanner ler = new Scanner (System.in);
	   int num = 0;
	   
	   for (int i = 0;  i < 100; i++){
	       num++;
	       if (num%2 == 0 && num <=50){
	           System.out.println("Estes são os números pares na sequência de 1 a 50: " + num);
	       } else  if (num%2 == 1 && num > 50) {
	           System.out.println("Estes são os números pares na sequência de 51 a 100: " + num);
	       }
	   
	   }
	}
}