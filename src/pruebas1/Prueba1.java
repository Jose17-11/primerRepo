package pruebas1;
import java.util.Scanner;
public class Prueba1 {
	
	public static void main(String args[]) {
		Scanner leer=new Scanner(System.in);

		int x = 0;
		int sigma;
		int n;
		do {
		System.out.println("*****Menú de sumatorias*****");
		System.out.println("1.-Formula 1.");
		System.out.println("2.-Formula 2.");
		System.out.println("3.-Formula 3.");
		System.out.println("4.-Formula 4.");
		System.out.println("5.-Salir.");
		x=leer.nextInt();
		System.out.println();
		switch(x) {
		case 1:
			System.out.println("*****Formula 1 de sumatorias*****");
			System.out.println("Ingresa la cantidad de numeros a sumar");
			n=leer.nextInt();
			
			sigma=((n+1)*n)/2;
			System.out.println("La suma total es: "+sigma);
			System.out.println();
			break;
		case 2:
			System.out.println("*****Formula 2 de sumatorias*****");
			System.out.println("Ingresa la cantidad de numeros a sumar");
			n=leer.nextInt();
			
			sigma=(n*(n+1)*((2*n)+1))/6;
			System.out.println("La suma total de cuadrados es: "+sigma);
			System.out.println();
			break;
		case 3:
			System.out.println("*****Formula 3 de sumatorias*****");
			System.out.println("Ingresa la cantidad de numeros a sumar");
			n=leer.nextInt();
			
			sigma=((n*n)*((n+1)*(n+1)))/4;
			System.out.println("La suma total de cubos es: "+sigma);
			System.out.println();
			break;
		case 4:
			System.out.println("*****Formula 4 de sumatorias*****");
			System.out.println("Ingresa la cantidad de numeros a sumar");
			n=leer.nextInt();

			int cubo=(6*n)*(6*n);
			cubo=cubo*cubo;
			sigma=cubo+(((9*n)*(9*n))+(n-1));
			sigma=(sigma*(n+1))*n;
			sigma=sigma/30;
			System.out.println("La suma total de potencias cuartas es: "+sigma);
			System.out.println();
			break;
		case 5:
			System.out.println("Gracias, Hasta pronto");
			break;
			default:
				System.out.println("Ingresa una opcion del menu..!!");
				System.out.println();
				break;
		}
		}while(x!=5);
	}

}
