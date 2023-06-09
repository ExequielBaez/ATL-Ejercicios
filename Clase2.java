import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Clase2 {
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

        String palabras[] = new String[3];

        palabras[0] = ("Tijera");
        palabras[1] = ("Papel");
        palabras[2] = ("Piedra");

        Random num = new Random();

        int generado = num.nextInt(2);

        System.out.println(generado);

        System.out.println("Elija\n 1: Tijera\n 2:Papel\n 3:Piedra");

        int eleccion = entrada.nextInt();

        if(generado==eleccion) System.out.println("Empate");
        else if (generado == 0 && eleccion == 2) System.out.println("Gana Tijera");
        else if (generado == 0 && eleccion == 3) System.out.println("Gana Piedra");

        //faltan los otros

        }





}
