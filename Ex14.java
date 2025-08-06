import java.util.ArrayList;

public class Ex14 {
    public static void main (String[] args) {
        ArrayList <Integer> numerosPares = new ArrayList<>();

        numerosPares.add(0);
        numerosPares.add(2);
        numerosPares.add(4);
        numerosPares.add(6);
        numerosPares.add(8);
        numerosPares.add(10);
        numerosPares.add(12);
        numerosPares.add(14);
        numerosPares.add(16);
        numerosPares.add(18);
        numerosPares.add(20);

        for (int i = 0; i < numerosPares.size(); i++) {
            if (numerosPares.get(i) % 4 == 0) {
                numerosPares.remove(i);
            }
        } System.out.print(numerosPares);
    }
}


