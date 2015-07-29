import java.util.Vector;



public class  MyList implements ListInterface {
    // public Vector  myList;
   private  Vector<Character> myList=new Vector<Character>();
   

public void addElement(Character a){
    myList.add(a);
}

public void printList(){
    for (int i=0;i<myList.size();i++){
	System.out.print(myList.elementAt(i));
    }
    System.out.println();
}

public void reverseList(){
    Vector<Character> reverse=new Vector<Character>();
    for (int i=myList.size()-1;i>=0;i--){
	reverse.addElement(myList.elementAt(i));
   
	//	System.out.print(this.myList.elementAt(i));
    }
    myList=reverse;
}

public int count(char ch){
    int counter=0;
    for (int i=0;i<myList.size();i++){
	if (myList.elementAt(i).equals(ch)){
	     counter+=1;
	 }
     }
    return counter;
}}