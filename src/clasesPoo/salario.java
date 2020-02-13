package clasesPoo;

import java.util.*; //Importa la clase Scanner

public class salario {
	
    public static void main(String [] args) {
    	
    	String nombre;
    	int horas;
    	double pagoPorHora, pagoTotal;

    	Scanner teclado = new Scanner(System.in);

        Datos myClase = new Datos();
    	
    	System.out.print("Como te llamas? ");
    	nombre = teclado.next();
    	System.out.print("Cuantas horas trabajaste esta semana? ");
    	horas = teclado.nextInt();
    	System.out.print("Cuanto te pagan por hora? ");
    	pagoPorHora = teclado.nextDouble();
    	pagoTotal = horas * pagoPorHora;
    	System.out.println("Hola " + nombre);
    	System.out.println("Tu sueldo es $ " + pagoTotal);
    	teclado.close();
    	
    }
}


