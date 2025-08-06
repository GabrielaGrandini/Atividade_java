import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {
    public static void main (String[] args){
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner ler= new Scanner (System.in);
        int opcao;

        do {
        System.out.println("Lista de tarefas \nO que deseja fazer?: ");
        System.out.println("1. Ver a lista");
        System.out.println("2. Adicionar itens na lista");
        System.out.println("3. Remover itens na lista");
        System.out.println("4. Sair");
        opcao = ler.nextInt();

        ler.nextLine();

        switch (opcao) {
            case 1:
                System.out.println(tarefas);
                break;
            case 2:
                System.out.print("Insira a nova tarefa: ");
                tarefas.add(ler.nextLine());
                break;
            case 3:
                System.out.println("Insira o item que deseja remover: ");
                System.out.println(tarefas);
                tarefas.remove(ler.nextLine());
                break;

          }
        } while (opcao != 4);
    }
}
