package fractalsWeitzman;

public class Details {
	private static int iterationsNum=128;
	private static boolean root=true;

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
