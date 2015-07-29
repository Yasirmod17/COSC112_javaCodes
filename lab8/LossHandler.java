import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LossHandler implements ActionListener {

	private TheGame g;
	private Lab8Frame frame;
	
	public LossHandler(TheGame game1,Lab8Frame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
		g.badSpot();
		if (g.getDoneMessage() != null)
			frame.setDoneMessage(g.getDoneMessage());
		frame.repaint();
	}

}
