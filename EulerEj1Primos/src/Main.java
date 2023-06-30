import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer sumaMultiplosTres = 0;
        List<Integer> multiplosDelTres = new ArrayList<>();
        List<Integer> mulriplososDelCinco = new ArrayList<>();

        for(int i=0; i<10; i++){
            if( i % 3 == 0 ){
                multiplosDelTres.add(i);
                sumaMultiplosTres = sumaMultiplosTres + i;
                }

        }

        System.out.println(multiplosDelTres);
        System.out.println(sumaMultiplosTres);

        System.out.println("Sumo el array");
        int sum = multiplosDelTres.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Aqui suma del array "+sum);
    }
}