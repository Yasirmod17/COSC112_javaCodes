import java.awt.event.*;
 //Authors Mohammed Ibrahim And Hugo Sanchez

public class DisplayPanelHandler implements ActionListener {

	
	private TheGame g;
	private Lab8Frame frame;
    //x=new JLabel(z;
	
    public DisplayPanelHandler(TheGame game1, Lab8Frame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
		g.otherSpot();
	       	if (g.getDoneMessage() == null)
		   
		frame.setMessage(g.getExtraMessage());
	
		frame.repaint();
	}

}
