package fractalsWeitzman;

public class JuliaCalc extends FractalCalc {
	private Complex cons;

	public JuliaCalc(int width, int height, int iterations, double stopIf,
			boolean isRoot,Complex cons) {
		
		super(width, height, iterations, stopIf, isRoot);
		this.cons=new Complex(cons);
		// TODO Auto-generated constructor stub
	}
	
	public Complex[][] drawRoot(){
		this.results=new Complex[this.height][this.width];
		this.start();
		return this.results;
	}
	public int[][] drawIte(){
		 this.countResults=new int[this.height][this.width];
		 this.start();
		 return this.countResults;
	}
	
	public void rootDrawer(int index){
		index%=7;//ensure that pices of the threads wont last
		
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				int count=0;
				Complex z=new Complex(this.startX+(j*(this.width*this.zoomX)),this.startY-(i*(this.height*this.zoomY))),c=new Complex(z);
				
			
				while(c.abs()<this.stopIf){
					c=cons.plus(c.times(c));
					count++;
				}
				this.results[i][j]=new Complex(c);
				
			}
		
	}
	public void iteDrawer(int index){
		
		index%=7;//ensure that pices of the threads wont last
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				
				int count=0;
				double abs=0;
				Complex z=new Complex(this.startX+(j*this.zoomX),this.startY-(i*this.zoomY)),c=new Complex(z);
				
				while((count<this.iterations)&& (abs<Details.getStopIf())){
					
					c=cons.plus(c.times(c));
					count++;
					abs=c.abs();
					
				}
				this.countResults[i][j]=count;
				
			}
		
	}
	
	private void start() {
		
		
		
		Thread[] threads=new Thread[7];
		for(int i=0;i<threads.length;i++)
			threads[i]=new Thread(new RunThread(this)); 
	
		for(int i=0;i<threads.length;i++)
			threads[i].start();
		
		
			 for(int i=0;i<threads.length;i++)
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			 
		 }
			 
			// for(int i=0;i<7;i++)
					//threads[i].destroy();;
		
	}
	public void setCons(Complex cons) {
		this.cons = cons;
	}

}
