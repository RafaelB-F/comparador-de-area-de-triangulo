import java.util.Locale;
import java.util.Scanner;



public class TesteProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		
		System.out.println("Enter product name: ");
		product.name = sc.nextLine();
		
		System.out.println("Enter product price: ");
		product.price = sc.nextInt();
		
		System.out.println("Enter product quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println(product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added to stock: ");
		int quantity =  sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data --->  " + product );
		System.out.println();
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity =  sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data --->  " + product );
	

	}

}
