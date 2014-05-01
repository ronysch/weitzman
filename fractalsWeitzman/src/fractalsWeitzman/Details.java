package fractalsWeitzman;

public class Details {
	private static int iterationsNum=200;
	private static double startX=-2.0,startY=1.6,endX=2.0,endY=-1.6;
	private static double stopIf=2;
	private static boolean root=true;
	private static boolean mandelbrot=true;
	private static boolean julia=false;
	private static boolean newton=false;
	private static boolean free=false;
	private static String realPart;
	private static String imaginaryPart;
	private static String expression;
	private static String diversion;
	private static String annotherExpression;
	
	
	

	public static String getRealPart() {
		return realPart;
	}

	public static void setRealPart(String realPart) {
		Details.realPart = realPart;
	}

	public static String getImaginaryPart() {
		return imaginaryPart;
	}

	public static void setImaginaryPart(String imaginaryPart) {
		Details.imaginaryPart = imaginaryPart;
	}

	public static String getExpression() {
		return expression;
	}

	public static void setExpression(String expression) {
		Details.expression = expression;
	}

	public static String getDiversion() {
		return diversion;
	}

	public static void setDiversion(String diversion) {
		Details.diversion = diversion;
	}

	public static String getAnnotherExpression() {
		return annotherExpression;
	}

	public static void setAnnotherExpression(String annotherExpression) {
		Details.annotherExpression = annotherExpression;
	}

	public static boolean isMandelbrot() {
		return mandelbrot;
	}

	public static void setMandelbrot(boolean mandelbrot) {
		Details.mandelbrot = mandelbrot;
	}

	public static boolean isJulia() {
		return julia;
	}

	public static void setJulia(boolean julia) {
		Details.julia = julia;
	}

	public static boolean isNewton() {
		return newton;
	}

	public static void setNewton(boolean newton) {
		Details.newton = newton;
	}

	public static boolean isFree() {
		return free;
	}

	public static void setFree(boolean free) {
		Details.free = free;
	}

	public static double getStopIf() {
		return stopIf;
	}

	public static void setStopIf(double stopIf) {
		Details.stopIf = stopIf;
	}

	public static double getStartX() {
		return startX;
	}

	public static void setStartX(double startX) {
		Details.startX = startX;
	}

	public static double getStartY() {
		return startY;
	}

	public static void setStartY(double startY) {
		Details.startY = startY;
	}
	public static double getEndX() {
		return endX;
	}

	public static void setEndX(double endX) {
		Details.endX = endX;
	}

	public static double getEndY() {
		return endY;
	}

	public static void setEndY(double endY) {
		Details.endY = endY;
	}

	public static boolean isRoot() {
		return root;
	}

	public static void setRoot(boolean root) {
		Details.root = root;
	}

	public static int getIterationsNum() {
		return iterationsNum;
	}

	public static void setIterationsNum(int iterationsNum) {
		Details.iterationsNum = iterationsNum;
	}

}
