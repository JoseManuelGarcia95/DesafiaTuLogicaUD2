package desafia1;

import java.util.*;

public class Desafio_2 {
	
	public static void main(String[] args) {

		// pedir numero hasta que este sea positivo
    	Scanner entrada= new Scanner(System.in);
    	
    	int n= 0;
    	// inicio entrada número
    	System.out.println("Introduce el número");
		n=entrada.nextInt();
		// inicio bucle en caso número negativo
		while (n<0) {    		
			System.out.println("Has escrito número negativo, por favor que sea positivo");
			n=entrada.nextInt();
    	}
		// fin bucle número negativo
		System.out.println("Numero entero correcto");
		System.out.println("Los siguientes 20 números a partir de " + n + " son:");
		// utilización del for para mostrar los siguientes 20 números 
		for (int i=0; i<=20; i++) {
			System.out.println((n+i) + " ");
		}
    }
}
