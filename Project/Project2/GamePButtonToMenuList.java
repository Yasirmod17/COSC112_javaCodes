import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class GamePButtonToMenuList implements ActionListener {

	private JButton myButton;
    	JPopupMenu  menu;
    // public int i;
    // public int j;
	
    public GamePButtonToMenuList(JFrame p,JButton clicker) {
		myButton = clicker;
    		
		// create a popup menu
		menu = new JPopupMenu("Menu");
		GameChangeListener scl = new GameChangeListener(myButton,p);
		
        // create a menu item
		JMenuItem Sudoku = new JMenuItem("Sudoku");
		JMenuItem KenKen=new JMenuItem("KenKen");
		JMenuItem SixPack=new JMenuItem("SixPack");
	
		menu.add(Sudoku);
		menu.add(KenKen);
	menu.add(SixPack);

        // add a listener to the menu item
	Sudoku.addActionListener(scl);
		KenKen.addActionListener(scl);
		SixPack.addActionListener(scl);
	  
        menu.add(new JMenuItem("Don'tworry"));        
	}

	public void actionPerformed(ActionEvent e) {
		
		menu.show(myButton,myButton.getWidth()/2,myButton.getHeight());
	}}
