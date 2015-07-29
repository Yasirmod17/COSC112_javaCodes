import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class ButtonToMenuList implements ActionListener {

	private JButton myButton;
	JPopupMenu  menu;
    public int i;
    public int j;
	
    public ButtonToMenuList(SudokuGame Game, JButton clicker,int i,int j) {
		myButton = clicker;
    		
		// create a popup menu
		menu = new JPopupMenu("Menu");
		NumberChangeListener scl = new NumberChangeListener(myButton,Game,i,j);
		
        // create a menu item
		JMenuItem one = new JMenuItem("1");
		JMenuItem two=new JMenuItem("2");
		JMenuItem three=new JMenuItem("3");
		JMenuItem four=new JMenuItem("4");
	JMenuItem five=new JMenuItem("5");
	JMenuItem six=new JMenuItem("6");
	JMenuItem seven=new JMenuItem("7");
	JMenuItem eight=new JMenuItem("8");
	JMenuItem nine=new JMenuItem("9");
        // add the menu item to the menu
		menu.add(one);
		menu.add(two);
	menu.add(three);
	menu.add(four);
	menu.add(five);
	menu.add(six);
	menu.add(seven);
	menu.add(eight);
	menu.add(nine);
        // add a listener to the menu item
	one.addActionListener(scl);
		two.addActionListener(scl);
		three.addActionListener(scl);
	    four.addActionListener(scl);
	    five.addActionListener(scl);
	    six.addActionListener(scl);
	    seven.addActionListener(scl);
	    eight.addActionListener(scl);
	    nine.addActionListener(scl);
        
        menu.add(new JMenuItem("Never Mind"));        
	}

	public void actionPerformed(ActionEvent e) {
		
		menu.show(myButton,myButton.getWidth()/2,myButton.getHeight());
	}}
