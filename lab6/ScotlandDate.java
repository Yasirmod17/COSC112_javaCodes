
public class ScotlandDate extends GregorianDate {

    public ScotlandDate(String month, int day, int year) {
	super( month,  day, year);
       
    }
    public boolean isLeap(){
	if (getYear()<1752 && getYear()>1599){
	    if (getYear()%4==0){
		return true;}
	    else{
		return false;}}
	else if (getYear()<1600){
	    if ((getYear()+1)%4==0){
		return true;}
	    else{
		return false;}}
	else{
	    if (getYear()%400 ==0 || (getYear()%100!=0 && getYear()%4 ==0)){
		return true;
	    }
	    else{
		return false;}}}

    public boolean isChangedForSpecialDay(){ 
	if (getDay()==2 && getMonth()==9 && getYear()==1752){
	    setDay(getDay()+13);
	   return true;
		}

       	else if ((getDay()==24)&& (getMonth()==3)&&(getYear()<1600)){
	    setDay(getDay()+1);
	    setYear(getYear()+1);
		return true;
	        }
       	else if ((getDay()==31)&& (getMonth()==12)&&(getYear()>=1600)){
	    setMonth(1);
	    setDay(1);
	    setYear(getYear()+1);
		    return true;
		}
	/*	else if ((getDay()==getDaysInMonth()[getMonth()])&&(getMonth()!=12)){
	    setDay(1);
	    setMonth(getMonth()+1);
		    return true;
		    }*/
	else {
		    return false;
	}}
      public boolean isLastDay() {
	  if(getYear()<1600&& getMonth()==3 && getDay()==24){
	      setDay(getDay()+1);
	      setYear( getYear()+1);
	      return true;
	  }
	  else if (getYear()>=1600 && getMonth()==12 && getDay()==31){
	      return true;}
	  else return false;
      }


}
