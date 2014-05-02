/**
 * 
 */
package fractalsWeitzman;

/**
 * @author פרינץ
 *
 */
public class ParsingTree {
	private ParsingTree right;
	private ParsingTree left;
	private Action action;
	private double rightVal;
	private double leftVal;
	private boolean isVal;
	/**
	 * 
	 */
	public ParsingTree() {
		right=null;
		left=null;
		
	}
	/**
	 * @return the right
	 */
	public ParsingTree getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(ParsingTree right) {
		this.right = right;
	}
	/**
	 * @return the left
	 */
	public ParsingTree getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(ParsingTree left) {
		this.left = left;
	}
	/**
	 * @return the action
	 */
	public Action getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(Action action) {
		this.action = action;
	}
	/**
	 * @return the rightVal
	 */
	public double getRightVal() {
		return rightVal;
	}
	/**
	 * @param rightVal the rightVal to set
	 */
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	/**
	 * @return the leftVal
	 */
	public double getLeftVal() {
		return leftVal;
	}
	/**
	 * @param leftVal the leftVal to set
	 */
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	/**
	 * @return the isVal
	 */
	public boolean isVal() {
		return isVal;
	}
	/**
	 * @param isVal the isVal to set
	 */
	public void setVal(boolean isVal) {
		this.isVal = isVal;
	}
}
