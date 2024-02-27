package desafia1;

import java.util.*;

public class Desafio_3 {

	public static void main(String[] args) {
	
		String mensaje = "";
		Scanner entrada= new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Múltiplos de 2 \n2: Múltiplos de 3"); // salida por pantalla, elección del usuario
		int multiplos=entrada.nextInt();
	
		switch (multiplos) {
		case 1: // multiplos de 2
			for(int i = 1; i <= 100; i++){
	            mensaje += (i % 2 == 0) ? "" + i + "\n": "";
	        }
	        System.out.println(mensaje); 
	        break;
		case 2:  // multiplos de 3
			for(int i = 1; i <= 100; i++){
	            mensaje += (i % 3 == 0) ? "" + i + "\n": "";
	        }
	        System.out.println(mensaje); 
	        break;
	        default:
	        	System.out.println("La opción no es correcta");
		}
		}
	}
