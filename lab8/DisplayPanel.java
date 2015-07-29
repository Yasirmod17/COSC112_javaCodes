import java.awt.*;

import javax.swing.JPanel;
 //Authors Mohammed Ibrahim And Hugo Sanchez

//
// JPanels are useful as components to draw on
//

public class DisplayPanel extends JPanel {
	
    private Color col;
    private Color col2 = makeRandomColor();

	public DisplayPanel() {
		// set size, otherwise Java will assume 0 x 0 and component may disappear
		setPreferredSize(new Dimension(300,300));
	}


	public void randomSet() {
	    
	     col = makeRandomColor();
	    // col=setColor(10,10,10);
	    
	}
/*
 * Called when java wants to draw the panel
 * 
 */
	public void paintComponent(Graphics g) {
	    int[] x =new int[]{20, 20 ,  0, 50 };
	    int[] y =new int[]{30,  70, 50, 50};

		g.setColor(col);
		
		g.drawString("Your First GUI Program",50,50);
		
		g.setColor(col2);
		//	g.drawLine(3,50,10,10);
		//	g.drawLine(53,50,43,10);
		//	g.fillArc(70,50,50,100,0,90);
		g.fill3DRect(60,70,30,20,true);
		g.fill3DRect(150,70,30,20,true);
	       	g.fillPolygon(x,y,4);
		g.fillArc(80,110,90,40,0,-180);

	}

// Math.random() returns a number between 0 and 1
	
	private Color makeRandomColor() {
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);

		Color col = new Color(red,green,blue);
		return col;
	}

}
