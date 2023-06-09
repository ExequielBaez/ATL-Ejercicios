import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VariosMapsTwitterPiedraPapel {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        //Busqueda pais

        System.out.println("Ingrese un pais");

        String pais = entrada.next();

        System.out.println("https://www.google.com/maps/search/"+pais);

        System.out.println("\n");

        //Buscar tweet

        System.out.println("Ingrese un apellido famoso");

        String nombre = entrada.next();

        System.out.println("https://twitter.com/search?q="+nombre);

        System.out.println("\n");

        //Piedra papel tijera

        ArrayList palabras = new ArrayList();

        palabras.add("Tijera");
        palabras.add("Papel");
        palabras.add("Piedra");

        Random num = new Random();

        int generado = num.nextInt(2);

        System.out.println("La computadora ha elegido: "+palabras.get(generado));

        System.out.println("Elija UD ahora\n 1:Tijera\n 2:Papel\n 3:Piedra");

        int eleccion = entrada.nextInt();

        if(generado == 0 && eleccion == 1) System.out.println("Empate");
        else if (generado == 0 && eleccion == 2) System.out.println("Gana Tijera");
        else if (generado == 0 && eleccion == 3) System.out.println("Gana Piedra");

        //faltan los otros

        }





}
