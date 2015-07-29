import java.awt.event.*;

public class ButtonHandle implements ActionListener {

	
	private SudokuGame g;
	private SudokuFrame frame;
	
	public ButtonHandle(SudokuGame game1, SudokuFrame fr) {
		g = game1;
		frame = fr;
	}

	public void actionPerformed(ActionEvent e) {
	    // g.add(3,3,5);
	    // if (g.win()!=true)
				frame.setMessage("loser");
		// ask for the Lab8Frame to be repainted
		frame.repaint();
	}

}
