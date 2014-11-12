/**
 * 
 */
package mta.se.patterns.factory;

/**
 * @author ClPardos
 *
 */
public class ShoeProductFactory implements IProductFactory {

		
	/* 
	 * This is the first factory which is producing Shoes
	 */
	public IProduct returnProduct(String product){
		if("Adidas".equalsIgnoreCase(product)){
			return new AdidasShoe();
		}else{
			return new DunlopShoe();
		}
	}
}
