 //Authors Mohammed Ibrahim And Hugo Sanchez
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DiamondButton extends JButton implements ActionListener {
	
	private Color c = Color.BLUE;
	
	public DiamondButton(Color c) {
		this.c = c;
		this.addActionListener(this);
	}
	
	/*  
	 * The method paintComponent(Graphics g) is called when
	 * java needs to draw the component
	 */
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		int[] xPoints = new int[4];
		int[] yPoints = new int[4];
		
		xPoints[0] = 75;
		yPoints[0] = 60;
		xPoints[1] = 100;
		yPoints[1] = 10;
		xPoints[2] = 125;
		yPoints[2] = 60;
		xPoints[3] = 100;
		yPoints[3] = 110;
		g.setColor(c);
		g.fillPolygon(xPoints, yPoints, xPoints.length);
		
	}

	public void beenHere() {
		c = Color.gray;
		ImageIcon x = new ImageIcon("barT.png");
		// setIcon adds an image to a button
		this.setIcon(x);
		this.setEnabled(false);		
	}
	
	public void actionPerformed(ActionEvent e) {
		beenHere();
	}
	
}
