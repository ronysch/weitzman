package fractalsWeitzman;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.SwingWorker;

public class ImageDrawer extends SwingWorker<BufferedImage, Void> {
	int iterations = 0;
	Picture picture=null;
	public ImageDrawer(Picture picture) {
		super();
		this.picture = picture;
	}

	@Override
	protected BufferedImage doInBackground() throws Exception {
	picture.draw();
	
	return null;
	}

	@Override
	protected void done() {
	picture.repaint();
	}

	}