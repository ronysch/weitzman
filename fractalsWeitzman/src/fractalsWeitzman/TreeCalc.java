/**
 * 
 */
package fractalsWeitzman;

/**
 * @author �����
 *
 */
public class TreeCalc {
	public static double calc(ParsingTree tree){
		if(tree.getAction()==null)
			return tree.getLeftVal();
		if(tree.getLeft()!=null){
			return tree.getAction().perform(calc(tree.getLeft()),calc(tree.getRight()));
		}
		return tree.getAction().perform(tree.getLeftVal(),calc(tree.getRight()));
		
		
	}
	public static double cast(Complex c){
		return c.re();
	}

}
