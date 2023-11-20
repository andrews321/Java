package Ejercicio_Arrays_While;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] numeros = new int [5];
        Scanner teclado = new Scanner(System.in);

/*en este ciclo MIENTRAS pregunta 5 veces el numero*/
        int contador = 0;
        /*while(contador < 5) es numeros.length*/
        while(contador < numeros.length){
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador ++;
        }

        /*en este ciclo MIENTRAS imprime los 5 numeros ingresados*/
        System.out.println("Los numeros que ingresó, son: ");
        contador = 0;
        while(contador < numeros.length){
            System.out.print(numeros[contador]);
            contador ++;
        }
    }
}
