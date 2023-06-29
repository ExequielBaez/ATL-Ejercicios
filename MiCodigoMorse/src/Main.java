import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String palabra ="CAB";

        Map<String,String> miTabla = new HashMap<>();

        miTabla.put("A", ".-");
        miTabla.put("B", "-...");
        miTabla.put("C", "-.-.");

        System.out.println(palabra);

        for(int i=0; i < palabra.length(); i++){

            System.out.print(miTabla.get(String.valueOf(palabra.charAt(i))) + " ");
        }

    }
}