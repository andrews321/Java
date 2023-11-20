package edad_Dog;
import java.util.Scanner;
public  class Main {
        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                int edadPerro, añosPerrunos;
    System.out.print("Ingrese la edad de su perro: ");
                edadPerro = teclado.nextInt();
                añosPerrunos = edadPerro * 7;
    System.out.println("La edad ingresada en años perrunos es:  "+ añosPerrunos);

        }

}



