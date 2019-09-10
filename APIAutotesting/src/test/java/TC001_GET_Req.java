import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Req {

	@Test
	void gettest() {
		
		  RestAssured.baseURI="https://tpaga.co/";
		  System.out.println("=================================================");
		  System.out.println("La URL a validar:" + RestAssured.baseURI);
		  
		  
		
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //En esta linea valido con el metod.get que la pagina "dispersion-digital" se necuentre dentro de
		  //https://tpaga.co/---esto lo hacen las demas validaciones o test
		  Response response=httpRequest.request(Method.GET,"Test");
		  
		  //Aqui como esta pagina no exite me debe retornar un 404 ya que la pagina no existe
		  
		///ahoar vamos a validar la seguna prueba del formulario

		  int statusCode=response.getStatusCode();
		  System.out.println("Status codigo es: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		  //status line verification
		  String statusLine=response.getStatusLine();
		  System.out.println("Status linea es:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	@Test
	void gettest2() {
		
		  RestAssured.baseURI="https://tpaga.co/2019/03/05/afilia-tu-comercio-a-tpaga/";
		  System.out.println("=================================================");
		  System.out.println("La URL a validar:" + RestAssured.baseURI); 
		 
		
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  Response response=httpRequest.request(Method.GET,"dispersion-digital");
		  

		  int statusCode=response.getStatusCode();
		  System.out.println("Status codigo es: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		
		  String statusLine=response.getStatusLine();
		  System.out.println("Status linea es:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	@Test
	void gettest3() {
		
		//Specify base URI
		  RestAssured.baseURI="https://tpaga.co/soluciones-empresariales/";
		  System.out.println("=================================================");
		  System.out.println("La URL a validar:" + RestAssured.baseURI);
		 
		
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  Response response=httpRequest.request(Method.GET,"dispersion-digital");
		
	
		  int statusCode=response.getStatusCode();
		  System.out.println("Status codigo es: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
	
		  String statusLine=response.getStatusLine();
		  System.out.println("Status linea es:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	

}
