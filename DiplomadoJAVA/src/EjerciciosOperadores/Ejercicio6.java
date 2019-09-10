package EjerciciosOperadores;

public class Ejercicio6 {
	public static void main(String args[]) {
		
		System.out.println("\nCalcular el área y el perímetro del cuadrado");
		int ladoCuadrado = 8;
		
		int areCuadrada =(int) Math.pow(ladoCuadrado,2);
		int perimetroCuadrado = 4 *ladoCuadrado;
		System.out.println("\nArea Cuadrada: "+areCuadrada);
		System.out.println("\nPerimetro Cuadrado: "+perimetroCuadrado);
		System.out.println("\n----------------------------");
		
		
		System.out.println("\nCalcular el área y el perímetro del triángulo");
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo =  8;
		int ladoDosTriangulo =  8;
		
		int areaTriangular=(baseTriangulo*alturaTriangulo)/2;
		int perimetroTriangulo =(ladoUnoTriangulo+2)+baseTriangulo;
		System.out.println("\nArea Triangulo: "+areaTriangular);
		System.out.println("\nPerimetro Triangulo: "+perimetroTriangulo);
		System.out.println("\n----------------------------");
		
		
		
		
		System.out.println("\nCalcular el área y el perímetro del rectángulo");
		int baseRectangulo =  8;
		int alturaRectangulo =  6;
		
		int areaRectangulo = baseRectangulo * alturaRectangulo;
		int perimetroRectangulo = (2 * baseRectangulo) + (2 * alturaRectangulo);
		System.out.println("\nArea Rectangular: "+areaRectangulo);
		System.out.println("\nPerimetro Rectangular: "+perimetroRectangulo);
		
		
		
	}

}
