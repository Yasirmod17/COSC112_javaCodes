import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class List {

	private Node first;
	private Node last;
	
	public void add(String s) {
	    if (first == null){
			first = new Node(s);
			last=first;}
		else{ last.add(s);
		    last=last.getNext();}
		
	}
	
	public int length() {
	    System.out.println(first.getName());
	    return  first.length();
	  
	}
	
	public int howMany(String find) {
	   return first.howMany(find);
	 
	}

	public void addFile(String fileName) {
		
	    File f=new File(fileName);
	    Scanner sc=null;
	    try{
		sc=new Scanner(f);
	    }
	    catch (FileNotFoundException e){
		e.printStackTrace();
		System.out.println("File "+ fileName+ " doesn't exist");
		System.exit(1);
		
	    }
	    while (sc.hasNext()!=false){
		add(sc.next());
	    }
}
    /*   public void LastField(){
	Node temp=first;
	    boolean going=true;
	while (going==true){
	    if (temp.next==null){
		    last=temp;
		    going=false;
		}
	    temp=temp.getNext();
	}
	}*/
    public void insertNth(int where, String newString){
	first.insert(where,newString);}
	
    public Node getFirst(){
	return first;
    }
    public void sortedInsert(String toInsert){
	if ((first==null)||(toInsert.compareTo(last.getName())>0)){
	    this.add(toInsert);}
	else  if(toInsert.compareTo(first.getName())<0){
	    // System.out.println(first.getName());
	    Node newI=new Node(toInsert);
	    newI.setNext(first);
	    first=newI;}
	    //  this.insert(0,toInsert);}

	//	else if){
	//  System.out.println(last.getName());
	    //  last.setNext(new Node(toInsert));
	    //last=last.getNext();
	//  this.add(toInsert);

		
         else{
		first.sortedInsert(toInsert);}
    }

    public List insertSort(){
	List newL=new List();
	Node newNode=this.first;
	while (newNode!=null){
	    
	    newL.sortedInsert(newNode.getName());
	     newNode=newNode.getNext();
}
       	//newL.first.sortedInsert(newNode.getName());
    return newL;}

}
