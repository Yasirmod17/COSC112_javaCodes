import java.util.Scanner;


public class TestDate {

    public static void main(String[] args) {
		
	new TestDate().go();
    }

    private void go() {
	String tests = "March 24 1500 Scotland " +
	    "February 28 2000 Spain " +
	    "February 29 2000 Spain " +
	    "February 28 1999 Gregorian " +
	    "February 28 1999 Scotland " +
	    "March 31 1988 Gregorian " +
	    "April 30 2103 Gregorian " +
	    "May 15 1599 Gregorian " +
	    "June 12 1600 Gregorian " +
	    "October 31 1642 Scotland " +
	    "December 13 2001 Gregorian ";
		
	Scanner sc = new Scanner(tests);
		
	DateFactory df = new DateFactory();
		
	while (sc.hasNext()) {
	    String month = sc.next();
	    int day = sc.nextInt();
	    int year = sc.nextInt();
	    String location = sc.next();
			
	    GregorianDate gd = df.createDate(month,day,year,location);
	    System.out.println();
	    System.out.println(gd);
	    gd.makeTomorrow();
	    System.out.println(gd);
			
	}
    }
	
}

