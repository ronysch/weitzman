package fractalsWeitzman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.SwingWorker;



public class Picture extends JPanel {
	private Color color;
	BufferedImage image = null;
	Graphics graphics;
	FractalCalc fractal;
	public Picture(){
		super();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		if (image == null)
		g.fillRect(0, 0, getWidth(), getHeight());	
		else
		g.drawImage(image, 0, 0, null);
		}
	public void draw()  {
		this.fractal=new MandelCalc(this.getWidth(),this.getHeight(),Details.getIterationsNum(), 2.0,Details.isRoot());
		this.image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
		this.graphics=this.image.getGraphics();
		this.fractal.setRoot(Details.isRoot());
		Complex[][] pic1 = new Complex[this.getHeight()][this.getWidth()];
		int[][] pic2 = null;
		if(fractal.isRoot())
			pic1=fractal.drawRoot();
		else
			pic2=fractal.drawIte();
		 
		
		float f=0;
		for(int i=0;i<pic1.length;i++){
			
			for(int j=0;j<pic1[0].length;j++){
				if(fractal.isRoot()){
					f=0;
					if(pic1[j][i]!=null)
						f=(float) pic1[j][i].abs();
				
						color = Color.getHSBColor(f, 1F, 1F);
				//if ( pic[j][i]==Details.getIterationsNum()) {
					//color = Color.black;
				//	}
				graphics.setColor(color);
				graphics.drawRect(i, j, 0, 0);
				}
				else{
				
			
					color = Color.getHSBColor((float)pic2[j][i]/(float)Details.getIterationsNum(), 1F, 1F);
			if ( pic2[j][i]==Details.getIterationsNum()) {
				color = Color.black;
				}
			graphics.setColor(color);
			graphics.drawRect(i, j, 0, 0);
				}
			}
	}
		}

}
/*
 * for(int k=0;k<pic.length;k++)
		{
			System.out.println();
			for(int l=0;l<pic[0].length;l++)
				System.out.print(pic[k][l]+", ");
		}
 */

