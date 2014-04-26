/**
 * 
 */
package fractalsWeitzman;

/**
 * @author yael
 *
 */
public class Dividing extends Action {
	public Complex perform(Complex c1,Complex c2) {
		return c1.divides(c2);//the plus method returns new complex obj, so the original params didnt changed
		
	}
	
	public Complex perform(Complex c1,double d) {
		return new Complex(c1.re()/d,c1.im()/d);//the plus method returns new complex obj, so the original params didnt changed
		
	}
}
