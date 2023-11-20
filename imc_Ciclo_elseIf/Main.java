package imc_Ciclo_elseIf;

import java.util.Scanner;

    public class Main{
        static Scanner entrada = new Scanner(System.in);

        public static void main(String[] args) {

            double peso,altura,imc,alturaAlCuadrado;
   /*este es un ciclo para repetir el algoritmo
        int seguir =1;
        while(seguir == 1){ }
    termina con:
        seguir = entrada.nextInt();
    */
            int seguir =1;
            while(seguir == 1){

                System.out.println("\n"+"¿Que Peso tienes en kg?");
                peso = entrada.nextFloat();
                System.out.println("¿Que altura tienes?");
                altura = entrada.nextFloat();

                //*Math.pow funcion que eleva al cuadrado
                //* CALCULO: PESO / ALTURA * 2
                alturaAlCuadrado = Math.pow(altura,2);
                imc = (peso / alturaAlCuadrado);

                //*String.format da formato al resultado quitando decimales "%.0f"
                System.out.println(String.format("RESPUESTAS:"+"\n"+"Indice de Masa Corporal: " + "%.0f", imc));

                //* respuesta automatica que indica el estado de imc
                //* Bajo Peso, Ideal, Sobre Peso, Obesidad Grado I-II, Obesidad Grado III

                if (imc <= 18)
                    System.out.println("Alerta!! La persona tiene Bajo Peso");
                else if (imc >=19 && imc <=24)

                    System.out.println("La persona tiene un peso ideal!!");
                else if (imc >=25 && imc <=29)
                    System.out.println("La persona tiene sobre peso");

                else if (imc >=30 && imc <=39)
                    System.out.println("La persona tiene obesidad Grado I-II");

                else if (imc >=40 && imc <=80)
                    System.out.println("La persona tiene obesidad Grado III");


                System.out.println("\n"+"Ingresa 1 para repetir");
                System.out.println("Ingresa 0 para salir");


                seguir = entrada.nextInt();
            }

        }

    }
















    //*  EJEMPLO CARGA DE DATOS:
       /*
        System.out.println("¿Que edad tiene?");

        //* recoleccion de datos
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();


           if (edad >= 18) {
        System.out.println("Es mayor de edad!");
        } else {
        System.out.println("Es menor de edad!");

        }
*/









