/**
 * 
 */
package fractalsWeitzman;

/**
 * @author �����
 *
 */
public class test {
	public static void main(String[] args) {
		String st="3.0+2.0^3.0*4.0+5.0";
		ParsingTree t=Parser.createTree(st,0);
		
			System.out.println(TreeCalc.calc(t));
	}

}
