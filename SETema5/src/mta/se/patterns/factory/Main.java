/**
 * 
 */
package mta.se.patterns.factory;

/**
 * @author ClPardos
 * The main class - holds the role of the client
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Concrete factory instance
		
		AbstractFactory abstractFactory = new AbstractFactory();
		
		// Product Factory Objects
		
		IProductFactory productFactory1 = abstractFactory.returnFactory("Racket");
		IProduct product1 = productFactory1.returnProduct("Head");
		System.out.println(product1.returnProductType());
		IProduct product2 = productFactory1.returnProduct("Others");
		System.out.println(product2.returnProductType());
		IProductFactory productFactory2 = abstractFactory.returnFactory("Shoe");
		IProduct product3 = productFactory2.returnProduct("Adidas");
		System.out.println(product3.returnProductType());
		IProduct product4 = productFactory2.returnProduct("Others");
		System.out.println(product4.returnProductType());

	}

}
