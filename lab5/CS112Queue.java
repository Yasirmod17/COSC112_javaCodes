
public class CS112Queue {
//Authors :Mohammed Ibrahim and Harrison Marick
	
	private int[] theQ;
	private int front;
	private int back;
	private int count;
	
	public CS112Queue(int n) {
		theQ = new int[n];
		front = 0;
		back = -1;
		count = 0;
	}
    //  public void setLocation(int counter){
    //	counter=count;
    // }

    public int getCount(){
	return count;
    }
    public int[] getQueue(){
	return theQ;
    }
    public void shiftBack(){
	 if (front!=0){
	     for(int i=0; front+i<=back;i++){
	   
		 theQ[i]=theQ[front+i];}
	     for (int j=back;j<theQ.length;j++){
		 theQ[j]=0;}
		 
		 back=front+1;
	     front=0;
	     // back=(theQ.length-1);
}
}
       public void wrapAroundQueue(){
	   
	    for (int i=0;i<theQ.length;i++){
		if (theQ[i]==0){
		    back=i;
		    break;} }	
	   
       }
	public void writeQueue() {
		/* this method should write ony the actual elements in the queue, starting
		 * with the element in the front and ending with the last element.  
		 * It should NOT write all the elements in the array,
		 */
	     System.out.println("The elements in your Queue are:");
	    for (int i=front;i<=back;i++){
		System.out.println(theQ[i]);}
	}
	
	public void writeArray() {
		System.out.println("___________ Writing Queue Info_______");
		System.out.println("front+ "+front);
		System.out.println("back + "+back);
		System.out.println("count+ "+count);

		for (int i=0; i<theQ.length;i++)
			System.out.print(theQ[i]+" ");
		System.out.println();
		System.out.println("_____________________________________________");
		System.out.println();

	}
	
	public void add(int j) {
	        if (full()){
		    expand2(j);}
        	else if (bumped()){
		    //	shiftBack();
		    wrapAroundQueue();
		    //	back = back+1;
		theQ[back] = j;}
		
		else{
		    back+=1;
		    theQ[back]=j;}
		count = count+1;	
	}
	
  

    	private void expand(int k) {
	    	int[] newQ = new int[theQ.length*2];
	   int  front2=front;
		int i=0;
		while (front2!=back){
		    newQ[i]=theQ[front2];
		    front2++;
		    if (front2==count){
			front2=0;}
		    i++;}
		newQ[i]=theQ[back];
		theQ=newQ;
		front=0;
		back=count;
		    theQ[back]=k;
	}
   
       	private void expand2(int k){
       	  int[] newQ = new int[theQ.length*2];
          for(int i=0; i<=front; i++){
		  if (front+i>=count){
	       	     for(int j=0; j<front;j++){
       			    newQ[i+j]=theQ[j];}}
			  else{ newQ[i]=theQ[front+i];}}
	     theQ=newQ;
	     front=0;
	     back=count;
	     theQ[back]=k;
}
			    

	private boolean bumped() {
		return back == theQ.length-1;
	}

	private boolean full() {
		return count == theQ.length;
	}

	public int remove()  {
	    if (empty()) {
			return -978;
		}
	     if (front==theQ.length){
		 //	System.out.println("hey");
		front=0 ;
	       	int toR = theQ[front];
		theQ[front]=0;
		front+=1;
		count-=1;
		    return toR;
}
	     else  {
			int toR = theQ[front];
			theQ[front]=0;
			front = front + 1;
			count = count - 1;
		       	return toR;
		}
	     //	return toR		
	}

	private boolean empty() {
		return count == 0;
	}
}
