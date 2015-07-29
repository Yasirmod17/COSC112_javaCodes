import java.awt.*;

import javax.swing.*;
import javax.swing.ImageIcon.*;
//Authors Mohammed Ibrahim and Lucas Zeller




public class AnimationExample extends JFrame {

	public void init() {

		Container contentPane = this.getContentPane();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane.setLayout(new FlowLayout());

		FunPanel cp = new FunPanel();
		contentPane.add(cp);
		JLabel ll=new JLabel("Spinning Ring Animation");
		contentPane.add(ll);

		AnimateThread animator = new AnimateThread(cp,200);

		JButton jb = new JButton("Start Animation");
		ControlAnimation st = new ControlAnimation(jb, animator);

		contentPane.add(jb);
		jb.addActionListener(st);
       		JButton changeColor = new JButton("Change Colors"); 
		contentPane.add(changeColor); 
		changeColor.addActionListener (cp); 


		JButton changer = new JButton("ChangeSpeed");
		
		ButtonToMenuListener fl = new ButtonToMenuListener(animator,changer);

		contentPane.add(changer);
		changer.addActionListener(fl);

		}

	public static void main(String[] args) {

		AnimationExample thisOne = new AnimationExample();
		thisOne.init();

		thisOne.pack();
		thisOne.setVisible(true);
		thisOne.setSize(new Dimension(500,500));
	}
}
