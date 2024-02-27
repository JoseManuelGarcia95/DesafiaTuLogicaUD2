package desafia1;

import java.util.*;

public class Desafio_4 {

	public static void main(String[] args) {

		int a, b, c, Mayor, Medio, Menor;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese el primer número");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo número");
		b= entrada.nextInt();
		
		System.out.println("Ingrese el tercer número");
		c = entrada.nextInt();
		
		System.out.println("Elige una opción: \n1: Orden ascendente \n2: Orden descendente");
		
		int orden=entrada.nextInt();
		
		switch (orden) {
		
		case 1:
			if (a>b && a>c) {
				Mayor = a;
			} else if (b<a && b>c){
				Mayor = b;
			} else {
				Mayor = c;
			}
			if (a<b && a<c) {
				Menor = a;
			} else if (b<a && b<c) {
				Menor = b;
			} else {
				Menor = c;
			}
			Medio = (a+b+c) - (Mayor+Menor);
			System.out.println("El orden ascendente de los números es:");
			System.out.println(Menor + " " + Medio + " " + Mayor);
			
			break;
			
		case 2: 
			if (a>b && a>c) {
				Mayor = a;
			} else if (b<a && b>c){
				Mayor = b;
			} else {
				Mayor = c;
			}
			if (a<b && a<c) {
				Menor = a;
			} else if (b<a && b<c) {
				Menor = b;
			} else {
				Menor = c;
			}
			Medio = (a+b+c) - (Mayor+Menor);
			System.out.println("El orden descendente de los números es:");
			System.out.println(Mayor + " " + Medio + " " + Menor);
			
			break;
			default:
				System.out.println("La opción no es correcta");
		}
	}

}
