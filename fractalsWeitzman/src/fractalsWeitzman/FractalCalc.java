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
	protected double startX,startY; // the details of the corner
	protected int width,height; // the result matrix sizes
	protected int iterations; // how many iterations 
	protected double stopIf; //the if
	protected boolean isRoot;
	protected Complex[][] results; //for the root coloring mode
	protected int[][] countResults; //for the iterations mode
	public FractalCalc( int width,int height, int iterations, double stopIf,boolean isRoot) {
		super();
		this.startX = -2.0;
		this.startY = 1.6;
		this.zoomX= (Math.abs(startX*2))/width;
		this.zoomY = (startY*2)/height;
		this.width = width;
		this.height = height;
		this.iterations = iterations;
		this.stopIf = stopIf;
		this.isRoot=isRoot;
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
		this.zoomX = (zoomX*4)/3;
		this.zoomY = (zoomY*4)/3;
		this.startX+=(this.width/2)*this.width/(this.zoomX);
		this.startY+=(this.width/2)*this.height/(this.zoomY);
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
