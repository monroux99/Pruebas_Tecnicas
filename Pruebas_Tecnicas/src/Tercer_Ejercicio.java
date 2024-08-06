import java.util.Scanner;

public class Tercer_Ejercicio {

	public static void main(String[] args) {
		
		/*	
		 3. Desarrolle un algoritmo para el cálculo del salario de un trabajador. 
		 	El importe liquidado (sueldo) depende de una tarifa o precio por hora establecida y de un condicionante sobre las horas trabajadas: 
		 	si la cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en un 50% para las horas extras. 
		 	Calcular el sueldo recibido por el trabajador en base las horas trabajadas y la tarifa.
			Utilice las instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para cargar los valores en las variables HORASTRABAJADAS y TARIFA.
		 */

        Scanner scanner = new Scanner(System.in);

        //Leer horas trabajadas
        System.out.print("LEER HORASTRABAJADAS: ");
        int horasTrabajadas = scanner.nextInt();

        //Leer tarifa por hora
        System.out.print("LEER TARIFA: ");
        double tarifa = scanner.nextDouble();

        //Calcular sueldo
        double sueldo;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            sueldo = 40 * tarifa + horasExtras * tarifa * 1.5;
        } 
        else {
            sueldo = horasTrabajadas * tarifa;
        }

        //Mostrar el sueldo
        System.out.println("El sueldo recibido por el trabajador es: " + sueldo);

	}

}
