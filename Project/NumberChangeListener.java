import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class NumberChangeListener implements ActionListener {

	private SudokuGame game;
    private int j;
    private int i;
    private JButton b;
    public NumberChangeListener(JButton clicker,SudokuGame fr,int i,int j) {
		game = fr;
		this.j=j;
		this.i=i;
		this.b=clicker;
	}

	
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("1")){
		    game.add(this.i,this.j,1);
		    b.setLabel("1");
		}
		if (action.equals("2")){
		    game.add(this.i,this.j,2);
		    b.setLabel("2");
		}
		if(action.equals("3")){
		    game.add(this.i,this.j,3);
		    b.setLabel("3");
			}
		if (action.equals("4")){
		    game.add(this.i,this.j,4);
		    b.setLabel("4");
		}
		if (action.equals("5")){
		    game.add(this.i,this.j,5);
		    b.setLabel("5");
		}
		if(action.equals("6")){
		    game.add(this.i,this.j,6);
		    b.setLabel("6");
		}
		if (action.equals("7")){
		    game.add(this.i,this.j,7);
		    b.setLabel("7");
		}
		if (action.equals("8")){
		    game.add(this.i,this.j,8);
		    b.setLabel("8");
		}
		if (action.equals("9")){
		    game.add(this.i,this.j,9);
		    b.setLabel("9");
		}
		
	}
		
}
