import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Integer suma = 0;
        Integer nuevo;
        lista.add(1);
        lista.add(2);
        for(int i=0; i<100; i++){
            int j = i+1;
            nuevo = lista.get(i) + lista.get(j);
            if(nuevo > 4000000) i = 100;
            else lista.add(nuevo);
        }
        System.out.println(lista);
        for (Integer e:lista) {
            if(e % 2 == 0){
                suma = suma + e;
            }
        }
        System.out.println(suma);
    }
}