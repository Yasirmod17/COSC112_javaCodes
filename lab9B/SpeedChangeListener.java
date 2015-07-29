import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Authors Mohammed Ibrahim and Lucas Zeller


public class SpeedChangeListener implements ActionListener {

	AnimateThread an;
	
	public SpeedChangeListener(AnimateThread animator) {
		an = animator;	
	}

	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Faster"))
			an.faster();
		if (action.equals("Slower"))
		    an.slower();
		
	}

		
}
