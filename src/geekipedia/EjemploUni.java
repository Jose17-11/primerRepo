package geekipedia;
import java.util.Scanner;
public class EjemploUni {
	
	static String palabra="", palabraInvertida="";

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);

		System.out.println("Ingresa una frase o palabra");
		palabra=leer.next();
		
		for(int i=0; i<palabra.length(); i++) {
			palabraInvertida=palabra;
			System.out.println(palabraInvertida);
		}
	}
}
