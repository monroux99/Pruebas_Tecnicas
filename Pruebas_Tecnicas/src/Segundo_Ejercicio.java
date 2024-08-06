import java.util.Scanner;

import Clases.Persona;

public class Segundo_Ejercicio {

	public static void main(String[] args) {
		
		/*
		2.Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo. Deberá mostrar los siguientes resultados:
			a.	Cantidad de personas mayores de edad (18 años o más).
			b.	Cantidad de personas menores de edad.
			c.	Cantidad de personas masculinas mayores de edad.
			d.	Cantidad de personas femeninas menores de edad.
			e.	Porcentaje que representan las personas mayores de edad respecto al total de personas.
			f.	Porcentaje que representan las mujeres respecto al total de personas.

			Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las 50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
			Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
			SEXO y EDAD.
		*/
		
		final int CANTIDAD_PERSONAS = 50;
		
		Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[CANTIDAD_PERSONAS];

        //Leer datos de 50 personas
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingrese el sexo de la persona " + (i + 1) + " (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            personas[i] = new Persona(sexo, edad);
        }

        //Variables para los resultados
        int mayoresEdad = 0;
        int menoresEdad = 0;
        int masculinosMayoresEdad = 0;
        int femeninasMenoresEdad = 0;
        int totalMujeres = 0;

        //Calcular los resultados
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayoresEdad++;
                if (persona.getSexo() == 'M' || persona.getSexo() == 'm') {
                    masculinosMayoresEdad++;
                }
            } 
            else {
                menoresEdad++;
                if (persona.getSexo() == 'F' || persona.getSexo() == 'f') {
                    femeninasMenoresEdad++;
                }
            }
            if (persona.getSexo() == 'F' || persona.getSexo() == 'f') {
                totalMujeres++;
            }
        }

        // Calcular porcentajes
        double porcentajeMayoresEdad = (double) mayoresEdad / personas.length * 100;
        double porcentajeMujeres = (double) totalMujeres / personas.length * 100;

        // Mostrar resultados
        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinosMayoresEdad);
        System.out.println("Cantidad de personas femeninas menores de edad: " + femeninasMenoresEdad);
        System.out.println("Porcentaje de personas mayores de edad respecto al total: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de mujeres respecto al total de personas: " + porcentajeMujeres + "%");

	}

}
