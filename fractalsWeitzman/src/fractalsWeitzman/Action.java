/**
 * 
 */
package fractalsWeitzman;
import java.math.*;  
/**
 * @author rony
 *
 */
public abstract class Action {
	
	public abstract Complex perform() ;
	public abstract Complex perform(Complex c1,Complex c2);
	public abstract Complex perform(Complex c1);
	public abstract Complex perform(Complex c1,double d);
	public abstract Complex perform(double d,Complex c1);
	public abstract double perform(double d,double d2);

	/**
	 * @param c1
	 * @param c2
	 */
	
}
