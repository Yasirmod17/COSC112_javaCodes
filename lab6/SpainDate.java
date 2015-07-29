
public class SpainDate extends GregorianDate {

    public SpainDate(String month, int day, int year) {
	super( month,  day, year);
    }
     public  boolean isLeap(){
	 if (getYear()<1582){
	     if (getYear()%4==0){
		return true;}
	    else {
		return false;}}
	else{
	    if (getYear()%400 ==0 || (getYear()%100!=0 && getYear()%4 ==0)){
		return true;
	    }
	    else{
		return false;}}}
    public boolean isChangedForSpecialDay(){
	if (getDay()==4 && getMonth()==10 && getYear()==1582){
	    setDay(getDay()+11);
	    return true;
	}
	else if ((getDay()==getDaysInMonth()[getMonth()])&& (getMonth()==12)&&(getYear()<1556)){
	    setMonth(3);
	    setDay(25);
	    setYear(getYear()+1);
		return true;
	    }
	else if ((getDay()==getDaysInMonth()[getMonth()])&& (getMonth()==12)&&(getYear()>=1556)){
	        setMonth(1);
         	setDay(1);
		setYear(getYear()+1);
		    return true;
		}
	/*	else if ((getDay()==getDaysInMonth()[getMonth()])&&(getMonth()!=12)){
               setMonth(getMonth()+1);
               setDay(1);
		    return true;
		    }*/
      else {
		    return false;

		}}
    public boolean isLastDay() {
	if(getYear()<1556 && getMonth()==12 && getDay()==31){
	    setYear(getYear()+1);
	    setMonth(3);
	    setDay(24);
	    return true;
	}
	else if (getYear()>=1600 && getMonth()==12 && getDay()==31){
	    return true;}
	else return false;}
	    
	

}
