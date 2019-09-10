package ClaseFor;

public class Ejercicio1 {
	public static void main(String args[]) {
		
/* Desarrolla un programa que permita mostrar el factorial de un número definido previamente. */		
		
		//Ej.: El factorial de 5 es: 5*4*3*2*1
		
        long factorial=1;
        int num=5;
   
        System.out.print("Introduce un número: ");

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
		
		
	}

}
