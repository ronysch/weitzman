/**
 * 
 */
package fractalsWeitzman;

/**
 * @author yael
 *
 */
public class Multiplying extends Action {
	public Complex perform(Complex c1,Complex c2) {
		return c1.times(c2);//the times method returns new complex obj, so the original params didnt changed
		
	}
	
	public Complex perform(Complex c1,double d) {
		return c1.times(d);//the times method returns new complex obj, so the original params didnt changed
		
	}
	
	public Complex perform(double d,Complex c1) {
		return c1.times(d);//the times method returns new complex obj, so the original params didnt changed
		
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform()
	 */
	@Override
	public Complex perform() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform(fractalsWeitzman.Complex)
	 */
	@Override
	public Complex perform(Complex c1) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform(double, double)
	 */
	@Override
	public double perform(double d, double d2) {
		// TODO Auto-generated method stub
		return d*d2;
	}

}
