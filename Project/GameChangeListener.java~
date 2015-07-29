import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class GamePNumberChangeListener implements ActionListener {

	private JFrame frame;
    //  private int j;
    // private int i;
    private JButton b;
    public GamePNumberChangeListener(JButton clicker,GamePick p) {
		frame = p;
		this.b=clicker;
	}

	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Sudoku")){
		    frame.dispose();
		    SudokuFrame yes=new SudokuFrame();
		}
		if (action.equals("KenKen")){
		    frame.dispose();
		    KenKenFrame yes=new KenKenFrame();
		}
		if(action.equals("SixPack")){
		    frame.dispose();
		    SixPackFrame yes=new SixPackFrame();
			}
	
	
	
		
	}
		
}
