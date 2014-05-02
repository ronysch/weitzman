package fractalsWeitzman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.SwingWorker;



public class Picture extends JPanel implements ActionListener,MouseWheelListener,MouseMotionListener,MouseListener {
	private Color color;
	BufferedImage image = null;
	Graphics graphics;
	FractalCalc fractal;
	private int startX,startY;//for the mouselisteners
	private boolean pressed=false;
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
		if(Details.isMandelbrot())
			this.fractal=new MandelCalc(this.getWidth(),this.getHeight(),Details.getIterationsNum(), 2.0,Details.isRoot());
		else
			if(Details.isJulia())
				this.fractal=new JuliaCalc(this.getWidth(),this.getHeight(),Details.getIterationsNum(), 2.0,Details.isRoot(),new Complex(Double.parseDouble(Details.getRealPart()),Double.parseDouble(Details.getImaginaryPart())));
			else
				if(Details.isNewton())
					this.fractal=new NewtonCalc(this.getWidth(),this.getHeight(),Details.getIterationsNum(),2.0, Details.isRoot(), Parser.createTree(Details.getExpression(), 0),Parser.createTree(Details.getDiversion(),0));
				else
					this.fractal=new FreeCalc(this.getWidth(),this.getHeight(),Details.getIterationsNum(),2.0, Details.isRoot(), Parser.createTree(Details.getAnnotherExpression(), 0));
		this.image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
		this.graphics=this.image.getGraphics();
		this.fractal.setRoot(Details.isRoot());
		Complex[][] pic1 = new Complex[this.getHeight()][this.getWidth()];
		int[][] pic2 = null;
		if(fractal.isRoot())
			pic1=fractal.drawRoot();
		else
			pic2=fractal.drawIte();
		 
		if(fractal.isRoot()){
		float f=0;
		for(int i=0;i<pic1.length;i++){
			
			for(int j=0;j<pic1[0].length;j++){
				
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
		}
		}
		else{
					int[] histogram=HistoColor.histograme;
					for(int i=0;i<pic1.length;i++)
						for(int j=0;j<pic1[0].length;j++){
							if(pic2[j][i]==Details.getIterationsNum())
								color=Color.BLACK;
							else
							color = Color.getHSBColor((float)histogram[pic2[j][i]]/histogram[Details.getIterationsNum()-1], 1F, 1F);
							graphics.setColor(color);
							graphics.drawRect(i, j, 0, 0);
					}
			
	}
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageDrawer.setPicture(this);
		
		ImageDrawer.single.execute();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		this.fractal.closer();
		ImageDrawer.setPicture(this);
		
		ImageDrawer.single.execute();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		if(pressed){
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		pressed=true;
		this.startX=arg0.getX();
		this.startY=arg0.getY();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
		Details.setStartX(Details.getStartX()-(this.startX-arg0.getX())*((Math.abs(Details.getEndX()-Details.getStartX()))/(this.getWidth())));
		Details.setStartY(Details.getStartY()-(this.startY-arg0.getY())*((Math.abs(Details.getEndY()-Details.getStartY()))/(this.getHeight())));
		Details.setEndX(Details.getEndX()-(this.startX-arg0.getX())*((Math.abs(Details.getEndX()-Details.getStartX()))/(this.getWidth())));
		Details.setEndY(Details.getEndY()-(this.startY-arg0.getY())*((Math.abs(Details.getEndY()-Details.getStartY()))/(this.getHeight())));
	
	System.out.println(this.startX-arg0.getX());
	ImageDrawer.setPicture(this);
	
		ImageDrawer.single.execute();
		// TODO Auto-generated method stub
		System.out.println(this.startX-arg0.getX());
		
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

