package fractalsWeitzman;

public class HistoColor {
	
	public static int[] histograme=new int[Details.getIterationsNum()];
	public static void histogram() {
	
	
	for(int i=1;i<histograme.length;i++)
		histograme[i]+=histograme[i-1];
	
	}

}
