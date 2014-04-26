/**
 * 
 */
package fractalsWeitzman;

/**
 * @author yael
 *
 */
public class Substracting extends Action {
	public Complex perform(Complex c1,Complex c2) {
		return c1.minus(c2);//the plus method returns new complex obj, so the original params didnt changed
		
	}

}
