import java.util.Vector;

public  abstract class ConsGame{
   

    public boolean solving(int i,ConsGame game, Vector<Spot> unsetSpots,int[] possibleValues){
	//	System.out.println(i);
	//	System.out.println();
	int[] y=new int[2];
	if (i==unsetSpots.size()){
	   
	    return game.Check();}
	
	for(int j=0; j<possibleValues.length;j++){
	    // System.out.println("a");
	    Spot x=unsetSpots.elementAt(i);
	     y=x.getArray();
	    game.add(y[0],y[1],possibleValues[j]);
	    boolean check=game.Check();
	    if (check){
		//  	System.out.println("b");
		if (solving(i+1,game,unsetSpots,possibleValues)){
			return true;
		    }
	    }}
	game.add(y[0],y[1],0);
	return false;}



 public void add(int i,int j,int k){
     //  System.out.println(" null");
}


  public boolean Check(){
      return false;
		}
    public void writeBoard(){}
    
    public boolean zeroCounter(){
	return false;}
}	