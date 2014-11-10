package gui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements MouseListener{
	private String imageLocation;
	private IMainUI mainUI;
	
	private int localWidth = 400;
	private int localHeight = 580;
	private int deviceWidth;
	private int deviceHeight;
	
	//For Swipe
	private int xStart;
	private int yStart;
	
    public ImagePanel(String imageLocation, IMainUI mainUI) {
    	this.mainUI = mainUI;
    	this.imageLocation = imageLocation;
    	setOpaque(false);
    	addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	try{
    		File file = new File(imageLocation);
    		BufferedImage image = ImageIO.read(file);
    		deviceWidth = image.getWidth();
    		deviceHeight = image.getHeight();
    		g.drawImage(image, 0/*x start dest*/, 0/*y start dest*/, localWidth/*x end dest*/, localHeight/*x end dest*/,
    				0/*x start source*/, 0/*y start source*/, deviceWidth, deviceHeight,
    				null/*observer*/);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    public void setImageLocation(String imageLocation){
    	this.imageLocation = imageLocation;
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		mainUI.getMainClass().getMainControl().addTapEvent(x, y, localWidth, localHeight,
				deviceWidth, deviceHeight);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		xStart = e.getX();
		yStart = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		mainUI.getMainClass().getMainControl().addSwipeEvent(xStart, yStart, x, y,
				localWidth, localHeight, deviceWidth, deviceHeight);
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}
