import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer suma = 0;
        List<Integer> multiplosDelTres = new ArrayList<>();
        List<Integer> multiplosDelCinco = new ArrayList<>();

        //Array tres
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0) {
                multiplosDelTres.add(i);
            }
        }
        //Array cinco
        for (int i = 5; i < 1000; i++) {
            if (i % 5 == 0) {
                multiplosDelCinco.add(i);
            }
        }
        //suma multiplos
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }

            System.out.println("Este es el array del tres");
            System.out.println(multiplosDelTres);

            System.out.println("Este es el array del cinco");
            System.out.println(multiplosDelCinco);

            System.out.println("Esta es la suma total");
            System.out.println(suma);

            System.out.println("Sumo el array del 3 usando suma de los elemnetods del array");
            int sum = multiplosDelTres.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Aqui suma del array " + sum);
        }
    }
}