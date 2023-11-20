package Ejercicio_Arrays_doWhile;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {

            int[] numeros = new int[5];
            Scanner teclado = new Scanner(System.in);

            //*en este ciclo MIENTRAS pregunta 5 veces el numero
            int contador = 0;

            do {
                System.out.println("Ingrese un numero: ");
                int numero = teclado.nextInt();
                numeros[contador] = numero;
                contador++;
            } while (contador < numeros.length);

            System.out.println("Los numeros que ingresó, son: ");
            contador = 0;
            do {
                System.out.print(numeros[contador]);
                contador ++;
            } while (contador < numeros.length);
        }

        }



