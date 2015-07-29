import java.util.Vector;

public class Solver{
    SudokuGame game;
    Vector<Spot> unsetSpots;
    int[] possibleValues;
   
    int i=0;

    public Solver(SudokuGame G, Vector<Spot> u,int[] pv){

	  unsetSpots=u;
	  game=G;
	  possibleValues=pv;}


    public boolean solving(int i){
	System.out.println(i);
	int[] y=new int[2];
	if (i==this.unsetSpots.size()){
	   
	    return game.Check();}
	
	for(int j=0; j<this.possibleValues.length;j++){
	    System.out.println("for");
	    Spot x=this.unsetSpots.elementAt(i);
	     y=x.getArray();
	    game.add(y[0],y[1],possibleValues[j]);
	    boolean check=game.Check();
	    if (check){
		System.out.println("check");
		if (solving(i+1)){
			return true;
		    }
	    }}
	game.add(y[0],y[1],0);
	return false;}
}	