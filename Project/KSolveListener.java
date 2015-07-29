import java.awt.event.*;

public class KSolveListener implements ActionListener {

    int[] possibleV={1,2,3,4};
	private KenKenGame g;
	private KenKenFrame frame;
	
    public KSolveListener(KenKenGame game1, KenKenFrame fr) {
		g = game1;
		frame = fr;
	}

    public void actionPerformed(ActionEvent e) {
	// g.add(i,j,e);
	    g.writeBoard();
	    // if (g.win()!=true)
	       		frame.setMessage("I will solve it");
			// solve=new Solver(g,g.unsetSpots,possibleV);
			g.solving(0,g,g.unsetSpots,possibleV);
			System.out.println("this is the solution");
			g.writeBoard();
		       	frame.repainting(g);
		// ask for the Lab8Frame to be repainted
		frame.repaint();
    }}