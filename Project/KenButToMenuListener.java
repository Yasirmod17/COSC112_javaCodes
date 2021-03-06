import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class KenButToMenuListener implements ActionListener {

	private JButton myButton;
	JPopupMenu  menu;
    public int i;
    public int j;
	
    public KenButToMenuListener(KenKenGame Game, JButton clicker,int i,int j) {
		myButton = clicker;
    		
		// create a popup menu
		menu = new JPopupMenu("Menu");
		KNumberChangeListener scl = new KNumberChangeListener(myButton,Game,i,j);
		
        // create a menu item
		JMenuItem one = new JMenuItem("1");
		JMenuItem two=new JMenuItem("2");
		JMenuItem three=new JMenuItem("3");
		JMenuItem four=new JMenuItem("4");

        // add the menu item to the menu
		menu.add(one);
		menu.add(two);
	menu.add(three);
	menu.add(four);

        // add a listener to the menu item
	one.addActionListener(scl);
		two.addActionListener(scl);
		three.addActionListener(scl);
	    four.addActionListener(scl);
	   
        
        menu.add(new JMenuItem("Never Mind"));        
	}

	public void actionPerformed(ActionEvent e) {
		
		menu.show(myButton,myButton.getWidth()/2,myButton.getHeight());
	}}
