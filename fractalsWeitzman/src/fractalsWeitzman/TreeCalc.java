/**
 * 
 */
package fractalsWeitzman;

/**
 * @author פרינץ
 *
 */
public class TreeCalc {
	public  Complex com;
	public  Complex calc(ParsingTree tree){
		if(tree.getAction()==null)
			return new Complex(tree.getLeftVal());
		if(tree.getLeft()!=null){
			return new Complex(tree.getAction().perform(calc(tree.getLeft()),calc(tree.getRight())));
		}
		if(tree.isVal()){
			if(tree.getRight()!=null)
		return tree.getAction().perform(tree.getLeftVal(),calc(tree.getRight()));
			return new Complex(tree.getLeftVal());
		}
		return new Complex( tree.getAction().perform(com,calc(tree.getRight())));
		
	}
	public void setCom(Complex com) {
		this.com = com;
	}
	public TreeCalc(Complex com) {
		super();
		this.com = com;
	}
	
	public static double cast(Complex c){
		return c.re();
	}

}
