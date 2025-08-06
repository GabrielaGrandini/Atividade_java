import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Ex17 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random ();

        for (int i = 0; i < 10; i++){
            int numerosAleatorios = random.nextInt(100);
            numeros.add(numerosAleatorios);
        }
        Collections.sort(numeros);
        for (int valores : numeros) {
            System.out.print(valores + ", ");
        }
    }
}