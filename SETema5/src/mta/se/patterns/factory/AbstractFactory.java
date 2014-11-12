/**
 * 
 */
package mta.se.patterns.factory;

/**
 * @author ClPardos
 * The AbstractFactory is responsible for creating factories objects for the client as per request.
 */
public class AbstractFactory {
	
	/**
	 * @param factory	The desired factory object
	 * @return The racket factory object or shoe factory object
	 */
	public IProductFactory returnFactory(String factory){
		if ("Racket".equalsIgnoreCase(factory)){
			
			return new RacketProductFactory();
		}
		else{
			
			return new ShoeProductFactory();
		}
	}
}
