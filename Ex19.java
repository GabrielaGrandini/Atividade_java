import java.util.ArrayList;
import java.util.Scanner;

public class Ex19 {
    public static void main (String[] args){
        ArrayList<String> produto = new ArrayList<>();
        ArrayList<Double> preco = new ArrayList<>();
        ArrayList<Double> precoMaiorque50 = new ArrayList<>();
        ArrayList<String> produtoMaiorque50 = new ArrayList<>();
        Scanner ler = new Scanner (System.in);
        int quantidade;

        System.out.print("Informe quantos produtos você verificará: ");
        quantidade =  ler.nextInt();

        ler.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome do produto: ");
            produto.add(ler.nextLine());

            System.out.println("Preço do produto: ");
            preco.add(ler.nextDouble());
            ler.nextLine();
            }


        for (int i = 0; i < preco.size(); i++) {
            if (preco.get(i) > 50) {
                precoMaiorque50.add(preco.get(i));
                produtoMaiorque50.add(produto.get(i));

                System.out.print("Estes são os produtos que possuem mais de R$50.00:" + produto.get(i) + " R$" + preco.get(i) + "\n");
          }
        }
    }
}
