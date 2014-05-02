package fractalsWeitzman;

public class Thread2 implements Runnable {

	public Thread2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		 try {
	    	  ImageDrawer.single.execute();
	            Thread.sleep(1);
	         
	     } catch (InterruptedException e) {
	         System.out.println("Thread " + " interrupted.");
	     }

	}

}
