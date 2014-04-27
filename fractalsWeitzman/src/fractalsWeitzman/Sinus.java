/**
 * 
 */
package fractalsWeitzman;

/**
 * @author פרינץ
 *
 */
public class Sinus extends Action {
	public Complex perform(Complex c1) {
		return c1.sin();//the sin method returns new complex obj, so the original params didnt changed
		
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
	 * @see fractalsWeitzman.Action#perform(fractalsWeitzman.Complex, fractalsWeitzman.Complex)
	 */
	@Override
	public Complex perform(Complex c1, Complex c2) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform(fractalsWeitzman.Complex, double)
	 */
	@Override
	public Complex perform(Complex c1, double d) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform(double, fractalsWeitzman.Complex)
	 */
	@Override
	public Complex perform(double d, Complex c1) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fractalsWeitzman.Action#perform(double, double)
	 */
	@Override
	public double perform(double d, double d2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
