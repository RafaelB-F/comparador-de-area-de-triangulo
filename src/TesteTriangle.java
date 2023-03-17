import java.util.Locale;
import java.util.Scanner;



public class TesteTriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		double areaX, areaY;
		
		System.out.println("entre os dados do triangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("entre os dados do triangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Area de x = %.4f%n" , areaX);
		System.out.printf("Area de y = %.4f%n" , areaY);
		
		if(areaX > areaY) {
			System.out.println("maior area : X");
		}else {
			System.out.println("maior area : y");
		}
	}

}
