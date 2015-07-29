import java.util.Scanner;
/* 1. Daniel mariselli
 
 */
public class Lab1 {

	public static void main(String[] args) {
		new Lab1().go();

	}

	
	Scanner keyboard = new Scanner(System.in);
	

	
	/*
	def go() {
	    anumber = int(input());
	    print(quartsToPints(anumber))
	}
*/

	
    public void go() {
	System.out.println("Please enter a number");
	int anumber = Integer.parseInt(keyboard.next());
	System.out.println(anumber+" quarts gives "+quartsToPints(anumber)+" pints");
	System.out.println(anumber+" pints gives "+pintsToCups(anumber)+" cups");
	System.out.println(anumber+" feet gives "+footToInches(anumber)+" inches");
	System.out.println(anumber+" yards gives "+yardToFeet(anumber)+" feets");
	System.out.println(anumber+" furlongs gives "+furlongToYard(anumber)+" yards");
	System.out.println(anumber+" quarts gives "+ quartsToCups(anumber)+" cups");
	System.out.println(anumber+" furlongs gives "+ furlongsToFeet(anumber)+" feets");
        System.out.println(anumber+" miles gives "+ milesToInches(anumber)+" inches");
    }
    
    /*
      def quartsToPints(q):
      return q*2
    */
    
    
    public int quartsToPints(int q) {
	return q*2;
    }
    public int pintsToCups(int p){
	return p*2 ;
    }
    public int footToInches(int foot){
	return foot*12;
    }
    public int yardToFeet(int yard){
	return yard*3;
    }
    public int furlongToYard(int furlong){
	return furlong*220;
    }
    public int mileToFurlong(int mile){
	return mile*8;
    }
    public int quartsToCups(int p){
	return pintsToCups(quartsToPints(p));
    }
    public int furlongsToFeet(int f){
	return yardToFeet(furlongToYard(f));
    }
    public int milesToInches(int m){
	return footToInches(furlongsToFeet(mileToFurlong(m)));
    }
    /*
      def pintsToCups(pints): 
      cups = pints * 2
      return cups
    */
    
    
    
    /*
      public int quartsToCups(int quarts) {}
      return pintsToCups(quartsToPints(quarts));
      }
    */
}
