public class CS112DateObject {

    // These are instance fields - each instance of CS112DateObject has
    // its own set

    private int day;
    private int year;
    private int month; //January = 1
    private String location;
        
    // you might find this array helpful

    private String[] months = {"January","February","March","April",
			       "May","June","July","August","September",
			       "October","November","December"};
    private String[] locations={"gregorian", "Spain", "Scotland"};
    /*
     * Note: You must store the month as an int, and January must be 1
     * If you want to store the String month as well, you must be sure
     * that when the program changes one, it also changes the other.
     * */

    public CS112DateObject(String m, int d, int y, String l) {
	setDate(m,d,y,l);
    }
	
    public void setDay(int d) {
	day = d;
    }

    public void setMonth(String m) {
	if(m.equals(months[0])){
	    month=1;
	}
	if (m.equals(months[1])){
	    month=2;
	}
	if (m.equals(months[2])){
	    month=3;
	}
	if( m.equals(months[3])){
	    month=4;
	}
	if(m.equals(months[4])){
	    month=5;
	}
	if (m.equals(months[5])){
	    month=6;
	}
	if( m.equals(months[6])) {
	    month=7;
	}
	if( m.equals(months[7])){
	    month=8;
	}
	if (m.equals(months[8])){
	    month=9;
	}
	if (m.equals(months[9])){
	    month=10;
	}
	if( m.equals(months[10])){
	    month=11;
	}
	if( m.equals(months[11])){
	    month=12;
	}
    }

    public void setYear(int y) {
	year = y;
    }

    public void setDate(String month, int day, int year,String location) {
	setMonth(month);
	setDay(day);
	setYear(year);		
	this.location = location;
    }
    public String toString(){
	return month+"/"+day+"/"+year;
    }
    public boolean leapYear(){
	if (location.equals("gregorian")){
	    if ((year%400==0) && (year%4==0)&& (year%100 !=0)){
		return true;
	    }
	    else{
		return false;
	    }}
	    else if (location.equals("spain")){
		return leapYearSpanish();}
	    else{
		return leapYearScottish();}
	}
    public int daysInMonth(){
	if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
	    return 31;
	}
	else if ((month==9)||(month==4)||(month==6)||(month==11)){
	    return 30;
	}
	else if ((month==2)&&(leapYear()==true)){
	    return 29;
	}
	else{
	    return 28;
	}
    }
    public void makeTomorrow(){
	if (location.equals("gregorian")){
		if ((day==daysInMonth())&& (month==12)){
		    month=1;
		    day=1;
		    year+=1;
		}
		else if ((day==daysInMonth())&& (month!=12)){
		    month+=1;
		    day=1;
		}
		else {
		    day+=1;
		}}
	    else if(location.equals("spain")){
		makeTomorrowSpain();}
	    else{
		makeTomorrowScotland();}}


    public String makeTomorrow(int n){
	for(int i=0; i<n;i++){
	    makeTomorrow();
	}
	return toString();
    } 
    public CS112DateObject generateCopy(){
	int newyear=year;
	int  newmonth=month;
	int newday=day;
	String newlocation=location;
	CS112DateObject copy= new CS112DateObject(months[newmonth-1],newday,newyear,newlocation);
	return copy;
    }
    public boolean SameDate(CS112DateObject copy){
	if ((this.month==copy.month)&& (this.day==copy.day)&&(this.year==copy.year)){
	    return true;
	}
        else{
	    return false;
	}}
    public CS112DateObject generateTomorrow(){
	CS112DateObject n = this.generateCopy();
        n.makeTomorrow();
	return n;
    }
    public void setLocation(String l){
	location = l;
    }

    public String getLocation(){
	return location;
	    
    }

    public void makeTomorrowSpain(){
	if (day==4 && month==10 && year==1582){
	    day+=11;}
	else if ((day==daysInMonth())&& (month==12)&&(year<1556)){
		month=3;
		day=25;
		year+=1;
	    }
	else if ((day==daysInMonth())&& (month==12)&&(year>=1556)){
		    month=1;
		    day=1;
		    year+=1;
		}
		else if ((day==daysInMonth())&&(month!=12)){
		    month+=1;
		    day=1;
		}
		else {
		    day+=1;
		}
		//  return toString();
    }
    public  boolean leapYearSpanish(){
	if (year<1582){
	    if (year%4==0){
		return true;}
	    else {
		return false;}}
	else{
	    if ((year%400==0) && (year%4==0)&& (year%100 !=0)){
		return true;
	    }
	    else{
		return false;}}}
    public void makeTomorrowScotland(){
	if (day==2 && month==9 && year==1752){
	   day+=13;}
	//	else if ((day==daysInMonth())&& (month==12)&&(year<1600)){
	//	month=3;
	//	day=25;
	//	year+=1;
	//  }
       	else if ((day==24)&& (month==3)&&(year<1600)){
		day+=1;
		year+=1;
	        }
       	else if ((day==daysInMonth())&& (month==12)&&(year>=1600)){
		    month=1;
		    day=1;
		    year+=1;
		}
	else if ((day==daysInMonth())&&(month!=12)){
		    day=1;
		    month+=1;
		}
	else {
		    day+=1;
		}
		
    }
    public boolean leapYearScottish(){
	if (year<1752 && year>1599){
	    if (year%4==0){
		return true;}
	    else{
		return false;}}
	else if (year<1600){
	    if ((year+1)%4==0){
		return true;}
	    else{
		return false;}}
	else{
	    if ((year%400==0) && (year%4==0)&& (year%100 !=0)){
		return true;
	    }
	    else{
		return false;}}}}