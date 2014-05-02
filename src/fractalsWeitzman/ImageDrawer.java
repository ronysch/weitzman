package fractalsWeitzman;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.SwingWorker;

public class ImageDrawer extends SwingWorker<BufferedImage, Void> {
	int iterations = 0;
	Picture picture=null;
	public static ImageDrawer single=new ImageDrawer(null);
	private ImageDrawer(Picture picture) {
		super();
		this.picture = picture;
	}

	public static Picture getPicture() {
		return single.picture;
	}

	public static void setPicture(Picture picture) {
		single.picture = picture;
	}

	@Override
	protected BufferedImage doInBackground() throws Exception {
		
	picture.draw();
	single=new ImageDrawer(null);
	return null;
	}

	@Override
	protected void done() {
	picture.repaint();
	}

	}