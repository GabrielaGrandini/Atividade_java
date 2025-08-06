import java.util.Scanner;
import java.util.ArrayList;

public class Ex20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        int tamanhoMinimo = 4;

        for (int i = 0; i < 2; i++) {
            System.out.print("Insira uma palavra: ");
            palavras.add(ler.nextLine());
        }

           for (int i = 0; i < 2; i++){
               for(String palavra: palavras) {
                   int caracteres = palavra.length();
                   if (caracteres <= tamanhoMinimo)
                       palavras.remove(i);
               }
        }
        System.out.println(palavras);

    }
}
