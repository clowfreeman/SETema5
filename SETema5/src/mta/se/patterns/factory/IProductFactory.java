/**
 * 
 */
package mta.se.patterns.factory;

/**
 * @author ClPardos
 * Factory interface will tell other factories, in this case two factories, Racket and Shoe to implement the returnFactory method
 */
public interface IProductFactory {
		
	/**
	 * @param product	The object returned by factories Rocket or Shoe
	 * @return
	 */
	public IProduct returnProduct(String product);

}
