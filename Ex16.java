import java.util.ArrayList;
import java.util.Scanner;

public class Ex16 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        String frase;

        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();

        String[] palavras = frase.split(" ");

        ArrayList <String> qpalavras = new ArrayList<> ();

        for(String palavra: palavras){
            qpalavras.add(palavra);
        }

        System.out.println("Está é a quantidade de palavras: " + qpalavras.size());

        for(String começaA: qpalavras){
            if (começaA.startsWith("A")) {
                System.out.println("Palavras que começam com A: " + começaA);
            } else if (começaA.startsWith("a")) {
                System.out.println("Palavras que começam com A: " + começaA);
            }
        }

    }
}





