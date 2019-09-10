package Condicionales;


public class ejercicio_simple {
	public static void main(String args[]) {
		
/*
1. Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
(Math.random) y por medio de una condicional determinar sí el número
es menor a 50 o mayor. */
		
		
		//double numero= (int) (Math.random()*100);
		
		//System.out.println(numero);
		
		
		//if(numero<50){
		//	System.out.println(numero+" Es Menor que 50");			
		//}
		//else {
		//	System.out.print(numero + " Es Mayor que 50");
			
		//}
	
		
/* Dados dos números enteros, determinar cuál es el mayor por medio de
una condicional y realizar una potencia con el número menor como
exponente (Math.pow).*/
		
		
		//int numeroUno = 17;
		//int numeroDos = 7;
		
		
		//if(numeroUno>=numeroDos) {
		//	System.out.print("Numero Uno es mayor que numero Dos");
		//}
		//else{
		//	System.out.print("Numero DOS es mayor que Numero UNO");
		//}
		
				
		//double potencia = Math.pow(numeroUno,numeroDos ) ;
		
		//System.out.println("\nLa potencia de: " + numeroUno + " y " + numeroDos + " es: "+ potencia); 


/*Dado un número entero, determinar por medio de un condicional si es
negativo o no (Menor a cero).*/
			
			
			
			//int numero = -9;
			
			//if(numero<=0){
				//System.out.print("Numero es Negativo");	
			//}
			//else{
			//	System.out.print("Numero es mayor ");
		//}
				
				
/*. Dados dos números enteros, determinar si uno es múltiplo del otro (Por
medio del módulo).
 */			     
			     //int numero1=4;
			     //int numero2=9;
			         //System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
			         
			         
			 //if(numero1 % numero2 == 0){
			         //System.out.println("Son multiplos");
			 
			     //}else{
			         //System.out.println("No son multiplos");
			 
			     //}
		
/* Por medio de una nota decimal, determinar sí el estudiante aprobó o no
la clase (0 – 6 = Perdió – 7 – 10 = Aprobó). */
		
		
		double nota = 10.9 ;
		
		
		if(nota <=6.9){
			
			System.out.print("Perdio");
			
		}
		
		else if (nota >= 7 && nota <=10){
			System.out.print("Aprobo");
			
		}
				
		
	}

}
