public class UseDate {

	public static void main(String[] args) {

	    CS112DateObject day1 = new CS112DateObject("December",30, 1600,"gregorian");
		
		System.out.println("Your first date is: "+day1);
		System.out.println("The leap year test returns: "+ day1.leapYear());
		System.out.println("The number of days in the month are: "+ day1.daysInMonth());
		System.out.println("12 Days after your day is: "+day1.makeTomorrow(12));
		System.out.println("A copy of your date is: "+day1.generateCopy());
		System.out.println("The test of both objects returns: "+day1.SameDate(day1.generateCopy()));
      		System.out.println("The nextday of the copy is: " + day1.generateTomorrow());
		System.out.println("");
	  
	   CS112DateObject day2= new CS112DateObject("October",4,1582,"spain");
	      	System.out.println("Your second date is: "+day2);
		System.out.println("The leap year test returns: "+ day2.leapYear());
		System.out.println("The number of days in the month are: "+ day2.daysInMonth());
		System.out.println("12 Days after your day is: "+day2.makeTomorrow(12));
	       	System.out.println("");
	
       	CS112DateObject day3= new CS112DateObject("March",24,1500,"scotland");
	       	System.out.println("Your third date is: "+day3);
		System.out.println("The leap year test returns: "+ day3.leapYear());
		System.out.println("The number of days in the month are: "+ day3.daysInMonth());
		System.out.println("12 Days after your day is: "+day3.makeTomorrow(12));
		System.out.println("");
	}


}
