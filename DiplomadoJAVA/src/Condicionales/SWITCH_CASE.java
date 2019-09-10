package Condicionales;

public class SWITCH_CASE {
	public static void main(String args[]) {

		
/*Desarrolla un programa donde por medio del tipo de un motor, determinar qué tipo de fluido puede trasportar éste según las siguientes condiciones:*/	
		
		
//		int numero = (int)(Math.random()*4);
//		
//		System.out.println(numero);
//		switch(numero) {
//		case 0:
//			System.out.print("hay establecido un valor definido para el tipo");
//			break;
//		case 1:
//			System.out.print("Agua");
//			break;
//		case 2:
//			System.out.print("Gasolina");
//			break;
//		case 3:
//			System.out.print("Hormigón");
//			break;
//		
//		default:
//			System.out.print("No existe un valor válido");
//		}
		
		
/*Desarrollar una calculadora, la cual, en base a un operador, realice una operación con dos números enteros ya definidos y mostrar el resultado,
los operadores a tener en cuenta son los vistos en la tabla de operadores aritméticos, sí deseas agregar más operadores, siéntete en libertad de hacerlo.*/		
		
		
		int numeroUno=2;
		int numeroDos=4;
		char operador='*';
		int resultado=0;
		
		
		switch(operador) {
			
			case '+':
				resultado = numeroUno + numeroDos ;	
				System.out.print("La Suma es: " + resultado);
			break;
			
			case '-':
				resultado = numeroUno - numeroDos ;
				System.out.print("La Resta es: " + resultado);
			break;
			
			case '*':
				resultado = numeroUno * numeroDos ;
				System.out.print("La Multiplicacion es: " + resultado);
			break;
			
			case '/':
				resultado = numeroUno / numeroDos ;
				System.out.print("La Divicion es: " + resultado);
			break;
			
		default:
			System.out.print("No existe un valor válido");
		}
		
		
		
		
	}
}
