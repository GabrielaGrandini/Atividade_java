import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
    public static void main (String[] args){
        Scanner ler =  new Scanner (System.in);
        ArrayList <String> nomes = new ArrayList <String>();


        for (int i = 0; i < 5; i++){
            System.out.println("Informe o " + (i+1) + "º nome: ");
            nomes.add(ler.nextLine());
        }

        System.out.println("Nomes em ordem inversa");
        for(int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }

    }
}

