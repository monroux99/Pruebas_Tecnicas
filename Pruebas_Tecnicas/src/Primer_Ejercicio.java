import java.util.Scanner;

public class Primer_Ejercicio {

	public static void main(String[] args) {
		/*
		 1. Escriba un algoritmo que lea un número entero y determine si es par o impar. 
		 Si es par, que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero. 
		 Si es impar, que escriba todos los impares de manera descendiente desde si sí mismo hasta el uno. 
		 Utilice la instrucción LEER NUMERO al inicio del programa para cargar un número en la variable NUMERO.
		*/
		
		Scanner scanner = new Scanner(System.in);

       //Leer numero
       System.out.print("LEER NUMERO: ");
       int numero = scanner.nextInt();

       //Determinar si es par o impar y mostrar los numeros en orden descendente
       if (numero % 2 == 0) {
           //Numero par
           System.out.println("El número es par.");
           System.out.println("Números pares descendentes desde " + numero + " hasta 0:");
           for (int i = numero; i >= 0; i -= 2) {
               System.out.println(i);
           }
       } 
       else {
           //Numero impar
           System.out.println("El número es impar.");
           System.out.println("Números impares descendentes desde " + numero + " hasta 1:");
           for (int i = numero; i >= 1; i -= 2) {
               System.out.println(i);
           }
       }


	}

}
