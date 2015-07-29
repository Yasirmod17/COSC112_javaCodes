import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class KNumberChangeListener implements ActionListener {

	private KenKenGame game;
    private int j;
    private int i;
    private JButton b;
    public KNumberChangeListener(JButton clicker,KenKenGame fr,int i,int j) {
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
		
	}
		
}
