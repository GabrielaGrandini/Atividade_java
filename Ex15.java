import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        ArrayList <Double> notas = new ArrayList<>();
        int numeroProvas, dentroMedia = 0;
        Double soma = 0.0, media;

        System.out.print("Informe quantas provas foram realizadas: ");
        numeroProvas = ler.nextInt ();

        for (int i = 0; i < numeroProvas; i++){
            System.out.print("Informe o valor da " + (1+i) + "º nota: ");
            notas.add(ler.nextDouble());
            soma += notas.get(i);
        }
        media = soma/numeroProvas;
        for (int i = 0; i < numeroProvas; i++){
            if (notas.get(i) > 7){
                dentroMedia++;
            }
        }

        System.out.println("A média das provas foi: " + media);
        System.out.println("Está é a quantidade de notas dentro da média: " + dentroMedia);
    }
}


