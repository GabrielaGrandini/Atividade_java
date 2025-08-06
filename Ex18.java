import java.util.ArrayList;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner ler = new Scanner (System.in);
        int menosUm = -1, numero, maior = 0, menor = Integer.MAX_VALUE;

        do {
            System.out.println("Para parar o sistema digite -1");

            System.out.print("Digite um número: ");
            numero = ler.nextInt ();

            if (numero != menosUm) {
                numeros.add(numero);
            }

            if (numero < menor){
                menor = numero;
            }

            if (maior < numero){
                maior = numero;
            }

        } while (numero != menosUm);

        System.out.println("Este é o maior número: " + maior);
        System.out.println("Este é o menor número: " + menor);
    }
}









