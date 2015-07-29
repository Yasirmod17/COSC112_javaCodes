import java.awt.*;
import javax.swing.*;
public class KenKenFrame extends JFrame {
    private String messages="Welcome";
    private JLabel message;
    private int boxes = 16;
    private JButton button=new JButton("Switch");
    private JButton[] buttons;
    private JButton check=new JButton("check");
    private JButton solve=new JButton("solve");
    public int counter=0;
    public  KenKenGame game1= new KenKenGame();
    public KenKenGame game2=new KenKenGame();
    public Container ct;
    public String[] labels={"1-","1-","2÷",null,null,null,"5+","7+","3-","2÷",null,null,null,null,"6x",null};
    public int count=0;
    public  KenKenFrame() {
	    this.setTitle("KenKen");
		this.setSize(new Dimension(400,400));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		Container ct = getContentPane();
		ct.setLayout(new GridLayout(6,0));
		GamePButtonToMenuList blist=new GamePButtonToMenuList(this,button);
	       	 KGameHandle lis=new KGameHandle(game1,this);
		     
		 KSolveListener slist=new KSolveListener(game2,this);
		
	       	 buttons=new JButton[boxes];

		 for (int i=0; i<4;i++){
		     for (int j=0;j<4;j++){
			 
			 if (game1.numberAtSpot(i,j)==0){
			    
			     JButton jtext=new JButton();//"Button"+(i+1)+(j+1));
			     // buttons[counter]=jtext;
			     jtext.setLayout(new GridLayout(6,0));
			     if (labels[count]!=null){
				 JLabel l1=new JLabel(labels[count]);
				jtext.add(l1);}
			     count++;
			     if((i==0 && j==0)||(i==1 && j==0)){
				     jtext.setBackground(Color.red);
				     }
			      if((i==0 && j==1)||(i==1 && j==1)){
				     jtext.setBackground(Color.yellow);}
			      if((i==0 && j==2)||(i==0 && j==3)){
				     jtext.setBackground(Color.magenta);}
			       if((i==2 && j==0)||(i==3 && j==0)){
				     jtext.setBackground(Color.white);}
			        if((i==2 && j==1)||(i==3 && j==1)){
				     jtext.setBackground(Color.blue);}
				 if((i==1 && j==2)||(i==2 && j==2)){
				     jtext.setBackground(Color.orange);}
				  if((i==1 && j==3)||(i==2 && j==3)){
				     jtext.setBackground(Color.green);}
				   if((i==3 && j==2)||(i==3 && j==3)){
				     jtext.setBackground(Color.pink);}
			     buttons[counter]=jtext;
			     counter++;
			 ct.add(jtext);
			 KenButToMenuListener btml=new KenButToMenuListener(game1,jtext,i,j);
			 jtext.addActionListener(btml);
			 }
			 else{
			     JButton jtext=new JButton(""+game1.numberAtSpot(i,j));
			     ct.add(jtext);
			     jtext.setEnabled(false);}
			
			 }
		     }
		 //	 SudokuPanel one=new SudokuPanel();
		 //ct.add(one);
            message=new JLabel(messages);
	    ct.add(message);
	    button.addActionListener(blist);
	    ct.add(button);
	     check.addActionListener(lis);
	    solve.addActionListener(slist);
	    ct.add(check);
	    ct.add(solve);
	    	this.setVisible(true);
	}
    public void repainting(KenKenGame g){

	for (int i=0;i<game1.unsetSpots.size();i++){
	    int[] but=game1.unsetSpots.elementAt(i).getArray();
	    //   System.out.println(buttons[1]);
	    buttons[i].setLabel(""+g.numberAtSpot(but[0],but[1]));}
}

 public void setMessage(String s){
	message.setText(s);
	//	this.setEnabled(false);
 
}




  
}
    





	       

