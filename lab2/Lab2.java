import java.util.Scanner;
import java.util.*;
//Author: Mohammed Ibrahim Yasir
       public class Lab2 {


	public static void main(String[] args) {
		new Lab2().go();
	}

	private Scanner keyboard = new Scanner(System.in);

	public void go() {
	    System.out.println("Enter an avenue");
	    String avenue = readAvenue();
		if(avenue.equals("STOP")){
		    System.out.println("Bye! That was fun!!!");
			}
		else{
		int house = readHouseNumber();
		System.out.println("That number is near "+crossStreet(house,avenue));
		go();
		}
	}


	public int readHouseNumber() {
	    System.out.println("Enter a house number");
  	    int h= keyboard.nextInt();

	    for (int i=0; i>=h;){
		System.out.println("Please enter a valid Number");
		h = keyboard.nextInt();
	    }

	    return h;
	}
	    // while (a<0){
	    //	     System.out.println("enter a house number");
	    //	     int a=keyboard.nextInt();
		// readHouseNumber();
	    
	   //}

	public String readAvenue() {
     
	    String[] avenues={"1st","2nd","3rd","4th","5th","6th","7th","8th","10th","Lexington","Amsterdam","Madison","Park","STOP"}; 
	    String ave= keyboard.next();
       
	    for (int i=0;i<avenues.length;i++){
		if(ave.equals(avenues[i])){
			return ave;
		}}
	      
  
	    System.out.println("Please enter a valid avenue name");
	   return  readAvenue();
		}

	public int crossStreet(int house, String ave) {
	    int b=house/10;
		int a=b/2;
		if (ave.equals("1st")){
		    a+=3;
		}
		else if (ave.equals("2nd")){
			a+=3;
		    }
	        else if (ave.equals("3rd")||  ave.equals("8th")){
		    a+=10;
			}
		else if (ave.equals("4th")){
		     a+=8;
			}		 
		else if (ave.equals("6th")){
		     a-=12;
			}
		 else if (ave.equals("7th")){
		     a+=12;
			 }
		 else if (ave.equals("10th")){
		     a+=14;
			 }
		 else if (ave.equals("Amsterdam")){
		     a+=60;
			 }
		 else if (ave.equals("Lexington")){
		     a+=22;
			 }
		 else if (ave.equals("Madison")){
		     a+=26;
		 }		   
		 else if(ave.equals("Park")){
		     a+=35;
		 }
		 else if (ave.equals("5th")){
		     a= fifthAvenueAlgo(house,ave);
			 }
		  return a;
  }

    public int fifthAvenueAlgo(int house, String ave){
	int b= house/10;
	int a=b/2;
	if (house<=200){
	    a+=13;
	}
	else if (200<house && house<=400){
	    a+=16;
	}
	else if (400<house && house<=600){
	    a+=18;
	}
	else if (600<house && house<=775){
	    a+=20;
	}
	else if (775<house && house<=1286){
	    int k=house/10;
	   k-=18;
	   a=k;
	}
	else if (1286<house && house<=1500){
	    a+=45;
	}
	else if (house>1500){
	    a+=24;
	}
	return a;
    }}