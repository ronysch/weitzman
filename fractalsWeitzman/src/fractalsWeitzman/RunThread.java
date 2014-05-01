/**
 * 
 */
package fractalsWeitzman;

/**
 * @author user
 *
 */
public class RunThread implements Runnable {
	
	private static int threadCount=0;
	private int threadSerial;
	private FractalCalc fractal;
	private boolean running;
	
	public RunThread( FractalCalc fractal) {
		super();
		threadCount++;
		this.threadSerial =threadCount;
		this.fractal = fractal;
	}
	   
	   public void run() {
	      
	      try {
	    	  running=true;
	    	  if(fractal.isRoot){
		 			fractal.rootDrawer(this.threadSerial);
		 		}
		 		else
		 			fractal.iteDrawer(this.threadSerial);
	            Thread.sleep(1);
	         
	     } catch (InterruptedException e) {
	         System.out.println("Thread " + " interrupted.");
	     }
	      running=false;
	   
	   }
	   
	  
	   public boolean isRunning() {
			return running;
		}

	
	
	
}
