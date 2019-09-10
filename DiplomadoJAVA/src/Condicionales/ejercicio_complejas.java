package Condicionales;

public class ejercicio_complejas {
	public static void main(String args[]) {
		
		
		//int velocidad = 1;
		
		//if(velocidad >=0 && velocidad <=30) {
		//System.out.print("Zonas Escolares ");	
			//}
		
			//else if (velocidad >30 && velocidad <=60) {
			//System.out.print("Vías Urbanas");
			//}
		
			//else if (velocidad >60 && velocidad <=80) {
			//System.out.print("Vías Rurales");
			//}
		
		//else if (velocidad >80 && velocidad <=100) {
		//System.out.print("Rutas Nacionales");
		//}
		
		//else {
		//System.out.print("Meneja fuero del rango");
			//}

		
		
		
/*
 Desarrollar un programa que permita por medio de la edad de una persona, determinar la categoría en la que pertenece a raíz de la siguiente tabla:
 */		
		
//		int categoria= (int) (Math.random()*100);
//		
//		System.out.println(categoria);
//		if(categoria >=0) {
//			if(categoria >=0 && categoria <=5) {
//				System.out.print("Infante");
//			}
//			
//			else if (categoria >=5 && categoria <=10){
//				System.out.print("Niño");
//			}
//			else if (categoria >=10 && categoria <=15){
//				System.out.print("Pre adolescente");
//			}
//			else if (categoria >=15 && categoria <=18){
//				System.out.print("Adolescente");
//			}
//			else if (categoria >=18 && categoria <=25){
//				System.out.print("Pre adulto");
//			}
//			else if (categoria >=25 && categoria <=40){
//				System.out.print("Adulto");
//			}
//		
//			else if (categoria >=40 && categoria <=55){
//				System.out.print("Pre anciano");
//			}
//			
//			else if (categoria >= 61) {
//				System.out.print("Anciano");
//			}
		
	
/*
 Desarrollar un programa que permita determinar la cantidad de cifras de un número X teniendo en cuenta que el número únicamente puede tener 4 cifras. 
 Mostrar un mensaje por defecto si el número supera las 4 cifras.
 */
		
		
//		int numero =21443;
//		
		//Log10 cuenta los caracteres de una variable
//		int cifra = (int) (Math.log10(numero)+1);
//		
//		if (cifra <=4) {
//			System.out.print(cifra + " cifras");
//
//		}
//		else {
//			System.out.print( "El numero supera las 4 cifras");
//		}
		
		

/*Desarrollar un programa que, por medio de 3 números enteros, determinar cuál es el mayor.*/
		
		
		int numeroUno = 1;
		int numeroDos = 6;
		int numeroTres=10444;
		int mayor=0;
		
		
		if(numeroUno > mayor) 
		{
			mayor = numeroUno;
			
	        if (numeroDos > mayor) 
	        {
				mayor = numeroDos;	
			}
	        else if(numeroTres > mayor) 
			{
				mayor = numeroTres;
			}
		}
		System.out.println( "El numero mayor es;  " + mayor);
		
	}

}
