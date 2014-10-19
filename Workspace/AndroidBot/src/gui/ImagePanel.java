package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	private String imageLocation;
	
    public ImagePanel(String imageLocation) {
    	this.imageLocation = imageLocation;
    	setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	try{
    		File file = new File(imageLocation);
    		BufferedImage image = ImageIO.read(file);
    		g.drawImage(image, 0/*x*/, 0/*y*/, null/*observer*/);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
