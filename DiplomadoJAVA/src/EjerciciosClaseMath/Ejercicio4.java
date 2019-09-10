package EjerciciosClaseMath;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		double numeroUno = (int) (Math.random()*50);
		double numeroDos = (int) (Math.random()*50);
	
		
		double numeroUnoRedondiado = (int) Math.ceil(numeroUno);
		double numeroDosRedondiado = (int) Math.round(numeroDos);
	
		
		
		System.out.println("Numero 1 : " + numeroUnoRedondiado);
		System.out.println("Numero 2 : " + numeroDosRedondiado);
	
		System.out.println("---------------------------- ");
	
		
		
		System.out.println("\nNumero mayor es : " + Math.max(numeroUnoRedondiado, numeroDosRedondiado) );
		

		
		
		
		
	}

}
