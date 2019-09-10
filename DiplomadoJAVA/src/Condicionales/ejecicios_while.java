package Condicionales;

public class ejecicios_while {
	public static void main(String args[]) {
		/*Desarrollar un programa que imprima los números impares entre 1 y 25.*/
		
//		int i =0;
//		
//		while(i<=25) {
//			
//			if(i % 2!=0) 
//			{System.out.print(i+"-");
//				
//			}
//			i++;
//		}
		
/*Desarrollar un programa que, dada una palabra, descomponer todos sus caracteres.*/
		
		
//		String palabra = "Jonathan-Javier-Rodriguez-Madero";
//		
//		int i = 0;
//		
//		System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres");
//		
//		while(i < palabra.length()) {
//			
//			System.out.println(palabra.charAt(i) + " En la posiscion: " + i);
//			i++;
//		}
//		
		
/*- Desarrollar un programa que genere números aleatorios entre 1 y 50 y se detenga cuando genere un múltiplo de 10.*/		
		
//		boolean x=true;
//		while(x){
//			
//			double n= Math.ceil(Math.random()*50);
//			System.out.println(n);
//			if(n % 10 == 0) {
//				
//				x= false;				
//			}
//			
//		}
		

	//DO While
		
//		int i = 0;
//		
//		do {
//			System.out.print(i);
//			i++;
//		}
//		while(i > 5);
			

/*Desarrolla un programa que permita invertir la palabra “Programación”. El resultado debe ser “nahtanoJ”.*/	
//		
//		String palabra = "Jonathan";
//		String invertir = "";
//		
//		int aux= palabra.length()-1;
//		
//		while(aux >= 0)
//		{
//			invertir = invertir + palabra.charAt(aux);
//			aux--;
//			
//		}
//		System.out.print(invertir);

		
		
/* Desarrollar un programa que determine si una palabra establecida previamente es o no palíndroma.*/	
		
		String palabra="anaff";
		String paligrama ="";
		int aux =palabra.length()-1;
		
		while (aux >= 0) 
		{	
			paligrama = paligrama + palabra.charAt(aux);
			aux--;
		}
		if(paligrama.equals(palabra)){
			System.out.print("Es paligrama");
		}
		else 
		{
			System.out.print("NO paligrama");
		}
		
		
		
	}

}
