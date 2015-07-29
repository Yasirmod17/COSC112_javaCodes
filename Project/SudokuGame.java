import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
public class SudokuGame extends ConsGame{
    private boolean win=false;
    public int counter=0;
    private int[][] theGame;
   public  Vector<Spot> unsetSpots=new Vector<Spot>();
    public int position=0;
    public int[] possibleV={1,2,3,4,5,6,7,8,9};
    public int count=0;
    public int counts=0;
 public SudokuGame(){
	theGame=new int[9][9];
		labelGame();
		numberOfUnsetSpots();
}

    public void labelGame(){


	    File f=new File("numbers.txt");
	    Scanner sc=null;
	    try{
		sc=new Scanner(f);
	    }
	    catch (FileNotFoundException e){
		e.printStackTrace();
		System.out.println("File   doesn't exist");
		System.exit(1);}
	  
	    int[] number=new int[81];
	    while (sc.hasNext()!=false && count<81){
		 int numbers=sc.nextInt();
		 number[count]=numbers;
		 count++;}
		 for (int i=0;i<9;i++){
		    for (int j=0; j<9;j++){
			if (counts!=number.length-1){
			   
			    theGame[i][j]=number[counts];}
			counts++;} }  
		 //	 this.writeBoard();}
    }	
    public boolean zeroCounter(){
       	for (int i=0; i<9;i++){
	    for (int j=0; j<9;j++){
		if (theGame[i][j]==0){
		    return false;}}}
	return true;}
    public void numberOfUnsetSpots(){
       	for (int i=0; i<9;i++){
	    for (int j=0; j<9;j++){
		if (theGame[i][j]==0){
		   unsetSpots.add(new Spot(i,j));
		    counter++;}}}
	//	return counter;
}
    public int numberAtSpot(int i,int j){
	return theGame[i][j];}
   
  
    public int length(){
	return theGame.length;

    }

    public void add(int i,int j,int k){
	theGame[i][j]=k;

}

    public void delete(int i,int j){
	theGame[i][j]=0;}

    public void writeBoard(){
	for (int i=0; i<theGame.length;i++){
	    for(int j=0; j<9;j++){
		System.out.print(theGame[i][j]+" ");}
	       System.out.println();
	    // System.out.println("done");
	}
    }
    public boolean arrayCheck(int[] n, int i){
	int counter=0;
	for(int k=0;k<9;k++){
	    if (n[k]==i){
		counter+=1;
		if (counter>1){
		    return false;}}
	}return true;}

	
    public boolean getWin(){
	this.Check();
	return this.win;
    }
   
    public boolean checkHorizontal(){
	for (int i=0; i<9; i++){
	    Vector numbers =  new Vector<Integer>();
	    for (int j=0;j<9;j++){
		if (theGame[i][j]!=0){
		    if (numbers.contains(theGame[i][j])){//||numbers.contains(0)){
			// System.out.println(theGame[i][j]);
			return false;}
		    else{
		   numbers.add(theGame[i][j]);
		  
		   }}
		
	    
	    }}//this.writeBoard();
	// System.out.println();
return true;}

    public boolean checkVertical(){
       	for (int i=0; i<9; i++){
      	Vector numbers =  new Vector<Integer>();
	    for (int j=0;j<9;j++){
		if (theGame[j][i]!=0){
		if (numbers.contains(theGame[j][i])){//|| numbers.contains(0)){
			return false;}
	       else{
		   numbers.add(theGame[j][i]);}}
		
	    
	
	    }}return true;}

	
    public boolean Check(){
	if(checkVertical()==true){
	    if( checkHorizontal()==true){
		//	return true;
			if( boxConstraint()==true){
		    //	      System.out.println("true");
		 this.win=true;
		 return true;
		}
		else{return false;}}
	    	else{return false;}}
	else{
	    return false;}
	}

    public boolean boxConstraint(){
	//	System.out.println("bk");
	 Vector box1 =  new Vector<Integer>();
	for (int i=0; i<3;i++){
	    for (int j=0; j<3;j++){
		if (theGame[i][j]!=0){
	       	if (box1.contains(theGame[i][j])){
		    //   System.out.println("false");
			return false;}
	       else{
		   box1.add(theGame[i][j]);}}
	    }}
	Vector box2 =  new Vector<Integer>();
    	for (int i=3; i<6;i++){
       	    for (int j=0; j<3;j++){
		if (theGame[i][j]!=0){
	       	if (box2.contains(theGame[i][j])){
		    //System.out.println("false");
			return false;}
	       else{
		   box2.add(theGame[i][j]);}}
	    }}
	 Vector box3 =  new Vector<Integer>();
       	for (int i=6; i<9;i++){
	    for (int j=0; j<3;j++){
		if (theGame[i][j]!=0){
	       	if (box3.contains(theGame[i][j])){
		    // System.out.println("false");
			return false;}
	       else{
		   box3.add(theGame[i][j]);}}
	    }}
	 Vector box4 =  new Vector<Integer>();
	for (int i=0; i<3;i++){
	    for (int j=3; j<6;j++){
		if (theGame[i][j]!=0){
	       	if (box4.contains(theGame[i][j])){
		    // System.out.println("false");
			return false;}
	       else{
		   box4.add(theGame[i][j]);}}
	    }}
	 Vector box5 =  new Vector<Integer>();
	for (int i=3; i<6;i++){
	    for (int j=3; j<6;j++){
		if (theGame[i][j]!=0){
	       	if (box5.contains(theGame[i][j])){
		    //System.out.println("false");
			return false;}
	       else{
		   box5.add(theGame[i][j]);}}
	    }}
	Vector box6 =  new Vector<Integer>();
       	for (int i=6; i<9;i++){
	    for (int j=3; j<6;j++){
		if (theGame[i][j]!=0){
	       	if (box6.contains(theGame[i][j])){
		    //System.out.println("false");
			return false;}
	       else{
		   box6.add(theGame[i][j]);}}
	    }}
	 Vector box7 =  new Vector<Integer>();
	for (int i=0; i<3;i++){
	    for (int j=6; j<9;j++){
		if (theGame[i][j]!=0){
	       	if (box7.contains(theGame[i][j])){
		    // System.out.println("false");
			return false;}
	       else{
		   box7.add(theGame[i][j]);}}
	    }}
	Vector box8 =  new Vector<Integer>();
	for (int i=3; i<6;i++){
	    for (int j=6; j<9;j++){
		if (theGame[i][j]!=0){
	       	if (box8.contains(theGame[i][j])){
		    //System.out.println("false");
			return false;}
	       else{
		   box8.add(theGame[i][j]);}}
	    }}
	 Vector box9 =  new Vector<Integer>();
       	for (int i=6; i<9;i++){
	    for (int j=6; j<9;j++){
		if (theGame[i][j]!=0){
	       	if (box9.contains(theGame[i][j])){
		    // System.out.println("false");
			return false;}
	       else{
		   box9.add(theGame[i][j]);}}
	    }}
	return true;}}