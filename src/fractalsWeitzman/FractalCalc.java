/**
 * 
 */
package fractalsWeitzman;

/**
 * @author user
 *
 */
public abstract class FractalCalc {
	protected double zoomX,zoomY; //the zoom of the image
	protected double startX,startY,endX,endY; // the details of the corner
	protected int width,height; // the result matrix sizes
	protected int iterations; // how many iterations 
	protected double stopIf; //the if
	protected boolean isRoot;
	protected Complex[][] results; //for the root coloring mode
	protected int[][] countResults; //for the iterations mode
	public FractalCalc( int width,int height, int iterations, double stopIf,boolean isRoot) {
		super();
		this.startX =Details.getStartX();
		this.startY = Details.getStartY();
		this.endX =Details.getEndX();
		this.endY = Details.getEndY();
		this.zoomX= (Math.abs(endX-startX))/width;
		this.zoomY = (Math.abs(endY-startY))/height;
		this.width = width;
		this.height = height;
		this.iterations = iterations;
		this.stopIf = stopIf;
		this.isRoot=isRoot;
		System.out.println(startX);
	}
	public double getStartX() {
		return startX;
	}
	public void setStartX(double startX) {
		this.startX = startX;
	}
	public double getStartY() {
		return startY;
	}
	public void setStartY(double startY) {
		this.startY = startY;
	}
	public void closer() {
		
	
		this.startX*=0.75;
		this.startY*=0.75;
		this.endX*=0.75;
		this.endY*=0.75;
		Details.setStartX(this.startX);
		Details.setStartY(this.startY);
		Details.setEndX(this.endX);
		Details.setEndY(this.endY);
	}
	public void setIterations(int iterations) {
		this.iterations = iterations;
	}
	public boolean isRoot() {
		return isRoot;
	}
	public Complex[][] getResults() {
		return results;
	}
	public int[][] getCountResults() {
		return countResults;
	}
	public abstract void iteDrawer(int index);
	public abstract void rootDrawer(int index);
	public abstract Complex[][] drawRoot();
	public abstract int[][] drawIte();
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

}
