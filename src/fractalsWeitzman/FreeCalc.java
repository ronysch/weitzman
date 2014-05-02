package fractalsWeitzman;

public class FreeCalc extends FractalCalc {

	private ParsingTree exp;
	
	
	public FreeCalc(int width, int height, int iterations, double d , boolean isRoot,ParsingTree exp) {
		super(width, height, iterations,2.0,isRoot);
		this.exp=exp;
		
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
		TreeCalc expr=new TreeCalc(null);
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				int count=0;
				Complex z=new Complex(this.startX+(j*(this.width*this.zoomX)),this.startY-(i*(this.height*this.zoomY))),c=new Complex(z);
				expr.setCom(c);
				while(c.abs()>Details.getStopIf()){
					c=expr.calc(exp);
					
					expr.setCom(c);
					count++;
				}
				this.results[i][j]=new Complex(c);
				
			}
		
	}
	public void iteDrawer(int index){
		index%=7;//ensure that pices of the threads wont last
		TreeCalc expr=new TreeCalc(null);
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				
				int count=0;
				double abs=0;
				Complex z=new Complex(this.startX+(j*this.zoomX),this.startY-(i*this.zoomY)),c=new Complex(z);
				expr.setCom(c);
				while((count<this.iterations)&& (abs>Details.getStopIf())){
					c=expr.calc(exp);
					expr.setCom(c);
					abs=c.abs();
					
				}
				this.countResults[i][j]=count;
				
			}
		
	}
	
	private void start() {
		
		
		
		Thread[] threads=new Thread[7];
		for(int i=0;i<threads.length;i++)
			threads[i]=new Thread(new RunThread(this)); 
	
		for(int i=0;i<7;i++)
			threads[i].start();
		
		
			 for(int i=0;i<7;i++)
				try {
					threads[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			 
		 }
			 
			
		
	}


}
