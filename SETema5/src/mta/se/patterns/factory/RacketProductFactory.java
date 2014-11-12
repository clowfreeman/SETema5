/**
 * 
 */
package mta.se.patterns.factory;

/**
 * @author ClPardos
 *
 */
public class RacketProductFactory implements IProductFactory {

	/* 
	 * This is the factory which is producing Rackets
	 */
	
	public IProduct returnProduct(String product){
		if("Head".equalsIgnoreCase(product)){
			return new HeadRacket();
		}else{
			return new BabolatRacket();
		}
	}
}
