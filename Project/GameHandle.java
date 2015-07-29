import java.awt.event.*;

public class GameHandle implements ActionListener {

	
	private SudokuGame g;
	private SudokuFrame frame;
	
	public GameHandle(SudokuGame game1, SudokuFrame fr) {
		g = game1;
		frame = fr;
	}

    public void actionPerformed(ActionEvent e) {
	// g.add(i,j,e);
	    g.writeBoard();
	    //  g.zeros();
	   
	    g.Check();
	  if (g.zeroCounter()==true){
	    if(g.getWin()==true){
		frame.setMessage("you Win");}
	    else{
		frame.setMessage("you haven't won");}}
	  else{
	      frame.setMessage("you're not done");}
		// ask for the Lab8Frame to be repainted
		frame.repaint();
	}

}
