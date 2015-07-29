import java.awt.*;
import javax.swing.*;
public class SixPackFrame extends JFrame {
   
    private String messages="Welcome!";
    	private JLabel message;
	private int boxes = 48;
    private JButton[] buttons;
    private JButton button=new JButton("Switch");
    private JButton check=new JButton("check");
    private JButton solve=new JButton("solve");
     public int counter=0;
    
     public  SixPackGame  game1= new SixPackGame();
    public SixPackGame game2=new SixPackGame();
    public Container ct;
    public SixPackFrame(){
	this.setTitle("SixPack");
    
	//	public void init() {

	this.setSize(new Dimension(1100,700));
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  Container ct = getContentPane();
	   ct.setLayout(new GridLayout(9,0));
       	    SPackGameHandle lis=new SPackGameHandle(game1,this);
	   GamePButtonToMenuList blist=new GamePButtonToMenuList (this,button);
	    SPackSolveListener slist=new SPackSolveListener(game2,this);	
	    buttons=new JButton[boxes];

		 for (int i=0; i<8;i++){
		     for (int j=0;j<9;j++){
			 if (game1.numberAtSpot(i,j)==0){
			     JButton jtext=new JButton();//"Button"+(i+1)+(j+1));
			     buttons[counter]=jtext;
			     counter++;
			    
			 ct.add(jtext);
			 	SPackButToMenuListener btml=new SPackButToMenuListener(game1,jtext,i,j);
			 	 jtext.addActionListener(btml);
			 }
			 else if(game1.numberAtSpot(i,j)>0 && game1.numberAtSpot(i,j)<10){
			     JButton jtext=new JButton(""+game1.numberAtSpot(i,j));
			     ct.add(jtext);
			     jtext.setEnabled(false);}
			 else{
			     JButton jtext=new JButton("");
			     jtext.setBackground(Color.black);
			     ct.add(jtext);
			     jtext.setEnabled(false);}
		
			 }
		     }
		 //	  SPackPanel one=new SPackPanel();
		 //ct.add(one);
            message=new JLabel(messages);
            ct.add(message);
	     button.addActionListener(blist);
	     ct.add(button);
	    check.addActionListener(lis);
	     solve.addActionListener(slist);
	    ct.add(check);
	    ct.add(solve);
	}
   

 public void setMessage(String s){
	message.setText(s);
 
}
    //  public void getI(){
    //	return i




     public void repainting(SixPackGame g){

	for (int i=0;i<game1.unsetSpots.size();i++){
	    int[] but=game1.unsetSpots.elementAt(i).getArray();
	    //   System.out.println(buttons[1]);
	    buttons[i].setLabel(""+g.numberAtSpot(but[0],but[1]));}
	    }
}
    





	       

