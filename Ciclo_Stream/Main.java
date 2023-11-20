package Ciclo_Stream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] numeros = new int [5];
        Scanner teclado = new Scanner(System.in);



        /*Array stream*/
        Arrays.stream(numeros).forEach(System.out::println);

        /*en este ciclo MIENTRAS pregunta 5 veces el numero*/

        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }
        System.out.println("Los numeros que ingresó, son: ");
        for (int contador = 0; contador < numeros.length; contador++){
            System.out.print(numeros[contador]);

        }
    }
}


