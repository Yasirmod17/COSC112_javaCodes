import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
public class SudokuFrame extends JFrame {
   
    private String messages="Welcome!";
    	private JLabel message;
	private int boxes = 81;
    private JButton[] buttons;
     private JButton button=new JButton("Switch");
    private JButton check=new JButton("check");
    private JButton solve=new JButton("solve");
     public int counter=0;
  
     public  SudokuGame game1= new SudokuGame();
    public SudokuGame game2=new SudokuGame();
    public Container ct;
    public SudokuFrame(){
	this.setTitle("Sudoku");
    
	//	public void init() {

		this.setSize(new Dimension(800,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		 ct = getContentPane();
		ct.setLayout(new GridLayout(10,0));
	
		
       		 GameHandle lis=new GameHandle(game1,this);
		 GamePButtonToMenuList blist=new GamePButtonToMenuList (this,button);
		 SolveListener slist=new SolveListener(game2,this);
		
		 Border raisedetched;
		 raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);

	       	 buttons=new JButton[boxes];
		

		 for (int i=0; i<9;i++){
		     for (int j=0;j<9;j++){
			 if (game1.numberAtSpot(i,j)==0){
			     JButton jtext=new JButton();//"Button"+(i+1)+(j+1));
			     buttons[counter]=jtext;
			      jtext.setBorder(raisedetched);
			     counter++;
			     paintBox(jtext,i,j);
			     
			 ct.add(jtext);
			 ButtonToMenuList btml=new ButtonToMenuList(game1,jtext,i,j);
			 jtext.addActionListener(btml);
			 }
			 else{
			     JButton jtext=new JButton(""+game1.numberAtSpot(i,j));
			     	jtext.setBorder(BorderFactory.createLineBorder(Color.red, 2));
			    
			      paintBox(jtext,i,j);
			      ct.add(jtext);
			     jtext.setEnabled(false);}
			 }
		     }
		 	 SudokuPanel one=new SudokuPanel();
		 // ct.add(one);
            message=new JLabel(messages);
            ct.add(message);
	     button.addActionListener(blist);
	     ct.add(button);
	    check.addActionListener(lis);
	    solve.addActionListener(slist);
	    ct.add(check);
	    ct.add(solve);
	    
	}
    public void paintBox(JButton p,int i,int j){
	if(i<3 && j<3){
	    p.setBackground(Color.yellow);}
	if(i<3 && j>2 && j<6){
	     p.setBackground(Color.white);}
	if(i<3 && j>5 && j<9){
	     p.setBackground(Color.yellow);}
	if (i>2 && i<6 && j<3){
	     p.setBackground(Color.white);}
	if (i>2 && i<6 && j>2 && j<6){
	     p.setBackground(Color.yellow);}
	if (i>2 && i<6 && j>5 && j<9){
	     p.setBackground(Color.white);}
       	if (i>5 && i<9 && j<3){
	     p.setBackground(Color.yellow);}
	if (i>5 && i<9 && j>2 && j<6){
	     p.setBackground(Color.white);}
	  if (i>5 && i<9 && j>5 && j<9){
	      p.setBackground(Color.yellow);}}
	

 public void setMessage(String s){
	message.setText(s);
	//	this.setEnabled(false);
 
}
    //  public void getI(){
    //	return i




    public void repainting(SudokuGame g){

	for (int i=0;i<game1.unsetSpots.size();i++){
	    int[] but=game1.unsetSpots.elementAt(i).getArray();
	    //  System.out.println(buttons[1]);
	    buttons[i].setLabel(""+g.numberAtSpot(but[0],but[1]));}
}
}
    





	       

