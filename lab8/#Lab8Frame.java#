import java.awt.*;
import javax.swing.*;
 //Authors Mohammed Ibrahim And Hugo Sanchez

public class Lab8Frame extends JFrame {

	private JLabel message;
	private int buttonCount = 11;
	private JButton[] buttons;
    private Color c= new Color(30,50,70);
    public int counter=0;
	
	public void init() {

		// Exit when window is closed
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container ct = getContentPane();
	
		// set the layout manager to a grid 0 rows by 3 columns (0 means haowever many you need)
		ct.setLayout(new GridLayout(4,0));
		
		TheGame game1 = new TheGame(5);
		
		GameHandler hand = new GameHandler(game1,this);
		LossHandler lh = new LossHandler(game1, this);
		DisplayPanelHandler dph=new DisplayPanelHandler(game1,this);

		DisplayPanel panel = new DisplayPanel();
		
		buttons = new JButton[buttonCount];
		
		for (int i=0; i< buttonCount; i++) {
			
			// create a button  (DiamondButton is part of Lab 8
			//
		    if (i%2==0){
			 c = new Color(/*randomColorCoord(),randomColorCoord(),randomColorCoord()*/0,0,0);
		

		    }
		    else{
			 c=new Color(255,255,255);
		   
		    }
		    JButton jb = new DiamondButton(c);
			ct.add(jb);
			//	for (int i=0; i<buttonCount;i++){
			    
			// Adding an action listener -
			// when the button is pushed, the actionPerformed method of the
			// Listener is called
			//
				jb.addActionListener(dph);
			if (i%2==0) {
				jb.addActionListener(lh);
			}
			
			jb.addActionListener(hand);

			if (i==3) {
				panel.randomSet();
				ct.add(panel);
			}
			
			buttons[i] = jb;
		}
		message = new JLabel("Keep pressing buttons");
		ct.add(message);
	
		DisplayPanel two = new DisplayPanel();
		ct.add(two);
	}

	private int randomColorCoord() {
		return (int) (Math.random()*256);
	}
    public void setMessage(String x){
	message.setText(x);}
    
	public void setDoneMessage(String message1) {
		message.setText(message1);
		
		for (JButton b : buttons) {
			b.setEnabled(false);
		}
			
		
	}
}
