
public class Game {
    //Author: Ibrahim Mohammed Yasir


    private int guests;
    private int skipping;
    private CS112Queue GameQueue;
    private int Counter;
   
	public Game(int g, int s) {
	    guests = g;
	    skipping = s;
	     GameQueue=new CS112Queue(guests);
	    
	    for (int i=0;i<guests;i++){
		 GameQueue.add(i+1);
	  
	     } 
	    
	}
  
    public boolean checker(){
	int num=0;
	int[] numLeft=GameQueue.getQueue();
	for(int i=0;i<numLeft.length;i++){
	    if (numLeft[i]!=0){
		num+=1;}}
	if (num==1){
	    return true;
	}
	else{
	    return false;}}
   

    	public int playGame() {
      
	    for(int i=0;checker()!=true;i++){
		    if (i%skipping==0){
			System.out.println(GameQueue.remove()+ " is Sauced");
		      
		    }
		    else{
			GameQueue.add(GameQueue.remove());
		    }}
	     int[] left=GameQueue.getQueue();
	     for(int j=0; j<left.length;j++){
		 if (left[j]!=0){
		    
		      return left[j];
		 }}
	      return 0;
	}

		
		











    //	    if (checker()==true){
    //		for (int i=0;i<theQ.length;i++){
    //		    if (theQ[i]!=0){
    //			return theQ[i];}}}
    //	    else{
    //		while (checker()!=true){
    //		    int skipper=2;
		    // for(int i=front 
    //	}
	
	
	
		    }
