import java.awt.event.*;

public class KGameHandle implements ActionListener {

	
	private KenKenGame g;
	private KenKenFrame frame;
	
	public KGameHandle(KenKenGame game1, KenKenFrame fr) {
		g = game1;
		frame = fr;
	}

    public void actionPerformed(ActionEvent e) {
	// g.add(i,j,e);
	    g.writeBoard();
	    g.Check();
	    if (g.zeroCounter()==true){
		if(g.getWin()==true){
		    frame.setMessage("you Win");}
		else{
		    frame.setMessage("you haven't won");}}
	    else{
		frame.setMessage("You're not done");}
		// ask for the Lab8Frame to be repainted
		frame.repaint();
	}

}
