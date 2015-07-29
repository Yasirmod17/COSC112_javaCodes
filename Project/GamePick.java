import java.awt.*;
import javax.swing.*;

public class GamePick extends JFrame{
    public GamePick(){
	this.setSize(new Dimension(150,70));
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	Container ct = getContentPane();
	 
	 ct.setLayout(new FlowLayout());
	 JButton chose=new JButton("Chose Game");
	 GamePButtonToMenuList btml=new GamePButtonToMenuList(this,chose);
	 chose.addActionListener(btml);
	 ct.add(chose);
	 this.setVisible(true);}}