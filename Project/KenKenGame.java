import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;


public class KenKenGame extends ConsGame{
  private boolean win=false;
   public  Vector<Spot> unsetSpots=new Vector<Spot>();
    public int[] possibleV={1,2,3,4};
    private int[][] kenGame;
    //  public  Vector<Spot> unsetSpots=new Vector<Spot>();
    //  public boolean zeroCount=true;

    public KenKenGame(){
	kenGame=new int[4][4];
	labelGame();
	numberOfUnsetSpots();
    }
    public int numberAtSpot(int i,int j){
	return kenGame[i][j];}
  public boolean getWin(){
	this.Check();
	return this.win;
    }
    public boolean zeroCounter(){
       	for (int i=0; i<4;i++){
	    for (int j=0; j<4;j++){
		if (kenGame[i][j]==0){
		    return false;}}}
	return true;}
	
  public void labelGame(){
      kenGame=new int[][]{{0,0,0,0},
			  {0,0,0,0},
			  {0,0,0,0},
			  {0,0,0,0}
      };}
    public void numberOfUnsetSpots(){
       	for (int i=0; i<4;i++){
	    for (int j=0; j<4;j++){
		if (kenGame[i][j]==0){
		   unsetSpots.add(new Spot(i,j));
		  }}}}
    public void writeBoard(){
	for (int i=0; i<kenGame.length;i++){
	    for(int j=0; j<4;j++){
		System.out.print(kenGame[i][j]+" ");}
	    System.out.println();}}
    public void add(int i,int j,int k){
	kenGame[i][j]=k;}


    public boolean checkHorizontal(){
	for (int i=0; i<4; i++){
	    	Vector numbers =  new Vector<Integer>();
	    for (int j=0;j<4;j++){
		if(kenGame[i][j]!=0){
		if (numbers.contains(kenGame[i][j])){//||numbers.contains(0)){
		    //  System.out.println("false");
			return false;}
	       else{
		   numbers.add(kenGame[i][j]);}}
		
	    
		}}return true;}

    public boolean checkVertical(){
       	for (int i=0; i<4; i++){
      	Vector numbers =  new Vector<Integer>();
	    for (int j=0;j<4;j++){
		if (kenGame[j][i]!=0){
		if (numbers.contains(kenGame[j][i])){//|| numbers.contains(0)){
			return false;}
	       else{
		   numbers.add(kenGame[j][i]);}}
		
	    
	
	    }}return true;}

  public boolean Check(){
      if(checkVertical()==true && checkHorizontal()==true && boxConstraint()==true){
		    //	      System.out.println("true");
		   this.win=true;
		   return true;
}
		else{
		   this.win= false;
		   return false;
		}}


    public boolean boxConstraint(){
		if (kenGame[0][0]!=0 && kenGame[1][0]!=0){
	    if((kenGame[0][0]-kenGame[1][0])!=1 && (kenGame[0][0]-kenGame[1][0])!=-1){
		//	System.out.println("me"); 
		return false;}
		}
	if((kenGame[2][0]!=0 && kenGame[3][0]!=0)){
		if((kenGame[2][0]-kenGame[3][0]!=3)&&(kenGame[2][0]-kenGame[3][0])!=-3){
		    //    System.out.println("me1");
	    return false;}}
       if((kenGame[0][1]!=0 && kenGame[1][1]!=0)){
	    if((kenGame[0][1]-kenGame[1][1]!=1)&&(kenGame[0][1]-kenGame[1][1])!=-1){
		//	System.out.println("me2");
		return false;
}}
      if(kenGame[2][1]!=0 && kenGame[3][1]!=0){
        	if ((kenGame[2][1]/kenGame[3][1])!=2&&(kenGame[3][1]/kenGame[2][1])!=2){
		    //   System.out.println("me3");
return false;}}
      if(kenGame[0][2]!=0 && kenGame[0][3]!=0){
        	if((kenGame[0][2]/kenGame[0][3])!=2&&(kenGame[0][3]-kenGame[0][2])!=2){
		    //  System.out.println("me4");
 return false;}}
      if((kenGame[1][2]!=0 && kenGame[2][2]!=0)){
        	if((kenGame[1][2]+kenGame[2][2])!=5){
		    //    System.out.println("me5");
	    return false;}}
      if (kenGame[3][2]!=0 && kenGame[3][3]!=0){
	         if((kenGame[3][2]*kenGame[3][3])!=6){
		     //   System.out.println("me6");
	    return false;}}
      if((kenGame[1][3]!=0 && kenGame[2][3]!=0)){
	  if ((kenGame[1][3]+kenGame[2][3]!=7)){
	      //  System.out.println("me7");
	  return false;}}
      return true;
    }
}