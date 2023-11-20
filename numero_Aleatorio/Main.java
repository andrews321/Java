package numero_Aleatorio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroUsuario = 0;
    int numeroAleatorio = (int) Math.floor(Math.random()*100);

    System.out.print("¿Cual es el numero aleatorio:? ");
    numeroUsuario = teclado.nextInt();
    if(numeroUsuario == numeroAleatorio){
        System.out.print("Adivinaste el numero!!");
    }else{
        System.out.print("Numero equivocado, el numero es:  "+numeroAleatorio);
    }

}
}