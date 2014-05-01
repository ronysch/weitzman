package fractalsWeitzman;

public class NewtonCalc extends FractalCalc {
	private ParsingTree func;
	private ParsingTree deriv;
	
	public NewtonCalc(int width, int height, int iterations, double d , boolean isRoot,ParsingTree func,ParsingTree deriv) {
		super(width, height, iterations,2.0,isRoot);
		this.func=func;
		this.deriv=deriv;
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
		System.out.println("start");
		index%=7;//ensure that pices of the threads wont last
		TreeCalc fu=new TreeCalc(null),de=new TreeCalc(null);
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				int count=0;
				Complex z=new Complex(this.startX+(j*(this.width*this.zoomX)),this.startY-(i*(this.height*this.zoomY))),c=new Complex(z);
				fu.setCom(c);
				de.setCom(c);
				while(c.abs()>Details.getStopIf()){
					c=c.minus(fu.calc(func).divides(de.calc(deriv)));
					fu.setCom(c);
					de.setCom(c);
					count++;
				}
				this.results[i][j]=new Complex(c);
				
			}
		
	}
	public void iteDrawer(int index){
		if(func!=null)
		System.out.println("working");
		index%=7;//ensure that pices of the threads wont last
		TreeCalc fu=new TreeCalc(null),de=new TreeCalc(null);
		for(int i=0;i<height;i++)
			for(int j=index;j<width;j+=7)
			{
				
				int count=0;
				double abs=0;
				Complex z=new Complex(this.startX+(j*this.zoomX),this.startY-(i*this.zoomY)),c=new Complex(z);
				fu.setCom(c);
				de.setCom(c);
				abs=z.abs();
				while((count<this.iterations)&& (abs>Details.getStopIf())){
					c=c.minus(fu.calc(func).divides(de.calc(deriv)));
					fu.setCom(c);
					de.setCom(c);
					abs=c.abs();
					System.out.println(c.re());
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
