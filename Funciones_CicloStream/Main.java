package Funciones_CicloStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] numeros = new int [5];


        /*Array stream*/
        Arrays.stream(numeros).forEach(System.out::println);

        for (int i = 0; i < numeros.length; i++){
           int numero = pedirNumeroAlUsuario();
            numeros[i] = numero;
        }
        mostrarNumeros(numeros);
    }

    public static void mostrarNumeros(  int[] numeros) {
        System.out.println("Los numeros que ingresó, son: ");
        for (int contador = 0; contador < numeros.length; contador++){
            System.out.print(numeros[contador]);

        }
    }
    public static int pedirNumeroAlUsuario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        return numero;
    }
}


