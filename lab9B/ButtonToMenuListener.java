import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
//Authors Mohammed Ibrahim and Lucas Zeller




public class ButtonToMenuListener implements ActionListener {

	private JButton myButton;
	JPopupMenu  menu;
	
	public ButtonToMenuListener(AnimateThread animator, JButton clicker) {
		myButton = clicker;
		
		// create a popup menu
		menu = new JPopupMenu("Menu");
		SpeedChangeListener scl = new SpeedChangeListener(animator);
		
        // create a menu item
		JMenuItem faster = new JMenuItem("Faster");
		JMenuItem slower=new JMenuItem("Slower");
        // add the menu item to the menu
		menu.add(slower);
		menu.add(faster);
        // add a listener to the menu item
		faster.addActionListener(scl);
		slower.addActionListener(scl);
        
        menu.add(new JMenuItem("Never Mind"));        
	}

	public void actionPerformed(ActionEvent e) {
		
		menu.show(myButton,myButton.getWidth(),myButton.getHeight());
	}


}
